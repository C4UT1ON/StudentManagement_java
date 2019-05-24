/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Rick_
 */
public class Validation {

    public static boolean isEmail(String email) {
        return email.matches("^(.+)@(.+)$");
    }

    public static boolean validate(JInternalFrame myFrame) {
        ArrayList<JTextField> errorList = new ArrayList<>();
        for (Component c : myFrame.getContentPane().getComponents()) {
            if (c instanceof JTextField) {
                Border defaultBorder = ((JTextField) c).getBorder();
                if (((JTextField) c).getText().trim().isEmpty()) {
                    errorList.add((JTextField) c);
                    ((JTextField) c).setBorder(BorderFactory.createLineBorder(Color.RED));
                }
                else{
                    ((JTextField) c).setBorder(defaultBorder);
                }
            }
            else if(c instanceof JPanel) {
                    for (Component d : ((JPanel) c).getComponents()) {
                        if (d instanceof JTextField) {
                            if (((JTextField) d).getText().trim().isEmpty()) {
                                if(!(d.getName().equals("Email Field"))){
                                    errorList.add((JTextField) d);
                                    ((JTextField) d).setBorder(BorderFactory.createLineBorder(Color.RED));
                                }
                                
                            }
                        }

                    }
                }
                
            }
        return errorList.isEmpty();
        }
    

//    private static boolean checkComponents(Component[] compList) {
//
//        
//        for (Component c : compList) {
//            if (c instanceof JTextField) {
//                if (((JTextField) c).getText().trim().isEmpty()) {
//                    errorList.add((JTextField) c);
//                }
//            }
//        }
//        for (JTextField field : errorList) {
//            field.setBorder(BorderFactory.createLineBorder(Color.RED));
//        }
//        return errorList.isEmpty();
//    }
    
    
}
