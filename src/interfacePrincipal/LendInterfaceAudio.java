
package interfacePrincipal;

import domain.Audiovisual;
import domain.Lending;
import domain.Student;
import file.AudioVisualFile;
import file.DevolutionFile;
import file.LendFIle;
import file.StudentFIle;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LendInterfaceAudio extends javax.swing.JInternalFrame {

    public LendInterfaceAudio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        tfd_searchMaterial = new javax.swing.JTextField();
        lbl_searchMat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_infoMaterial = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tfd_insertIDMaterial = new javax.swing.JTextField();
        lbl_inDate = new javax.swing.JLabel();
        btn_newLend = new javax.swing.JButton();
        tfd_studenID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlb_success = new javax.swing.JLabel();
        btn_confirmStudent = new javax.swing.JButton();
        lbl_confirmStudent = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setTitle("AudioVisual Lending");

        tfd_searchMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfd_searchMaterialKeyReleased(evt);
            }
        });

        lbl_searchMat.setText("Search Material");

        txa_infoMaterial.setEditable(false);
        txa_infoMaterial.setColumns(20);
        txa_infoMaterial.setRows(5);
        jScrollPane1.setViewportView(txa_infoMaterial);

        jLabel1.setText("Insert Code");

        tfd_insertIDMaterial.setEditable(false);

        lbl_inDate.setText("Lend Date");

        btn_newLend.setText("Lend material");
        btn_newLend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newLendActionPerformed(evt);
            }
        });

        jLabel2.setText("Student ID");

        jlb_success.setBackground(new java.awt.Color(255, 0, 0));
        jlb_success.setText("  ");

        btn_confirmStudent.setText("Confirm");
        btn_confirmStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmStudentActionPerformed(evt);
            }
        });

        lbl_confirmStudent.setText("Student: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_confirmStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(btn_confirmStudent)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbl_searchMat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(tfd_searchMaterial))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_inDate)
                                .addGap(34, 34, 34)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(tfd_insertIDMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(tfd_studenID, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlb_success, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_newLend)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfd_searchMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_searchMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_insertIDMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_confirmStudent)
                            .addComponent(btn_confirmStudent)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfd_studenID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_inDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_success)
                    .addComponent(btn_newLend))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton para hacer el prestamo
    private void btn_newLendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newLendActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        LendFIle lf = new LendFIle();

        try {

            if (tfd_insertIDMaterial.getText().length() == 0 || tfd_searchMaterial.getText().length() == 0
                    || tfd_studenID.getText().length() == 0) {

                jlb_success.setText("You must complete all spaces to continue");

            } else {
                String date = dateFormat.format(jDateChooser1.getDate());
                File fl = new File("student.dat");
                StudentFIle stf_compareID = new StudentFIle(fl);

                if (stf_compareID.compareStudenID(tfd_studenID.getText()) == false) {

                    lbl_confirmStudent.setText("The student wasn't found");

                } else {

                    DevolutionFile devolutionFile = new DevolutionFile();
                    int audioVisualQuantity = devolutionFile.retriveOrQuitAVQuantity(tfd_insertIDMaterial.getText(), "cantidad", -1);

                    if (audioVisualQuantity == 0) {
                        jlb_success.setText("There isn't more materials of this type");
                    } else {

                        String giveBackDay = lf.sumaDias(lf.convierteStringADate(date, "yyyy-MM-dd"), 7).toString();
                        Lending lg = new Lending(7, date, giveBackDay, 0, tfd_insertIDMaterial.getText(), tfd_studenID.getText());
                        lf.writeLendedItem(lg);

                        jlb_success.setForeground(Color.green);
                        jlb_success.setText(" The student " + tfd_studenID.getText() + " have to return the material on " + giveBackDay);
                    }

                    tfd_insertIDMaterial.setText("");
                    tfd_searchMaterial.setText("");
                    tfd_studenID.setText("");
                    tfd_studenID.setEnabled(true);
                    btn_confirmStudent.setEnabled(true);
                    jDateChooser1.setCalendar(null);
                    lbl_confirmStudent.setText("");

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(LendInterfaceBook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendInterfaceBook.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_newLendActionPerformed

    //textarea donde aparece ls informacion del material al cual se esta buscando
    private void tfd_searchMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_searchMaterialKeyReleased
        // TODO add your handling code here:

        try {

            AudioVisualFile audioVFile = new AudioVisualFile();
            ArrayList<Audiovisual> arrayAudio = audioVFile.getAudioVisualList();

            LendFIle lf = new LendFIle();

            txa_infoMaterial.setText("");
            String informationMaterial = "";
            for (int i = 0; i < arrayAudio.size(); i++) {
                if (arrayAudio.get(i).startsWith(tfd_searchMaterial.getText())) {
                    informationMaterial += "Name: " + " " + arrayAudio.get(i).getNombre() + "\n"
                            + "Description: " + " " + arrayAudio.get(i).getDescription() + "\n"
                            + "Quantity: "  + " " + arrayAudio.get(i).getQuantity() + "\n"
                            + "Code: " + " " + arrayAudio.get(i).getId() + "\n \n ";

                    tfd_insertIDMaterial.setText(arrayAudio.get(i).getId());

                }
                txa_infoMaterial.setText(informationMaterial);
            }
        } catch (IOException ex) {
            Logger.getLogger(LendInterfaceAudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendInterfaceAudio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tfd_searchMaterialKeyReleased

    //accion del boton para confirmar que el estudiante exista el registro y hacer prestamos
    private void btn_confirmStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmStudentActionPerformed

        File fl = new File("student.dat");
        StudentFIle stf_compareID;
        try {
            stf_compareID = new StudentFIle(fl);
            if (stf_compareID.compareStudenID(tfd_studenID.getText()) == false) {
                lbl_confirmStudent.setText("The student wasn't found");

            } else {

                btn_newLend.setEnabled(true);
                btn_confirmStudent.setEnabled(false);
                tfd_studenID.setEnabled(false);

                Student student = stf_compareID.getStudenID(tfd_studenID.getText());
                lbl_confirmStudent.setText(" Nombre: " + " " + student.getStudent() + "\n"
                        + " Id: " + " " + student.getIdCollege() + "\n"
                        + " Año: " + " " + student.getYear() + "\n"
                        + " Career: " + " " + student.getCareer() + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(LendInterfaceAudio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_confirmStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmStudent;
    private javax.swing.JButton btn_newLend;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel jlb_success;
    private javax.swing.JLabel lbl_confirmStudent;
    private javax.swing.JLabel lbl_inDate;
    private javax.swing.JLabel lbl_searchMat;
    private javax.swing.JTextField tfd_insertIDMaterial;
    private javax.swing.JTextField tfd_searchMaterial;
    private javax.swing.JTextField tfd_studenID;
    private javax.swing.JTextArea txa_infoMaterial;
    // End of variables declaration//GEN-END:variables
}
