package interfacePrincipal;

import domain.Audiovisual;
import file.AudioVisualFile;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class AudioVisualTable extends javax.swing.JInternalFrame {
 ArrayList<Audiovisual> audioVisualArray;
  ListSelectionModel lsmAudioVisual;
  AudioVisualFile audioVisualFile = new AudioVisualFile();
    
    
    
    public AudioVisualTable() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        arrayList();
    }

    //llena la jtable con los materiales y si respectiva informacion
    public void arrayList() throws IOException, FileNotFoundException, ClassNotFoundException {

        DefaultTableModel model = (DefaultTableModel) jtb_audioVisual.getModel();
        AudioVisualFile audioVisualFile = new AudioVisualFile();
        ArrayList<Audiovisual> audioVisualArray = audioVisualFile.getAudioVisualList();
        Object audioVisual[] = new Object[5];

        for (int i = 0; i < audioVisualArray.size(); i++) {
            audioVisual[0] = audioVisualArray.get(i).getDescription();
            audioVisual[1] = audioVisualArray.get(i).getBrand();
            audioVisual[2] = audioVisualArray.get(i).id;
            audioVisual[3] = audioVisualArray.get(i).nombre;
            audioVisual[4] = audioVisualArray.get(i).quantity;
            model.addRow(audioVisual);
        }

    }

    public void jtb_audioVisualLineaSeleccionada(JTable tb){
    
        if(tb.getSelectedRow() != -1){
        tfd_code.setText(audioVisualArray.get(jtb_audioVisual.getSelectedRow()).getId());
        tfd_code.setEditable(false);
        
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_audioVisual = new javax.swing.JTable();
        tfd_newData = new javax.swing.JTextField();
        lbl_result = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_message = new javax.swing.JLabel();
        tfd_code = new javax.swing.JTextField();
        lbl_message2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_message3 = new javax.swing.JLabel();
        lbl_message = new javax.swing.JLabel();

        setTitle("Audiovisual Report");

        jtb_audioVisual.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmAudioVisual = jtb_audioVisual.getSelectionModel();
        lsmAudioVisual.addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent e){

                if(! e.getValueIsAdjusting()){

                    jtb_audioVisualLineaSeleccionada(jtb_audioVisual);
                }
            }

        });

        jtb_audioVisual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Description", "Brand", "Code", "Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jtb_audioVisual);

        lbl_result.setText("   ");

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel1.setText("Code");

        lb_message.setText("Selected the row of your choose and press");

        lbl_message2.setText("the button delete or update");

        jLabel2.setText("New Data");

        lbl_message3.setText("For update choose the row, then write the new");

        lbl_message.setText("data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfd_newData, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(243, 243, 243))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))
                    .addComponent(lbl_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_update)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_message)
                            .addComponent(lbl_message2)
                            .addComponent(lbl_message)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfd_code, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_message3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lb_message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_message2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_message3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_message)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfd_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_newData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_delete)
                            .addComponent(btn_update))
                        .addGap(26, 26, 26)
                        .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtb_audioVisual.getModel();

        int filaSelected = jtb_audioVisual.getSelectedRow();
        if(filaSelected>=0){

            model.removeRow(filaSelected);
            try {
                audioVisualFile.borrarObjeto(tfd_code.getText());
            } catch (IOException ex) {
                Logger.getLogger(AudioVisualTable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AudioVisualTable.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        try {

            if(tfd_newData.getText().length() == 0){
                lbl_result.setText("Insert the new data");
                lbl_result.setForeground(Color.red);
            }else{
                audioVisualFile.updateAudioVisual(tfd_code.getText(), "cantidad", tfd_newData.getText());
                lbl_result.setForeground(Color.green);
                lbl_result.setText("The book with the ISBN " + tfd_code.getText() + " has been updated");

            }

        } catch (IOException ex) {
            Logger.getLogger(AudioVisualTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AudioVisualTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_audioVisual;
    private javax.swing.JLabel lb_message;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JLabel lbl_message2;
    private javax.swing.JLabel lbl_message3;
    private javax.swing.JLabel lbl_result;
    private javax.swing.JTextField tfd_code;
    private javax.swing.JTextField tfd_newData;
    // End of variables declaration//GEN-END:variables
}
