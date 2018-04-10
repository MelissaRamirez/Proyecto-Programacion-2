
package interfacePrincipal;

import domain.Audiovisual;
import domain.Book;
import file.AudioVisualFile;
import file.BookFile;
import java.awt.Color;
import java.awt.SplashScreen;
import static java.awt.SplashScreen.getSplashScreen;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaterialRegister extends javax.swing.JInternalFrame {
   
   
   AudioVisualFile audioVisualFile = new AudioVisualFile();
   BookFile bookfile = new BookFile();
      
    public MaterialRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfd_title = new javax.swing.JTextField();
        btn_addMaterial = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_year = new javax.swing.JLabel();
        lbl_autor = new javax.swing.JLabel();
        lbl_nameAudiov = new javax.swing.JLabel();
        lbl_brandAudiov = new javax.swing.JLabel();
        chb_book = new javax.swing.JCheckBox();
        chb_audiovisual = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        tfd_year = new javax.swing.JTextField();
        tfd_autor = new javax.swing.JTextField();
        tfd_descriptionAudiov = new javax.swing.JTextField();
        tfd_brandAudiov = new javax.swing.JTextField();
        chb_digital = new javax.swing.JCheckBox();
        chb_fisico = new javax.swing.JCheckBox();
        tfd_title2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfd_quantityBook = new javax.swing.JTextField();
        lbl_quantityAudio = new javax.swing.JLabel();
        tfd_quantityAudio = new javax.swing.JTextField();
        tfd_materialName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbl_result = new javax.swing.JLabel();

        tfd_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_titleActionPerformed(evt);
            }
        });

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximizable(true);
        setTitle("Material Register");

        btn_addMaterial.setText("Add");
        btn_addMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addMaterialActionPerformed(evt);
            }
        });

        lbl_title.setText("Title");

        jLabel2.setText("Type");

        lbl_year.setText("Year");

        lbl_autor.setText("Autor");

        lbl_nameAudiov.setText("Description");

        lbl_brandAudiov.setText("Brand");

        chb_book.setText("Book");
        chb_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb_bookMouseClicked(evt);
            }
        });
        chb_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_bookActionPerformed(evt);
            }
        });

        chb_audiovisual.setText("Audio Visual");
        chb_audiovisual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb_audiovisualMouseClicked(evt);
            }
        });
        chb_audiovisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_audiovisualActionPerformed(evt);
            }
        });

        tfd_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_yearActionPerformed(evt);
            }
        });

        tfd_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_autorActionPerformed(evt);
            }
        });

        chb_digital.setText("Digital");
        chb_digital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_digitalActionPerformed(evt);
            }
        });

        chb_fisico.setText("Physic");
        chb_fisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_fisicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Book Quantity");

        lbl_quantityAudio.setText("Material Quantity");

        jLabel4.setText("Material Name ");

        lbl_result.setBackground(new java.awt.Color(255, 0, 0));
        lbl_result.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel3)
                            .addGap(128, 128, 128)
                            .addComponent(jLabel10))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfd_quantityBook, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(560, 560, 560))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chb_fisico, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chb_digital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chb_book)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_title)
                                        .addComponent(lbl_autor)
                                        .addComponent(lbl_year))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfd_year, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfd_title2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfd_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(chb_audiovisual)
                                .addComponent(lbl_brandAudiov)
                                .addComponent(lbl_quantityAudio)
                                .addComponent(lbl_nameAudiov))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfd_materialName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_brandAudiov, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_quantityAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_descriptionAudiov, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addMaterial))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_audiovisual)
                    .addComponent(chb_book))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_title)
                    .addComponent(tfd_title2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfd_materialName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_brandAudiov)
                    .addComponent(tfd_brandAudiov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_year))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_quantityAudio)
                    .addComponent(tfd_quantityAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_autor)
                    .addComponent(tfd_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nameAudiov)
                    .addComponent(tfd_descriptionAudiov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chb_digital, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(chb_fisico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfd_quantityBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(46, 46, 46)))
                        .addGap(185, 185, 185))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btn_addMaterial)))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chb_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb_bookMouseClicked


    }//GEN-LAST:event_chb_bookMouseClicked
//habilita y desabilita botones y campos de texto dependiendo el tipo de material que se desee registrar
    private void chb_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_bookActionPerformed

      

        if (chb_book.isSelected()) {
            
            chb_audiovisual.setEnabled(false);
            chb_audiovisual.setSelected(false);
            chb_book.setSelected(true);
            chb_book.setEnabled(true);
             
            tfd_autor.setEnabled(true);
            tfd_quantityBook.setEnabled(true);
            tfd_year.setEnabled(true);
            tfd_title2.setEnabled(true);
            tfd_brandAudiov.setEnabled(false);
            tfd_descriptionAudiov.setEnabled(false);
            tfd_quantityAudio.setEnabled(false);
            tfd_materialName.setEnabled(false);
            chb_digital.setEnabled(true);
            chb_fisico.setEnabled(true);

        } else {
            
            chb_audiovisual.setEnabled(true);
            chb_audiovisual.setSelected(true);
            chb_book.setSelected(false);
             chb_book.setEnabled(false);
             
            tfd_autor.setEnabled(false);
            tfd_quantityBook.setEnabled(false);
            tfd_year.setEnabled(false);
            tfd_title2.setEnabled(false);
            tfd_brandAudiov.setEnabled(true);
            tfd_descriptionAudiov.setEnabled(true);
            tfd_quantityAudio.setEnabled(true);
            tfd_materialName.setEnabled(true);
            chb_digital.setEnabled(false);
            chb_fisico.setEnabled(false);
        }

    }//GEN-LAST:event_chb_bookActionPerformed

    private void chb_audiovisualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb_audiovisualMouseClicked


    }//GEN-LAST:event_chb_audiovisualMouseClicked

    private void tfd_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_titleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfd_titleActionPerformed

    //boton para registrar el material
    private void btn_addMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addMaterialActionPerformed
  
   
        try {
              
            SplashScreen splashScreen = getSplashScreen();

            if (chb_book.isSelected()) {

                if (tfd_autor.getText().length() == 0
                        || tfd_quantityBook.getText().length() == 0
                        || tfd_title2.getText().length() == 0 || tfd_year.getText().length() == 0) {

                    lbl_result.setText("You must complete all spaces to continue");
                }

                if (chb_audiovisual.isSelected()) {

                    if (tfd_brandAudiov.getText().length() == 0 || tfd_descriptionAudiov.getText().length() == 0
                            || tfd_quantityAudio.getText().length() == 0) {

                        lbl_result.setText("You must complete all spaces to continue");
                    }

                }

            }

            String tipo = "";
            String material = "";
            if (chb_digital.isSelected()) {
                tipo = "digital";
            }
            if (chb_fisico.isSelected()) {
                tipo = "fisico";
            }

            if (chb_book.isSelected()) {
                
                material = "libro";
                String code = bookfile.compareid(bookfile.writeID());
                Book book = new Book(tfd_title2.getText(), tfd_autor.getText(), tipo, Integer.parseInt(tfd_year.getText()),
                        code, material, Integer.parseInt(tfd_quantityBook.getText()));

                bookfile.insertBook(book);
                lbl_result.setText("The book with the code" + code + "has been added succesfully");

            } else if (chb_audiovisual.isSelected()) {
               
                
                material = tfd_materialName.getText();
                String audioID = audioVisualFile.compareid(audioVisualFile.writeID());
                Audiovisual audioVisual = new Audiovisual(tfd_descriptionAudiov.getText(), tfd_brandAudiov.getText(),
                        audioID, material, Integer.parseInt(tfd_quantityAudio.getText()));

                audioVisualFile.insertAudioVisual(audioVisual);
                lbl_result.setForeground(Color.green);
                lbl_result.setText("The material has been added succesfully with the code " + audioID);
            } else {
                lbl_result.setText("You may choose between book or audiovisual to continue");

            }

            tfd_autor.setEnabled(true);
            tfd_quantityBook.setEnabled(true);
            tfd_year.setEnabled(true);
            tfd_title2.setEnabled(true);
            tfd_brandAudiov.setEnabled(true);
            tfd_descriptionAudiov.setEnabled(true);
            tfd_quantityAudio.setEnabled(true);
            tfd_materialName.setEnabled(true);
            chb_digital.setEnabled(true);
            chb_fisico.setEnabled(true);
            
            
            chb_book.setSelected(false);
            chb_audiovisual.setSelected(false);
            chb_book.setEnabled(true);
            chb_audiovisual.setEnabled(true);
            chb_digital.setSelected(false);
            chb_fisico.setSelected(false);
            tfd_autor.setText("");
            tfd_brandAudiov.setText("");
            tfd_descriptionAudiov.setText("");
            tfd_materialName.setText("");
            tfd_quantityAudio.setText("");
            tfd_quantityBook.setText("");
            tfd_title2.setText("");
            tfd_year.setText("");
            
            

        } catch (IOException ex) {
            Logger.getLogger(MaterialRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MaterialRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException nfe) {
            lbl_result.setText("You must insert the right data");

        }
    }//GEN-LAST:event_btn_addMaterialActionPerformed

    private void tfd_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_yearActionPerformed

    private void tfd_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_autorActionPerformed
//habilita y desabilita botones y campos de texto dependiendo el tipo de material que se desee registrar
    private void chb_audiovisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_audiovisualActionPerformed

       
        if (chb_audiovisual.isSelected()) {
            
            chb_audiovisual.setSelected(true);
            chb_audiovisual.setEnabled(true);
            chb_book.setSelected(false);
            chb_book.setEnabled(false);
            
            tfd_autor.setEnabled(false);
            tfd_quantityBook.setEnabled(false);
            tfd_year.setEnabled(false);
            tfd_title2.setEnabled(false);
            tfd_brandAudiov.setEnabled(true);
            tfd_descriptionAudiov.setEnabled(true);
            tfd_quantityAudio.setEnabled(true);
            tfd_materialName.setEnabled(true);
            chb_digital.setEnabled(false);
            chb_fisico.setEnabled(false);

        } else {
            chb_audiovisual.setEnabled(false);
            chb_audiovisual.setSelected(false);
            chb_book.setSelected(true);
             chb_book.setEnabled(true);
            tfd_autor.setEnabled(true);
            tfd_quantityBook.setEnabled(true);
            tfd_year.setEnabled(true);
            tfd_title2.setEnabled(true);
            tfd_brandAudiov.setEnabled(false);
            tfd_descriptionAudiov.setEnabled(false);
            tfd_quantityAudio.setEnabled(false);
            tfd_materialName.setEnabled(false);
            chb_digital.setEnabled(true);
            chb_fisico.setEnabled(true);

    }//GEN-LAST:event_chb_audiovisualActionPerformed
    }
    //habilita o deshabilita el checkbox tipo digital
    private void chb_digitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_digitalActionPerformed
        // TODO add your handling code here:
        if (chb_digital.isSelected()) {
            chb_fisico.setEnabled(false);
        } else {
            chb_fisico.setEnabled(true);
        }
    }//GEN-LAST:event_chb_digitalActionPerformed
    //habilita o deshabilita el checkbox para libros tipo fisico
    private void chb_fisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_fisicoActionPerformed
        // TODO add your handling code here:
        if (chb_fisico.isSelected()) {

            chb_digital.setEnabled(false);
        } else {
            chb_digital.setEnabled(true);
        }
    }//GEN-LAST:event_chb_fisicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addMaterial;
    private javax.swing.JCheckBox chb_audiovisual;
    private javax.swing.JCheckBox chb_book;
    private javax.swing.JCheckBox chb_digital;
    private javax.swing.JCheckBox chb_fisico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_brandAudiov;
    private javax.swing.JLabel lbl_nameAudiov;
    private javax.swing.JLabel lbl_quantityAudio;
    private javax.swing.JLabel lbl_result;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JTextField tfd_autor;
    private javax.swing.JTextField tfd_brandAudiov;
    private javax.swing.JTextField tfd_descriptionAudiov;
    private javax.swing.JTextField tfd_materialName;
    private javax.swing.JTextField tfd_quantityAudio;
    private javax.swing.JTextField tfd_quantityBook;
    private javax.swing.JTextField tfd_title;
    private javax.swing.JTextField tfd_title2;
    private javax.swing.JTextField tfd_year;
    // End of variables declaration//GEN-END:variables
}
