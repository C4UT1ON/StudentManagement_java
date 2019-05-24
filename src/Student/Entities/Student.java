/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.Entities;

/**
 *
 * @author RICK
 */
public class Student {
        
    private String studentID;
    private String firstName;
    private String lastName;
    private String gender;
 
    
    private ContactDetails studentDetails;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ContactDetails getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(ContactDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

}