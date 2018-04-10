package interfacePrincipal;

import UpperEssential.UpperEssentialLookAndFeel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

public class PrincipalWindow extends javax.swing.JFrame {

    public PrincipalWindow() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        principalDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_registro = new javax.swing.JMenu();
        mni_students = new javax.swing.JMenuItem();
        mni_material = new javax.swing.JMenuItem();
        mni_prestamos = new javax.swing.JMenu();
        mni_bookP = new javax.swing.JMenuItem();
        mni_AudiovisualP = new javax.swing.JMenuItem();
        mni_Devolucion = new javax.swing.JMenu();
        mni_bookD = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mni_tableBook = new javax.swing.JMenuItem();
        mni_audioVisualTable = new javax.swing.JMenuItem();
        mni_studentsTable = new javax.swing.JMenuItem();
        mni_lendingTable = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalDesktop.setBackground(new java.awt.Color(255, 255, 255));
        principalDesktop.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacePrincipal/descarga (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        principalDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout principalDesktopLayout = new javax.swing.GroupLayout(principalDesktop);
        principalDesktop.setLayout(principalDesktopLayout);
        principalDesktopLayout.setHorizontalGroup(
            principalDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalDesktopLayout.createSequentialGroup()
                .addContainerGap(1021, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        principalDesktopLayout.setVerticalGroup(
            principalDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalDesktopLayout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setToolTipText("");

        mnu_registro.setText("Add ");

        mni_students.setText("Students");
        mni_students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_studentsActionPerformed(evt);
            }
        });
        mnu_registro.add(mni_students);

        mni_material.setText("Material");
        mni_material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_materialActionPerformed(evt);
            }
        });
        mnu_registro.add(mni_material);

        jMenuBar1.add(mnu_registro);

        mni_prestamos.setText("Lending");

        mni_bookP.setText("Book");
        mni_bookP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_bookPActionPerformed(evt);
            }
        });
        mni_prestamos.add(mni_bookP);

        mni_AudiovisualP.setText("AudioVisual");
        mni_AudiovisualP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_AudiovisualPActionPerformed(evt);
            }
        });
        mni_prestamos.add(mni_AudiovisualP);

        jMenuBar1.add(mni_prestamos);

        mni_Devolucion.setText("Devolution");

        mni_bookD.setText("Material");
        mni_bookD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_bookDActionPerformed(evt);
            }
        });
        mni_Devolucion.add(mni_bookD);

        jMenuBar1.add(mni_Devolucion);

        jMenu1.setText("Reports");

        mni_tableBook.setText("Books");
        mni_tableBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_tableBookActionPerformed(evt);
            }
        });
        jMenu1.add(mni_tableBook);

        mni_audioVisualTable.setText("Audiovisual");
        mni_audioVisualTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_audioVisualTableActionPerformed(evt);
            }
        });
        jMenu1.add(mni_audioVisualTable);

        mni_studentsTable.setText("Students");
        mni_studentsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_studentsTableActionPerformed(evt);
            }
        });
        jMenu1.add(mni_studentsTable);

        mni_lendingTable.setText("Lendings");
        mni_lendingTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_lendingTableActionPerformed(evt);
            }
        });
        jMenu1.add(mni_lendingTable);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_materialActionPerformed
        MaterialRegister regMaterial = new MaterialRegister();
        this.principalDesktop.removeAll();
        this.principalDesktop.repaint();

        this.principalDesktop.add(regMaterial);
         this.principalDesktop.add(jLabel1);
        regMaterial.show();


    }//GEN-LAST:event_mni_materialActionPerformed

    private void mni_studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_studentsActionPerformed

        StudentsRegister studentsReg = new StudentsRegister();
        this.principalDesktop.removeAll();
        this.principalDesktop.repaint();
        this.principalDesktop.add(studentsReg);
         this.principalDesktop.add(jLabel1);
        studentsReg.show();


    }//GEN-LAST:event_mni_studentsActionPerformed

    private void mni_bookPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_bookPActionPerformed
        // FineRegister lendingRegister = new FineRegister();
        LendInterfaceBook lendingInterfaceBook = new LendInterfaceBook();

        this.principalDesktop.removeAll();
        this.principalDesktop.repaint();
        this.principalDesktop.add(lendingInterfaceBook);
         this.principalDesktop.add(jLabel1);
        lendingInterfaceBook.show();


    }//GEN-LAST:event_mni_bookPActionPerformed

    private void mni_tableBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_tableBookActionPerformed
        // TODO add your handling code here:
        BookTable bookJTable;
        try {
            bookJTable = new BookTable();
            this.principalDesktop.removeAll();
            this.principalDesktop.repaint();
            this.principalDesktop.add(bookJTable);
            this.principalDesktop.add(jLabel1);
            bookJTable.show();

        } catch (IOException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_mni_tableBookActionPerformed

    private void mni_audioVisualTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_audioVisualTableActionPerformed
        try {
            // TODO add your handling code here:
            AudioVisualTable audioVisualT = new AudioVisualTable();
            this.principalDesktop.removeAll();
            this.principalDesktop.repaint();
            this.principalDesktop.add(audioVisualT);
            this.principalDesktop.add(jLabel1);
            audioVisualT.show();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_mni_audioVisualTableActionPerformed

    private void mni_studentsTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_studentsTableActionPerformed
        // TODO add your handling code here:
        StudentsTable studentTable = new StudentsTable();
        this.principalDesktop.removeAll();
        this.principalDesktop.repaint();
        this.principalDesktop.add(studentTable);
        this.principalDesktop.add(jLabel1);
        studentTable.show();


    }//GEN-LAST:event_mni_studentsTableActionPerformed

    private void mni_AudiovisualPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_AudiovisualPActionPerformed
        // TODO add your handling code here:

        LendInterfaceAudio lendingInterface = new LendInterfaceAudio();

        this.principalDesktop.removeAll();
        this.principalDesktop.repaint();
        this.principalDesktop.add(lendingInterface);
        this.principalDesktop.add(jLabel1);
        lendingInterface.show();
    }//GEN-LAST:event_mni_AudiovisualPActionPerformed

    private void mni_bookDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_bookDActionPerformed
        // TODO add your handling code here:
        DevolutionInterface devolutAudiov = new DevolutionInterface();
        this.principalDesktop.removeAll();
        this.principalDesktop.repaint();
        this.principalDesktop.add(devolutAudiov);
         this.principalDesktop.add(jLabel1);
        devolutAudiov.show();
    }//GEN-LAST:event_mni_bookDActionPerformed

    private void mni_lendingTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_lendingTableActionPerformed
        // TODO add your handling code here:

        try {
            LendTable lendingTableV = new LendTable();
            this.principalDesktop.removeAll();
            this.principalDesktop.repaint();
            this.principalDesktop.add(lendingTableV);
            this.principalDesktop.add(jLabel1);
            
            lendingTableV.show();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrincipalWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mni_lendingTableActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
        UIManager.setLookAndFeel( new UpperEssentialLookAndFeel());
       UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\Melissa Ramírez R\\Desktop\\ProyectoProgramacionII\\dist\\lib\\probando2.theme"));
       

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mni_AudiovisualP;
    private javax.swing.JMenu mni_Devolucion;
    private javax.swing.JMenuItem mni_audioVisualTable;
    private javax.swing.JMenuItem mni_bookD;
    private javax.swing.JMenuItem mni_bookP;
    private javax.swing.JMenuItem mni_lendingTable;
    private javax.swing.JMenuItem mni_material;
    private javax.swing.JMenu mni_prestamos;
    private javax.swing.JMenuItem mni_students;
    private javax.swing.JMenuItem mni_studentsTable;
    private javax.swing.JMenuItem mni_tableBook;
    private javax.swing.JMenu mnu_registro;
    private javax.swing.JDesktopPane principalDesktop;
    // End of variables declaration//GEN-END:variables
}
