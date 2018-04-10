package interfacePrincipal;

import com.toedter.calendar.JDateChooser;
import domain.Lending;
import file.DevolutionFile;
import file.LendFIle;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DevolutionInterface extends javax.swing.JInternalFrame {

    ListSelectionModel lsmLend;
    private ArrayList<Lending> audioVisualArray;

    public DevolutionInterface(ArrayList<Lending> audioVisualArray) {
        this.audioVisualArray = audioVisualArray;
    }

    public DevolutionInterface() {
        initComponents();

    }

    //metodo para llenar la tabla con la informacion de los prestamos
    public void arrayList() throws IOException, FileNotFoundException, ClassNotFoundException {

        LendFIle lendFile = new LendFIle();
        DevolutionFile devolutionFile = new DevolutionFile();
        audioVisualArray = devolutionFile.arrayListStudentLend(tfd_idStudent.getText());

        if (lendFile.countObject() == 0) {

            JOptionPane.showMessageDialog(null, "Aun no se han ingresado ningun prestamo");
        } else {

            DefaultTableModel model = (DefaultTableModel) devolutionStudentTable.getModel();

            Object audioVisual[] = new Object[6];

            for (int i = 0; i < audioVisualArray.size(); i++) {
                audioVisual[0] = audioVisualArray.get(i).getQuantityDays();
                audioVisual[1] = audioVisualArray.get(i).getIndate();
                audioVisual[2] = audioVisualArray.get(i).getOutdate();
                audioVisual[3] = audioVisualArray.get(i).getFine();
                audioVisual[4] = audioVisualArray.get(i).getMaterialID();
                audioVisual[5] = audioVisualArray.get(i).getStudentID();
                model.addRow(audioVisual);

            }//fin del for

        }

    }//fin del metodo

    //metodo que devuelve el matarial al selecionarlo en la tabla
    public void devolutionStudentTableLineaSeleccionada(JTable tb) {

        if (tb.getSelectedRow() != -1) {

            tfd_idStudent.setText(audioVisualArray.get(devolutionStudentTable.getSelectedRow()).getStudentID());
            tfd_InsertMaterialID.setText(audioVisualArray.get(devolutionStudentTable.getSelectedRow()).getMaterialID());

            DevolutionFile devolution = new DevolutionFile();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(jDateChooser1.getDate());
            DefaultTableModel model = (DefaultTableModel) devolutionStudentTable.getModel();

            try {

                Lending checkId = devolution.confirmIDtoGiveBack(tfd_idStudent.getText());
                devolution.arrayListStudentLend(tfd_idStudent.getText());

                if (checkId != null) {

                    checkId.toString();

                    int fine = devolution.quantityOfDaysa(date, tfd_idStudent.getText(), tfd_InsertMaterialID.getText());

                    if (fine > 7) {
                        fine = (fine - 7) * 100;

                        lbl_fine.setText("La multa es de:" + fine + " colones");
                    } else {
                        fine = 0;
                        lbl_fine.setText("La multa es de:" + fine + " colones");

                    }

                }

            } catch (IOException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//fin del metodo

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_idStudent = new javax.swing.JLabel();
        tfd_idStudent = new javax.swing.JTextField();
        lbl_idMaterial = new javax.swing.JLabel();
        lbl_fine = new javax.swing.JLabel();
        btn_searchDev = new javax.swing.JButton();
        btn_newDev = new javax.swing.JButton();
        lbl_fineResult = new javax.swing.JLabel();
        lbl_giveDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        devolutionStudentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfd_InsertMaterialID = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setTitle("Devolutions");
        setMaximumSize(new java.awt.Dimension(214748, 214747));

        lbl_idStudent.setText("Insert student ID");

        lbl_fine.setText("Fine");

        btn_searchDev.setText("Search");
        btn_searchDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchDevActionPerformed(evt);
            }
        });

        btn_newDev.setText("GiveBack");
        btn_newDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newDevActionPerformed(evt);
            }
        });

        lbl_fineResult.setBackground(new java.awt.Color(255, 0, 0));
        lbl_fineResult.setText("  ");

        lbl_giveDate.setText("GiveBack Date");

        devolutionStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Days", "Indate", "Outdate", "Fine", "MaterialID", "StudentID"
            }
        ));
        devolutionStudentTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmLend = devolutionStudentTable.getSelectionModel();
        lsmLend.addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent e){

                if(! e.getValueIsAdjusting()){

                    devolutionStudentTableLineaSeleccionada(devolutionStudentTable);
                }
            }

        });

        jScrollPane2.setViewportView(devolutionStudentTable);

        jLabel1.setText("Matirial ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_fine, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(lbl_idMaterial)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_idStudent)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfd_idStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(tfd_InsertMaterialID))
                        .addGap(91, 91, 91)
                        .addComponent(lbl_giveDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_searchDev)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_fineResult, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(btn_newDev)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_idStudent, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_searchDev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_idStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_giveDate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfd_InsertMaterialID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_fine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_newDev)
                    .addComponent(lbl_fineResult))
                .addGap(18, 18, 18)
                .addComponent(lbl_idMaterial)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //accion del boton para devolver el material
    private void btn_newDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newDevActionPerformed

        if (tfd_InsertMaterialID.getText().equalsIgnoreCase("") || tfd_idStudent.getText().equalsIgnoreCase("") || jDateChooser1.getDate() == null) {
            lbl_fineResult.setText("Please complete all the requirements to continue");
        } else {

            LendFIle lendFile = new LendFIle();
            DevolutionFile devolution = new DevolutionFile();
            DefaultTableModel model = (DefaultTableModel) devolutionStudentTable.getModel();
            try {
                int filaSelected = devolutionStudentTable.getSelectedRow();
                if (filaSelected >= 0) {

                    model.removeRow(filaSelected);

                }

                Lending checkId = devolution.confirmIDtoGiveBack(tfd_idStudent.getText());

                lendFile.borrarObjeto(tfd_idStudent.getText(), checkId.getMaterialID());

                lbl_fineResult.setForeground(Color.green);
                lbl_fineResult.setText("The material with the code " + checkId.getMaterialID() + " has been returned succesfully");
                tfd_idStudent.setEditable(true);
                
            } catch (IOException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_newDevActionPerformed

    //boton para buscar el meterial que quiere devolver en el registro de prestamos para verificar si tiene multa o no
    //y asi devolver el material
    private void btn_searchDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchDevActionPerformed

        if (tfd_idStudent.getText().equalsIgnoreCase("") || jDateChooser1.getDate() == null) {

            lbl_fineResult.setText("Please complete all the requirements to continue");

        } else {

            tfd_idStudent.setEditable(false);
            tfd_InsertMaterialID.setEditable(false);
            lbl_fineResult.setText("");

            try {
                
                arrayList();
                
            } catch (IOException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            }

            DevolutionFile devolution = new DevolutionFile();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = dateFormat.format(jDateChooser1.getDate());
            DefaultTableModel model = (DefaultTableModel) devolutionStudentTable.getModel();

            try {

                Lending checkId = devolution.confirmIDtoGiveBack(tfd_idStudent.getText());
                devolution.arrayListStudentLend(tfd_idStudent.getText());

                if (checkId != null) {

                    checkId.toString();

                    int fine = devolution.quantityOfDaysa(date, tfd_idStudent.getText(), tfd_InsertMaterialID.getText());

                    if (fine > 7) {
                        fine = (fine - 7) * 100;

                        lbl_fine.setText("La multa es de:" + fine + " colones");
                    } else {
                        fine = 0;
                        lbl_fine.setText("La multa es de:" + fine + " colones");

                    }

                    if (checkId.getMaterialID().length() <= 5) {
                        devolution.retriveOrQuitAVQuantity(checkId.getMaterialID(), "cantidad", 1);

                    } else {
                        devolution.retriveOrQuitBooksQuantity(checkId.getMaterialID(), "cantidad", 1);

                    }

                }

            } catch (IOException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(DevolutionInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_searchDevActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_newDev;
    private javax.swing.JButton btn_searchDev;
    private javax.swing.JTable devolutionStudentTable;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_fine;
    private javax.swing.JLabel lbl_fineResult;
    private javax.swing.JLabel lbl_giveDate;
    private javax.swing.JLabel lbl_idMaterial;
    private javax.swing.JLabel lbl_idStudent;
    private javax.swing.JTextField tfd_InsertMaterialID;
    private javax.swing.JTextField tfd_idStudent;
    // End of variables declaration//GEN-END:variables
}
