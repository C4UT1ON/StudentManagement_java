/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import Student.Entities.ContactDetails;
import Student.Entities.Email;
import Student.Entities.PhoneNumber;
import Student.Entities.Student;
import Student.Forms.Read.ViewStudentForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RICK
 */
public class Queries {

    public static boolean insertRecord(Student stud) {

        Connection insertRecordConnection = null;
        String studentInsert = "INSERT INTO student(studentId, firstName, lastName, gender)" + "VALUES(?,?,?,?)";
        String studentEmailInsert = "INSERT INTO studentemail(student_studentId, studentEmail)" + "VALUES(?,?)";
        String studentNumberInsert = "INSERT INTO studentnumber(student_studentId, studentNumber, numberType)" + "VALUES(?,?,?)";
        String studentAddressInsert = "INSERT INTO studentaddress(student_studentId, streetLine1, streetLine2, city, parish)" + "VALUES(?,?,?,?,?)";
        //Making query strings

        try {
            insertRecordConnection = DbConnection.getConnection();
            insertRecordConnection.setAutoCommit(false);

            PreparedStatement studentStmt = insertRecordConnection.prepareStatement(studentInsert);
            PreparedStatement studentEmailStmt = insertRecordConnection.prepareStatement(studentEmailInsert);
            PreparedStatement studentNumberStmt = insertRecordConnection.prepareStatement(studentNumberInsert);
            PreparedStatement studentAddressStmt = insertRecordConnection.prepareStatement(studentAddressInsert);

            studentStmt.setString(1, stud.getStudentID());
            studentStmt.setString(2, stud.getFirstName());
            studentStmt.setString(3, stud.getLastName());
            studentStmt.setString(4, stud.getGender());
            studentStmt.executeUpdate();

            studentAddressStmt.setString(1, stud.getStudentID());
            studentAddressStmt.setString(2, stud.getStudentDetails().getStreetLine1());
            studentAddressStmt.setString(3, stud.getStudentDetails().getStreetLine2());
            studentAddressStmt.setString(4, stud.getStudentDetails().getCity());
            studentAddressStmt.setString(5, stud.getStudentDetails().getParish());
            studentAddressStmt.executeUpdate();

            for (int i = 0; i < stud.getStudentDetails().getEmailList().size(); i += 1) {
                studentEmailStmt.setString(1, stud.getStudentID());
                studentEmailStmt.setString(2, stud.getStudentDetails().getEmailList().get(i).getEmailAddress());
                studentEmailStmt.executeUpdate();
            }

            for (int i = 0; i < stud.getStudentDetails().getNumberList().size(); i += 1) {
                studentNumberStmt.setString(1, stud.getStudentID());
                studentNumberStmt.setString(2, stud.getStudentDetails().getNumberList().get(i).getNumber());
                studentNumberStmt.setString(3, stud.getStudentDetails().getNumberList().get(i).getNumberType());
                studentNumberStmt.executeUpdate();
            }

            insertRecordConnection.commit();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            try {
                insertRecordConnection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex1);
                JOptionPane.showMessageDialog(null, ex);
            }
            return false;
        } finally {
            try {
                insertRecordConnection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }

    public static ResultSet viewAllRecords() {
        Connection viewRecordsConnection = null;
        String getRecords = "SELECT studentId, lastName, firstName FROM student ORDER BY lastName";
        try {
            viewRecordsConnection = DbConnection.getConnection();
            PreparedStatement getRecordsStmt = viewRecordsConnection.prepareStatement(getRecords, 0, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = getRecordsStmt.executeQuery();
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }

    public static void deleteRecord(int rowIndex, ResultSet dataSet) {
        Connection deleteConnection = null;

        try {

            dataSet.absolute(++rowIndex);
            dataSet.deleteRow();

        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Student getStudentRecord(int rowIndex, ResultSet dataSet) {

        Connection getStudentConnection = null;
        String getStudent = "SELECT * FROM student WHERE studentId = ?";
        String getStudentAddress = "SELECT * FROM studentaddress WHERE student_studentId = ?";
        String getStudentEmail = "SELECT * FROM studentemail WHERE student_studentId = ?";
        String getStudentNumber = "SELECT * FROM studentnumber WHERE student_studentId = ?";
        String studentId;

        try {
            getStudentConnection = DbConnection.getConnection();
            if (rowIndex >= 0) {
                dataSet.absolute(rowIndex + 1);
                studentId = dataSet.getString(1);

                PreparedStatement getStudentStmt = getStudentConnection.prepareStatement(getStudent);
                PreparedStatement getStudentAddressStmt = getStudentConnection.prepareStatement(getStudentAddress);
                PreparedStatement getStudentEmailStmt = getStudentConnection.prepareStatement(getStudentEmail);
                PreparedStatement getStudentNumberStmt = getStudentConnection.prepareStatement(getStudentNumber);

                getStudentStmt.setString(1, studentId);
                getStudentAddressStmt.setString(1, studentId);
                getStudentEmailStmt.setString(1, studentId);
                getStudentNumberStmt.setString(1, studentId);

                ResultSet studentRS = getStudentStmt.executeQuery();
                ResultSet addressRS = getStudentAddressStmt.executeQuery();
                ResultSet emailRS = getStudentEmailStmt.executeQuery();
                ResultSet numberRS = getStudentNumberStmt.executeQuery();

                Student stud = new Student();
                ContactDetails studentDetails = new ContactDetails();
                stud.setStudentDetails(studentDetails);
                ArrayList<PhoneNumber> nList = new ArrayList<>();
                ArrayList<Email> eList = new ArrayList<>();
                studentDetails.setNumberList(nList);
                studentDetails.setEmailList(eList);

                studentRS.absolute(1);
                stud.setStudentID(studentRS.getString(1));
                stud.setFirstName(studentRS.getString(2));
                stud.setLastName(studentRS.getString(3));
                stud.setGender(studentRS.getString(4));

                if (studentRS.getString(4).equals("Male")) {
                    stud.setGender("Male");
                } else if(studentRS.getString(3).equals("Female")) {
                    stud.setGender("Female");
                }

                addressRS.absolute(1);
                studentDetails.setStreetLine1(addressRS.getString(2));
                studentDetails.setStreetLine2(addressRS.getString(3));
                studentDetails.setCity(addressRS.getString(4));
                studentDetails.setParish(addressRS.getString(5));

                emailRS.beforeFirst();
                while (emailRS.next()) {
                    Email newEmail = new Email();
                    newEmail.setEmailAddress(emailRS.getString(2));
                    eList.add(newEmail);

                }

                numberRS.beforeFirst();
                while (numberRS.next()) {
                    PhoneNumber newNumber = new PhoneNumber();
                    newNumber.setNumber(numberRS.getString(2));
                    newNumber.setNumberType(numberRS.getString(3));
                    nList.add(newNumber);
                }
                return stud;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return null;
    }

    public static boolean editRecord(Student stud, ViewStudentForm viewStudent) {

        Connection updateRecordConnection = null;
        String studentUpdate = "UPDATE student SET studentId =?, firstName =?, lastName=?, gender=? WHERE studentId= ?";
        String studentEmailUpdate = "UPDATE studentemail SET studentEmail=? WHERE student_studentId=?";
        String studentNumberUpdate = "UPDATE studentnumber SET studentNumber=?, numberType=? WHERE student_studentId=?";
        String studentAddressUpdate = "UPDATE studentaddress SET streetLine1=?, streetLine2=?, city=?, parish=? WHERE student_studentId=?";
        String studentEmailDelete = "DELETE FROM studentemail WHERE student_studentId= ?";
        String studentNumberDelete = "DELETE FROM studentnumber WHERE student_studentId= ?";

        try {
            updateRecordConnection = DbConnection.getConnection();
            updateRecordConnection.setAutoCommit(false);

            PreparedStatement updateStudentStmt = updateRecordConnection.prepareStatement(studentUpdate);
            PreparedStatement updateStudentEmailStmt = updateRecordConnection.prepareStatement(studentEmailUpdate);
            PreparedStatement updateStudentNumberStmt = updateRecordConnection.prepareStatement(studentNumberUpdate);
            PreparedStatement updateStudentAddressStmt = updateRecordConnection.prepareStatement(studentAddressUpdate);
            PreparedStatement deleteStudentEmailStmt = updateRecordConnection.prepareStatement(studentEmailDelete);
            PreparedStatement deleteStudentNumberStmt = updateRecordConnection.prepareStatement(studentNumberDelete);

            updateStudentStmt.setString(1, viewStudent.getStudentIDTextField_view().getText());
            updateStudentStmt.setString(2, viewStudent.getfirstNameTextField_view().getText());
            updateStudentStmt.setString(3, viewStudent.getLastNameTextField_view().getText());
            updateStudentStmt.setString(4, viewStudent.getSelectedGender());
            updateStudentStmt.setString(5, stud.getStudentID());
            updateStudentStmt.executeUpdate();

            updateStudentAddressStmt.setString(1, viewStudent.getStreetLine1TextField_view().getText());
            updateStudentAddressStmt.setString(2, viewStudent.getStreetLine2TextField_view().getText());
            updateStudentAddressStmt.setString(3, viewStudent.getCityTextField_view().getText());
            updateStudentAddressStmt.setString(4, viewStudent.getParishTextField_view().getText());
            updateStudentAddressStmt.setString(5, stud.getStudentID());
            updateStudentAddressStmt.executeUpdate();

            deleteStudentEmailStmt.setString(1, stud.getStudentID());
            deleteStudentEmailStmt.executeUpdate();
            for (Email i : viewStudent.getEList()) {

                updateStudentEmailStmt.setString(1, i.getEmailAddress());
                updateStudentEmailStmt.setString(2, stud.getStudentID());
                updateStudentEmailStmt.executeUpdate();
            }

            deleteStudentNumberStmt.setString(1, stud.getStudentID());
            deleteStudentNumberStmt.executeUpdate();
            for (PhoneNumber i : viewStudent.getNList()) {

                updateStudentNumberStmt.setString(1, i.getNumber());
                updateStudentNumberStmt.setString(2, i.getNumberType());
                updateStudentNumberStmt.setString(3, stud.getStudentID());
                updateStudentNumberStmt.executeUpdate();
            }

            updateRecordConnection.commit();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
            try {
                updateRecordConnection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex1);
                JOptionPane.showMessageDialog(null, ex1);
            }
            return false;
        } finally {
            try {
                updateRecordConnection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Queries.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }

    }
}
