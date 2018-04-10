package interfacePrincipal;

import domain.Book;
import file.BookFile;
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

public class BookTable extends javax.swing.JInternalFrame {
ListSelectionModel lsmBook; 
ArrayList<Book> arrayBook;
BookFile bookFile = new BookFile();
    
    
    public BookTable() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        arrayList();
    }

    //llena la tabla con los libros y su respectiva informacion
    public void arrayList() throws IOException, FileNotFoundException, ClassNotFoundException {

        DefaultTableModel model = (DefaultTableModel) jtb_book.getModel();
        BookFile bookfile = new BookFile();
        arrayBook = bookfile.getBookList();
        Object book[] = new Object[6];

        //se pone en arrayCarsize porque el regsQuantity toma hasta los que  
        for (int i = 0; i < arrayBook.size(); i++) {
            book[0] = arrayBook.get(i).getTitle();
            book[1] = arrayBook.get(i).getAutor();
            book[2] = arrayBook.get(i).getType();
            book[3] = arrayBook.get(i).getYear();
            book[4] = arrayBook.get(i).getId();
            book[5] = arrayBook.get(i).getQuantity();
            model.addRow(book);
        }

    }
    
    public void jtb_bookLineaSeleccionada (JTable tb){
    
        if(tb.getSelectedRow() != -1){
        tfd_ISBN.setText(arrayBook.get(jtb_book.getSelectedRow()).getId());
        tfd_ISBN.setEditable(false);
        //hacer el textfiel de ID del codigo
        
        
        }
     }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfd_ISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfd_newData = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lb_message = new javax.swing.JLabel();
        lbl_message2 = new javax.swing.JLabel();
        lbl_message3 = new javax.swing.JLabel();
        lbl_message = new javax.swing.JLabel();
        lbl_result = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_book = new javax.swing.JTable();

        setTitle("Book Report");

        jLabel2.setText("New Quantity ");

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

        lb_message.setText("Selected the row of your choose and press");

        lbl_message2.setText("the button delete or update");

        lbl_message3.setText("For update choose the row, then write the new");

        lbl_message.setText("data");

        lbl_result.setText("   ");

        jLabel1.setText("ISBN");

        jtb_book.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmBook = jtb_book.getSelectionModel();
        lsmBook.addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent e){

                if(! e.getValueIsAdjusting()){

                    jtb_bookLineaSeleccionada(jtb_book);
                }
            }

        });

        jtb_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Autor", "Type", "Year", "ID", "Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jtb_book);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_update))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfd_ISBN)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfd_newData, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_message)
                            .addComponent(lbl_message2)
                            .addComponent(lbl_message3)
                            .addComponent(lbl_message))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lb_message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_message2)
                .addGap(24, 24, 24)
                .addComponent(lbl_message3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_message)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfd_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfd_newData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_update))
                .addGap(18, 18, 18)
                .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        DefaultTableModel model = (DefaultTableModel) jtb_book.getModel();
        
        int filaSelected = jtb_book.getSelectedRow();
        if(filaSelected>=0){

            model.removeRow(filaSelected);
            try {

                bookFile.removeObjet(tfd_ISBN.getText());
                lbl_result.setText("The book with the ISBN " + tfd_ISBN.getText() + "has been deleted");

            } catch (IOException ex) {
                Logger.getLogger(BookTable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BookTable.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {

            if(tfd_newData.getText().length() == 0){
                lbl_result.setText("Insert the new data");
                lbl_result.setForeground(Color.red);
            }else{
                bookFile.updateBook(tfd_ISBN.getText(), "cantidad", tfd_newData.getText());
                lbl_result.setForeground(Color.green);
                lbl_result.setText("The book with the ISBN " + tfd_ISBN.getText() + " has been updated");

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
    private javax.swing.JTable jtb_book;
    private javax.swing.JLabel lb_message;
    private javax.swing.JLabel lbl_message;
    private javax.swing.JLabel lbl_message2;
    private javax.swing.JLabel lbl_message3;
    private javax.swing.JLabel lbl_result;
    private javax.swing.JTextField tfd_ISBN;
    private javax.swing.JTextField tfd_newData;
    // End of variables declaration//GEN-END:variables

}
