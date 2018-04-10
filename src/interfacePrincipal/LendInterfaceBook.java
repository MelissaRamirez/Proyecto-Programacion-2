package interfacePrincipal;

import domain.Book;
import domain.Lending;
import domain.Student;
import file.BookFile;
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

public class LendInterfaceBook extends javax.swing.JInternalFrame {

    public LendInterfaceBook() {
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
        jLabel3 = new javax.swing.JLabel();
        lbl_success = new javax.swing.JLabel();
        btn_confirmStudent = new javax.swing.JButton();
        lbl_confirmStudent = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Book Lending");

        tfd_searchMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfd_searchMaterialKeyReleased(evt);
            }
        });

        lbl_searchMat.setText("Search Book");

        txa_infoMaterial.setEditable(false);
        txa_infoMaterial.setColumns(20);
        txa_infoMaterial.setRows(5);
        jScrollPane1.setViewportView(txa_infoMaterial);

        jLabel1.setText("Insert Code");

        tfd_insertIDMaterial.setEditable(false);
        tfd_insertIDMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_insertIDMaterialActionPerformed(evt);
            }
        });

        lbl_inDate.setText("Lend Date");

        btn_newLend.setText("Lend material");
        btn_newLend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newLendActionPerformed(evt);
            }
        });

        jLabel2.setText("Student ID");

        lbl_success.setBackground(new java.awt.Color(255, 0, 0));
        lbl_success.setText("  ");

        btn_confirmStudent.setText("Confirm");
        btn_confirmStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmStudentActionPerformed(evt);
            }
        });

        lbl_confirmStudent.setText("<html>Student: <html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_success, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_confirmStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(btn_confirmStudent)))
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(tfd_insertIDMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfd_studenID, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_inDate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_searchMat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfd_searchMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_newLend)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_searchMat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_searchMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_insertIDMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_studenID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_confirmStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_confirmStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_inDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_newLend)
                .addGap(2, 2, 2)
                .addComponent(lbl_success))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton que realizara el prestamo
    private void btn_newLendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newLendActionPerformed

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        LendFIle lf = new LendFIle();

        try {

            if (tfd_insertIDMaterial.getText().length() == 0 || tfd_searchMaterial.getText().length() == 0
                    || tfd_studenID.getText().length() == 0) {

                lbl_success.setText("You must complete all spaces to continue");

            } else {

                DevolutionFile devolutionFile = new DevolutionFile();
                int bookQuantity = devolutionFile.retriveOrQuitBooksQuantity(tfd_insertIDMaterial.getText(), "cantidad", -1);
                String date = dateFormat.format(jDateChooser1.getDate());
                if (bookQuantity == 0) {
                    lbl_success.setText("There isn't more books of this title");
                } else {

                    String giveBackDay = lf.sumaDias(lf.convierteStringADate(date, "yyyy-MM-dd"), 7).toString();
                    Lending lg = new Lending(7, date, giveBackDay, 0, tfd_insertIDMaterial.getText(), tfd_studenID.getText());
                    lf.writeLendedItem(lg);

                    lbl_success.setForeground(Color.green);
                    lbl_success.setText("The student " + tfd_studenID.getText() + " have to giveback the book on : " + giveBackDay);

                }

                jDateChooser1.setDate(null);
                tfd_insertIDMaterial.setText("");
                tfd_searchMaterial.setText("");
                tfd_studenID.setText("");
                tfd_studenID.setEnabled(true);
                btn_confirmStudent.setEnabled(true);
                lbl_confirmStudent.setText("");
                tfd_studenID.setEditable(true);

            }
        } catch (IOException ex) {
            Logger.getLogger(LendInterfaceBook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendInterfaceBook.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_newLendActionPerformed

    // textarea donde apareceran los materiales dependiendo lo que escriba en textfield
    private void tfd_searchMaterialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfd_searchMaterialKeyReleased
        // TODO add your handling code here:

        try {
            BookFile bookFile = new BookFile();
            ArrayList<Book> arrayBook = bookFile.getBookList();
            LendFIle lf = new LendFIle();

            txa_infoMaterial.setText("");
            String informationMaterial = "";
            for (int i = 0; i < arrayBook.size(); i++) {
                if (arrayBook.get(i).startsWith(tfd_searchMaterial.getText())) {
                    informationMaterial += "Title: " + arrayBook.get(i).getTitle() + "\n"
                            + "Type: " + arrayBook.get(i).getType() + "\n"
                            + "Quantity: " + arrayBook.get(i).getQuantity() + "\n"
                            + "Code: " + arrayBook.get(i).getId() + "\n \n ";

                    tfd_insertIDMaterial.setText(arrayBook.get(i).getId());
                }
                txa_infoMaterial.setText(informationMaterial);
            }
        } catch (IOException ex) {
            Logger.getLogger(LendInterfaceBook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LendInterfaceBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tfd_searchMaterialKeyReleased

    //boton para confimar que el estudante se encuentra en el registro y asi relizar el prestamo
    private void btn_confirmStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmStudentActionPerformed
        // TODO add your handling code here:
        File fl = new File("student.dat");
        StudentFIle stf_comapreID;
        btn_confirmStudent.setEnabled(false);
        try {
            stf_comapreID = new StudentFIle(fl);
            if (stf_comapreID.compareStudenID(tfd_studenID.getText()) == false) {

                lbl_confirmStudent.setText("The student doesn't exist");
                btn_confirmStudent.setEnabled(true);
                btn_newLend.setEnabled(false);

            } else {

                btn_newLend.setEnabled(true);
                btn_confirmStudent.setEnabled(false);
                tfd_studenID.setEnabled(false);

                Student student = stf_comapreID.getStudenID(tfd_studenID.getText());
                lbl_confirmStudent.setText("Nombre: " + student.getStudent() + "\n"
                        + " Id: " + student.getIdCollege() + "\n"
                        + " Año: " + student.getYear() + "\n"
                        + " Career: " + student.getCareer() + "\n");
                tfd_studenID.setEditable(false);

            }

        } catch (IOException ex) {
            Logger.getLogger(LendInterfaceBook.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_confirmStudentActionPerformed

    private void tfd_insertIDMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_insertIDMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_insertIDMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_confirmStudent;
    private javax.swing.JButton btn_newLend;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lbl_confirmStudent;
    private javax.swing.JLabel lbl_inDate;
    private javax.swing.JLabel lbl_searchMat;
    private javax.swing.JLabel lbl_success;
    private javax.swing.JTextField tfd_insertIDMaterial;
    private javax.swing.JTextField tfd_searchMaterial;
    private javax.swing.JTextField tfd_studenID;
    private javax.swing.JTextArea txa_infoMaterial;
    // End of variables declaration//GEN-END:variables
}
