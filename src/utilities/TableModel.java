/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import Student.Entities.Email;
import Student.Entities.PhoneNumber;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rick_
 */
public class TableModel {
    
    
    public static DefaultTableModel getNumberTableModel(ArrayList<PhoneNumber> numberList){
        String col[] = { "Number", "Number Type"};
        DefaultTableModel myModel = new DefaultTableModel(col,0);
        
        for(PhoneNumber i:numberList){
            if(!(i == null)){
            Object[] dataSrc = {i.getNumber(),i.getNumberType()};
            myModel.addRow(dataSrc);
            }
        }
        return myModel;
    }
    
    public static DefaultTableModel getEmailTableModel (ArrayList<Email> emailList){
        String col[] = { "Email Address"};
        DefaultTableModel myModel = new DefaultTableModel(col,0);
        
        for(Email i:emailList){            
            Object[] dataSrc = {i.getEmailAddress()};
            myModel.addRow(dataSrc);
        }
        return myModel;
    }
    
    public static DefaultTableModel getStudentsTableModel(ResultSet tableData){
        int rowCount = 0;
        
        String col[] = { "Student Id", "Last Name", "First Name" };
        DefaultTableModel studentModel = new DefaultTableModel(col,0);
        
        
        try {
            while(tableData.next()){
                rowCount++;
            }   
        } 
        catch (SQLException ex) {
            Logger.getLogger(TableModel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        for(int i = 1; i <= rowCount; i++){
            try {
                tableData.absolute(i);
                int data1 = tableData.getInt(1);
                String data2 = tableData.getString(2);
                String data3 = tableData.getString(3);
                
                Object[] dataSrc = {data1,data2,data3};
                               
                studentModel.addRow(dataSrc);
                
                
            } 
            catch (SQLException ex) {
                Logger.getLogger(TableModel.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }        
        return studentModel;
    } 
}


        



    
    

