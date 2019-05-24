/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.Forms.Update;

/**
 *
 * @author RICK
 */
public class EditStudentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewEmployeeForm
     */
    public EditStudentForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup_edit = new javax.swing.ButtonGroup();
        studentIDLabel_edit = new javax.swing.JLabel();
        firstNameLabel_edit = new javax.swing.JLabel();
        lastNameLabel_edit = new javax.swing.JLabel();
        studentIDTextField_edit = new javax.swing.JTextField();
        firstNameTextField_edit = new javax.swing.JTextField();
        lastNameTextField_edit = new javax.swing.JTextField();
        genderPanel_edit = new javax.swing.JPanel();
        maleRadioButton_edit = new javax.swing.JRadioButton();
        femaleRadioButton_edit = new javax.swing.JRadioButton();
        contactDetailsPanel_edit = new javax.swing.JPanel();
        streetLine1Label_edit = new javax.swing.JLabel();
        streetLine2Label_edit = new javax.swing.JLabel();
        streetLine1TextField_edit = new javax.swing.JTextField();
        streetLine2TextField_edit = new javax.swing.JTextField();
        cityLabel_edit = new javax.swing.JLabel();
        parishLabel_edit = new javax.swing.JLabel();
        parishTextField_edit = new javax.swing.JTextField();
        cityTextField_edit = new javax.swing.JTextField();
        phoneNumberLabel_edit = new javax.swing.JLabel();
        phoneNumberTextField_new = new javax.swing.JTextField();
        numberTypeComboBox_new = new javax.swing.JComboBox<>();
        emailLabel_new = new javax.swing.JLabel();
        emailTextField_new = new javax.swing.JTextField();
        newPhoneNumberButton_new = new javax.swing.JButton();
        newEmailButton_new = new javax.swing.JButton();
        viewNumberButton_new = new javax.swing.JButton();
        viewEmailButton_new = new javax.swing.JButton();
        exitButton_edit = new javax.swing.JButton();
        saveStudentButton_edit = new javax.swing.JButton();
        deleteButton_edit = new javax.swing.JButton();

        studentIDLabel_edit.setText("ID#");

        firstNameLabel_edit.setText("First Name");

        lastNameLabel_edit.setText("Last Name");

        firstNameTextField_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextField_editActionPerformed(evt);
            }
        });

        genderButtonGroup_edit.add(maleRadioButton_edit);
        maleRadioButton_edit.setText("Male");

        genderButtonGroup_edit.add(femaleRadioButton_edit);
        femaleRadioButton_edit.setText("Female");

        javax.swing.GroupLayout genderPanel_editLayout = new javax.swing.GroupLayout(genderPanel_edit);
        genderPanel_edit.setLayout(genderPanel_editLayout);
        genderPanel_editLayout.setHorizontalGroup(
            genderPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanel_editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maleRadioButton_edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genderPanel_editLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(femaleRadioButton_edit)
                .addContainerGap())
        );
        genderPanel_editLayout.setVerticalGroup(
            genderPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanel_editLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maleRadioButton_edit)
                .addGap(18, 18, 18)
                .addComponent(femaleRadioButton_edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contactDetailsPanel_edit.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contact Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        streetLine1Label_edit.setText("Street Line 1");

        streetLine2Label_edit.setText("Street Line 2");

        streetLine1TextField_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetLine1TextField_editActionPerformed(evt);
            }
        });

        cityLabel_edit.setText("City");

        parishLabel_edit.setText("Parish");

        phoneNumberLabel_edit.setText("Telephone #");

        phoneNumberTextField_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextField_newActionPerformed(evt);
            }
        });

        numberTypeComboBox_new.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile", "Home", "Work" }));

        emailLabel_new.setText("E-Mail");

        newPhoneNumberButton_new.setText("Add");

        newEmailButton_new.setText("Add");

        viewNumberButton_new.setText("View");

        viewEmailButton_new.setText("View");

        javax.swing.GroupLayout contactDetailsPanel_editLayout = new javax.swing.GroupLayout(contactDetailsPanel_edit);
        contactDetailsPanel_edit.setLayout(contactDetailsPanel_editLayout);
        contactDetailsPanel_editLayout.setHorizontalGroup(
            contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                        .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                                .addComponent(streetLine1Label_edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(streetLine1TextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                                .addComponent(streetLine2Label_edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(streetLine2TextField_edit)))
                        .addGap(18, 18, 18)
                        .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parishLabel_edit)
                            .addComponent(cityLabel_edit))
                        .addGap(18, 18, 18)
                        .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(parishTextField_edit)
                            .addComponent(cityTextField_edit)))
                    .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                        .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                                .addComponent(phoneNumberLabel_edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneNumberTextField_new, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numberTypeComboBox_new, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                                .addComponent(emailLabel_new, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailTextField_new, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                                .addComponent(newPhoneNumberButton_new)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewNumberButton_new))
                            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                                .addComponent(newEmailButton_new)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewEmailButton_new)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contactDetailsPanel_editLayout.setVerticalGroup(
            contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactDetailsPanel_editLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLine1Label_edit)
                    .addComponent(streetLine1TextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel_edit)
                    .addComponent(cityTextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parishLabel_edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(streetLine2Label_edit)
                        .addComponent(streetLine2TextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(parishTextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel_edit)
                    .addComponent(phoneNumberTextField_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberTypeComboBox_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPhoneNumberButton_new)
                    .addComponent(viewNumberButton_new))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contactDetailsPanel_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel_new)
                    .addComponent(emailTextField_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newEmailButton_new)
                    .addComponent(viewEmailButton_new))
                .addGap(25, 25, 25))
        );

        exitButton_edit.setText("EXIT");
        exitButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton_editActionPerformed(evt);
            }
        });

        saveStudentButton_edit.setText("SAVE");

        deleteButton_edit.setText("DELETE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactDetailsPanel_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentIDLabel_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(studentIDTextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameLabel_edit))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTextField_edit)
                                    .addComponent(lastNameTextField_edit))))
                        .addGap(63, 63, 63)
                        .addComponent(genderPanel_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveStudentButton_edit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(genderPanel_edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentIDLabel_edit)
                            .addComponent(studentIDTextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel_edit)
                            .addComponent(firstNameTextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel_edit)
                            .addComponent(lastNameTextField_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(contactDetailsPanel_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton_edit)
                    .addComponent(saveStudentButton_edit)
                    .addComponent(deleteButton_edit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextField_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextField_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextField_editActionPerformed

    private void streetLine1TextField_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetLine1TextField_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetLine1TextField_editActionPerformed

    private void phoneNumberTextField_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextField_newActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextField_newActionPerformed

    private void exitButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton_editActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButton_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityLabel_edit;
    private javax.swing.JTextField cityTextField_edit;
    private javax.swing.JPanel contactDetailsPanel_edit;
    private javax.swing.JButton deleteButton_edit;
    private javax.swing.JLabel emailLabel_new;
    private javax.swing.JTextField emailTextField_new;
    private javax.swing.JButton exitButton_edit;
    private javax.swing.JRadioButton femaleRadioButton_edit;
    private javax.swing.JLabel firstNameLabel_edit;
    private javax.swing.JTextField firstNameTextField_edit;
    private javax.swing.ButtonGroup genderButtonGroup_edit;
    private javax.swing.JPanel genderPanel_edit;
    private javax.swing.JLabel lastNameLabel_edit;
    private javax.swing.JTextField lastNameTextField_edit;
    private javax.swing.JRadioButton maleRadioButton_edit;
    private javax.swing.JButton newEmailButton_new;
    private javax.swing.JButton newPhoneNumberButton_new;
    private javax.swing.JComboBox<String> numberTypeComboBox_new;
    private javax.swing.JLabel parishLabel_edit;
    private javax.swing.JTextField parishTextField_edit;
    private javax.swing.JLabel phoneNumberLabel_edit;
    private javax.swing.JTextField phoneNumberTextField_new;
    private javax.swing.JButton saveStudentButton_edit;
    private javax.swing.JLabel streetLine1Label_edit;
    private javax.swing.JTextField streetLine1TextField_edit;
    private javax.swing.JLabel streetLine2Label_edit;
    private javax.swing.JTextField streetLine2TextField_edit;
    private javax.swing.JLabel studentIDLabel_edit;
    private javax.swing.JTextField studentIDTextField_edit;
    private javax.swing.JButton viewEmailButton_new;
    private javax.swing.JButton viewNumberButton_new;
    // End of variables declaration//GEN-END:variables
}
