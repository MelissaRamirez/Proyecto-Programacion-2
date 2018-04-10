package interfacePrincipal;

import domain.Student;
import file.StudentFIle;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class StudentsTable extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    File file = new File("./student.dat");

    public StudentsTable() {
        initComponents();
        setEnableCheckBox();

    }

    //muestra la tabla con los estudiantes y su respectiva informacion
    public void arrayList(String career) {
        try {
            model = (DefaultTableModel) jtb_student.getModel();

            StudentFIle studentFile = new StudentFIle(file);

            ArrayList<Student> arrayStudents = studentFile.getCareerList(career);
            Object student[] = new Object[4];

            //se pone en arrayCarsize porque el regsQuantity toma hasta los que  
            for (int i = 0; i < arrayStudents.size(); i++) {
                student[0] = arrayStudents.get(i).student;
                student[1] = arrayStudents.get(i).career;
                student[2] = arrayStudents.get(i).year;
                student[3] = arrayStudents.get(i).idCollege;
                model.addRow(student);

            }

            //habilita en el jcalendar la capacidad de ordenar por orden alfabetico
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
            jtb_student.setRowSorter(sorter);

        } catch (IOException ex) {
            System.out.println("file no found");
        }

    }

    //habilita los checkbox
    public void setEnableCheckBox() {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_student = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();

        setTitle("Students Report");

        jtb_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Career", "Year", "ID"
            }
        ));
        jScrollPane1.setViewportView(jtb_student);

        jCheckBox1.setText("Informatica");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Educacion");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Agronomia");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jCheckBox1)
                .addGap(73, 73, 73)
                .addComponent(jCheckBox2)
                .addGap(84, 84, 84)
                .addComponent(jCheckBox3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //deshabilita el checBox al selecionarlo
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()) {
            String career = "Agronomia";
            arrayList(career);
            jCheckBox3.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed
    //deshabilita el checBox al selecionarlo
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            String career = "Informática Empresarial";
            arrayList(career);
            jCheckBox1.setEnabled(false);
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed


    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked


    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked

    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox3MouseClicked
    //deshabilita el checBox al selecionarlo
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            String career = "Enseñanza del Ingles";
            arrayList(career);
            jCheckBox2.setEnabled(false);

        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_student;
    // End of variables declaration//GEN-END:variables
}
