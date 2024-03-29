/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.swing;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import werkstuk.dao.ClientDao;
import werkstuk.model.Client;
import werkstuk.dao.OrderlistDao;
import werkstuk.model.Order;

/**
 *
 * @author Titus
 */
public class EditClientDialog extends javax.swing.JDialog {

    /**
     * Creates new form BewerkenDialog
     */
    private DefaultListModel<Order> myModel;
    public EditClientDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myModel = new DefaultListModel<Order>();
        lstOrders.setModel(myModel);
        updateOrderList();
    }
    
    public void updateOrderList() {
        myModel.clear();
        ArrayList<Order> orderList = OrderlistDao.getOrderen();
        for (Order currentOrder : orderList) {
            myModel.addElement(currentOrder);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClientnr = new javax.swing.JLabel();
        txtClientnr = new javax.swing.JTextField();
        lblFirstname = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        lblLastname = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lblAdress = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnSaveEdits = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOrders = new javax.swing.JList();
        btnEdit = new javax.swing.JButton();
        btnEditOrder = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblOrders = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblClientnr.setText("Clientnr");

        txtClientnr.setEditable(false);
        txtClientnr.setEnabled(false);

        lblFirstname.setText("Firstname");

        txtFirstname.setEditable(false);

        lblLastname.setText("Lastname");

        txtLastname.setEditable(false);

        lblAdress.setText("Adres");

        txtAdress.setEditable(false);

        btnExit.setText("Afsluiten");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnSaveEdits.setText("Wijzigingen bewaren");
        btnSaveEdits.setEnabled(false);
        btnSaveEdits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEditsActionPerformed(evt);
            }
        });

        btnEdit.setText("Bewerken");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lstOrders.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstOrders);

        btnEdit.setText("Toevoegen");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEditOrder.setText("Details / Bewerken");
        btnEditOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditOrderActionPerformed(evt);
            }
        });

        btnDelete.setText("Verwijderen");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblOrders.setText("Owners");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstname)
                    .addComponent(txtClientnr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAdress)
                    .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClientnr)
                            .addComponent(lblFirstname)
                            .addComponent(lblLastname)
                            .addComponent(lblAdress))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSaveEdits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrders)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClientnr)
                    .addComponent(lblOrders))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtClientnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFirstname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLastname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveEdits)
                            .addComponent(btnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSaveEditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditsActionPerformed
        Client changedClient = new Client(Integer.parseInt(txtClientnr.getText()), txtFirstname.getText(), txtLastname.getText(), txtAdress.getText());
        ClientDao.updateClient(changedClient);
        this.setVisible(false);
    }//GEN-LAST:event_btnSaveEditsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Client clientToUse = new Client(Integer.parseInt(txtClientnr.getText()), txtFirstname.getText(), txtLastname.getText(), txtAdress.getText());
        AddOrderDialog myDialogwindow = new AddOrderDialog(new javax.swing.JFrame(), true);
        myDialogwindow.setClientNrToUse(clientToUse.getClientnr());
        myDialogwindow.showDialog();
        updateOrderList();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditOrderActionPerformed
        Order orderToEdit = (Order) lstOrders.getSelectedValue();
        EditOrderDialog myDialogwindow = new EditOrderDialog(new javax.swing.JFrame(), true);
        myDialogwindow.setOrderToEditnr(orderToEdit.getOrdernr());
        myDialogwindow.showDialog();
        updateOrderList();
    }//GEN-LAST:event_btnEditOrderActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Object selectedObject = lstOrders.getSelectedValue();
        Order selectedOrder = (Order) selectedObject;
        OrderlistDao.verwijderOrder(selectedOrder.getOrdernr());
        updateOrderList();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtFirstname.setEditable(true);
        txtLastname.setEditable(true);
        txtAdress.setEditable(true);
        btnSaveEdits.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    public void setClientNrToEdit(int Clientnr) {
        Client clientToEdit = ClientDao.getClientById(Clientnr);
        txtClientnr.setText(Integer.toString(clientToEdit.getClientnr()));
        txtFirstname.setText(clientToEdit.getFirstname());
        txtLastname.setText(clientToEdit.getLastname());
        txtAdress.setText(clientToEdit.getAddress());
    }
    
    public void setOrderToEditnr(int Ordernr) {
        Order orderToEdit = (Order) lstOrders.getSelectedValue();
        EditOrderDialog myDialogwindow = new EditOrderDialog(new javax.swing.JFrame(), true);
        myDialogwindow.setOrderToEditnr(orderToEdit.getOrdernr());
        myDialogwindow.showDialog();
        updateOrderList();
    }

    public void showDialog() {
        this.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditClientDialog dialog = new EditClientDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveEdits;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JLabel lblClientnr;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JList lstOrders;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtClientnr;
    private javax.swing.JTextField txtFirstname;
    // End of variables declaration//GEN-END:variables
}
