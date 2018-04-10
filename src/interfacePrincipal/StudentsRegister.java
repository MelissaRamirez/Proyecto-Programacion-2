package interfacePrincipal;

import domain.Student;
import file.StudentFIle;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentsRegister extends javax.swing.JInternalFrame {

    File file = new File("./student.dat");

    public StudentsRegister() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_career = new javax.swing.JLabel();
        tfd_name = new javax.swing.JTextField();
        tfd_year = new javax.swing.JTextField();
        chb_agro = new javax.swing.JCheckBox();
        chb_education = new javax.swing.JCheckBox();
        chb_info = new javax.swing.JCheckBox();
        btn_insertStudent = new javax.swing.JButton();
        lbl_success = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setMaximizable(true);
        setResizable(true);
        setTitle("Add Student");

        jLabel1.setText("Name");

        jLabel3.setText("Income year");

        lbl_career.setText("Career");

        tfd_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_nameActionPerformed(evt);
            }
        });

        chb_agro.setText("Agronomía");
        chb_agro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_agroActionPerformed(evt);
            }
        });

        chb_education.setText("Educacion");
        chb_education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_educationActionPerformed(evt);
            }
        });

        chb_info.setText("Informática Empresarial");
        chb_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_infoActionPerformed(evt);
            }
        });

        btn_insertStudent.setText("Add");
        btn_insertStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertStudentActionPerformed(evt);
            }
        });

        lbl_success.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_success, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_career)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_insertStudent)
                            .addComponent(tfd_year, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chb_agro)
                            .addComponent(chb_education)
                            .addComponent(chb_info)
                            .addComponent(tfd_name, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(tfd_year))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_career)
                    .addComponent(chb_agro))
                .addGap(19, 19, 19)
                .addComponent(chb_education)
                .addGap(18, 18, 18)
                .addComponent(chb_info)
                .addGap(33, 33, 33)
                .addComponent(lbl_success)
                .addGap(13, 13, 13)
                .addComponent(btn_insertStudent)
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //choiceBox para selecionar si el estudiante es de agronomia
    private void chb_agroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_agroActionPerformed
        // TODO add your handling code here:
        String carrer = "";
        if (chb_agro.isSelected()) {
            chb_education.setEnabled(false);
            chb_info.setEnabled(false);
            carrer = "Agronomia";
        } else {
            chb_education.setEnabled(true);
            chb_info.setEnabled(true);
        }
    }//GEN-LAST:event_chb_agroActionPerformed

    //boton que ingresa el estudiante al sistema
    private void btn_insertStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertStudentActionPerformed
        try {
            // TODO add your handling code here:
            StudentFIle studentFile = new StudentFIle(file);
            String carrer = "";

            if (chb_agro.isSelected()) {
                chb_education.setEnabled(false);
                chb_info.setEnabled(false);
                carrer = "Agronomia";
            }
            if (chb_education.isSelected()) {
                chb_info.setEnabled(false);
                chb_agro.setEnabled(false);
                carrer = "Enseñanza del Ingles";

            }
            if (chb_info.isSelected()) {
                chb_agro.setEnabled(false);
                chb_education.setEnabled(false);
                carrer = "Informática Empresarial";
            }
            String idStudent = studentFile.idCollegeGenerate(carrer, Integer.parseInt(tfd_year.getText()));
            Student student = new Student(tfd_name.getText(), carrer, Integer.parseInt(tfd_year.getText()), idStudent);
            studentFile.addEndRecord(student);

            lbl_success.setForeground(Color.green);
            lbl_success.setText("The student " + tfd_name.getText() + "has been added succesfully with the ID " + idStudent);

        } catch (IOException ex) {
            Logger.getLogger(StudentsRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException nfe) {
            lbl_success.setText("You must enter the right data");
        }

    }//GEN-LAST:event_btn_insertStudentActionPerformed

    private void tfd_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_nameActionPerformed

    //choiceBox para selecionar si el estudiante es de educacion
    private void chb_educationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_educationActionPerformed
        // TODO add your handling code here:
        String carrer = "";
        if (chb_education.isSelected()) {
            chb_info.setEnabled(false);
            chb_agro.setEnabled(false);
            carrer = "Enseñanza del Ingles";
    }//GEN-LAST:event_chb_educationActionPerformed
         else {
            chb_info.setEnabled(true);
            chb_agro.setEnabled(true);
        }

    }

    //choiceBox para selecionar si el estudiante es de informatica empresarial
    private void chb_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_infoActionPerformed
        // TODO add your handling code here:
        String carrer = "";
        if (chb_info.isSelected()) {
            chb_agro.setEnabled(false);
            chb_education.setEnabled(false);
            carrer = "Informática Empresarial";
        } else {
            chb_agro.setEnabled(true);
            chb_education.setEnabled(true);
        }
    }//GEN-LAST:event_chb_infoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insertStudent;
    private javax.swing.JCheckBox chb_agro;
    private javax.swing.JCheckBox chb_education;
    private javax.swing.JCheckBox chb_info;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_career;
    private javax.swing.JLabel lbl_success;
    private javax.swing.JTextField tfd_name;
    private javax.swing.JTextField tfd_year;
    // End of variables declaration//GEN-END:variables
}
