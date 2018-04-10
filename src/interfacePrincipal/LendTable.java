
package interfacePrincipal;

import domain.Lending;
import file.LendFIle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class LendTable extends javax.swing.JInternalFrame {


    public LendTable() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        arrayList();
    }

    //muestra la tabla con los prestamos y la informacion sobre ellos
    public void arrayList() throws IOException, FileNotFoundException, ClassNotFoundException {

        LendFIle lendFile = new LendFIle();

        try {

            ArrayList<Lending> audioVisualArray = lendFile.getLendList();
            DefaultTableModel model = (DefaultTableModel) tbv_lend.getModel();
            Object audioVisual[] = new Object[4];

            for (int i = 0; i < audioVisualArray.size(); i++) {
                
                audioVisual[0] = audioVisualArray.get(i).getIndate();
                audioVisual[1] = audioVisualArray.get(i).getOutdate();
                audioVisual[2] = audioVisualArray.get(i).getMaterialID();
                audioVisual[3] = audioVisualArray.get(i).getStudentID();
                model.addRow(audioVisual);
            }
                 
        } catch (FileNotFoundException ioe) {
            System.out.println("There is no file");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbv_lend = new javax.swing.JTable();

        setTitle("Lending Report");

        tbv_lend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lend Date", "GiveBack Date", "Id Material", "Id Student"
            }
        ));
        tbv_lend.setEnabled(false);
        jScrollPane1.setViewportView(tbv_lend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbv_lend;
    // End of variables declaration//GEN-END:variables
}
