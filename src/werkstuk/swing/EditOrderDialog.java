/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werkstuk.swing;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import werkstuk.dao.OrderlistDao;
import werkstuk.dao.Order_ProductDao;
import werkstuk.model.Order;
import werkstuk.dao.ClientDao;
import werkstuk.model.Client;
import werkstuk.dao.ProductDao;
import werkstuk.model.Order_Product;
import werkstuk.model.Product;
import werkstuk.model.Orderlist;
/**
 *
 *
 */
public class EditOrderDialog extends javax.swing.JDialog {

    /**
     * Creates new form BewerkenDialog
     */
    private DefaultListModel<Product> myModel;

    public OrderlistBewerkenDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myModel = new DefaultListModel<Product>();
        lstProducts.setModel(myModel);
        updateProductList();
    }
    
    public void updateProductList() {
        myModel.clear();
        ArrayList<Product> listOfProducts = ProductDao.getProducts();
        for (Product currentProduct : listOfProducts) {
            myModel.addElement(currentProduct);
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

        lblProductnr = new javax.swing.JLabel();
        txtOrdernr = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtClientnr = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtSuppliernr = new javax.swing.JTextField();
        lblProducts = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnSaveEdits = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOrder_Products = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProducts = new javax.swing.JList();
        lblShopCart = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblProductnr.setText("Ordernr");

        txtOrdernr.setEditable(false);
        txtOrdernr.setEnabled(false);

        lblName.setText("Clientnr");

        txtClientnr.setEditable(false);
        txtClientnr.setEnabled(false);

        lblPrice.setText("Suppliernr");

        txtSuppliernr.setEditable(false);

        lblProducts.setText("Producten");

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

        lstOrder_Products.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstOrder_Products.setEnabled(false);
        jScrollPane1.setViewportView(lstOrder_Products);

        lstProducts.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstProducts.setEnabled(false);
        jScrollPane2.setViewportView(lstProducts);

        lblShopCart.setText("Winkelkar");

        btnEdit.setText("Product Toevoegen <<<");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Verwijderen >>>");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClientnr)
                    .addComponent(txtOrdernr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductnr)
                            .addComponent(lblName)
                            .addComponent(lblPrice))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProducts)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaveEdits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAmount)
                            .addComponent(txtSuppliernr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblShopCart))
                        .addGap(143, 143, 143)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductnr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrdernr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClientnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSuppliernr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btnEdit)
                        .addGap(60, 60, 60)
                        .addComponent(btnDelete)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblShopCart)
                                    .addComponent(lblProducts)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveEdits)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Product productToUse = (Product) lstProducts.getSelectedValue();
        Order orderToUse = new Order(Integer.parseInt(txtOrdernr.getText()), Integer.parseInt(txtClientnr.getText()), Integer.parseInt(txtSuppliernr.getText()));
        Order_Product newOrder_Product = new Order_Product( orderToUse.getOrdernr(), productToUse.getProductnr());
        Order_ProductDao.addOrder_Product(newOrder_Product);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Object selectedObject = lstOrder_Products.getSelectedValue();
        Order_Product selecterOrder_Product = (Order_Product) selectedObject;
        Order_ProductDao.deleteOrder_Product(selecterOrder_Product.getOrdernr());
        updateOrder_ProductenLijst();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveEditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEditsActionPerformed
        Orderlist changedOrderlist = new Orderlist(Integer.parseInt(txtOrdernr.getText()), Integer.parseInt(txtClientnr.getText()), Integer.parseInt(txtSuppliernr.getText()), Integer.parseInt(txtAmount.getText()));
        OrderlistDao.updateOrderlist(changedOrderlist);
        this.setVisible(false);
    }//GEN-LAST:event_btnSaveEditsActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtSuppliernr.setEditable(true);
        lstOrder_Products.setEnabled(true);
        lstProducts.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnSaveEdits.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    
    public void setOrderToEditnr(int OrderlistId) {
        Orderlist orderListToEdit = OrderlistDao.getOrderlistById(OrderlistId);
        txtOrdernr.setText(Integer.toString(orderListToEdit.getOrderlistId()));
        txtClientnr.setText(Integer.toString(orderListToEdit.getProductId()));
        txtSuppliernr.setText(Integer.toString(orderListToEdit.getOwnerId()));
        txtAmount.setText(Integer.toString(orderListToEdit.getAmount()));
    }
    public void setClientNrToUse(int Clientnr) {
        Client clientToUse = ClientDao.getClientById(Clientnr);
        txtClientnr.setText(Integer.toString(clientToUse.getClientnr()));
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
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditOrderDialog dialog = new EditOrderDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveEdits;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProducts;
    private javax.swing.JLabel lblProductnr;
    private javax.swing.JLabel lblShopCart;
    private javax.swing.JList lstOrder_Products;
    private javax.swing.JList lstProducts;
    private javax.swing.JTextField txtOrdernr;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtClientnr;
    private javax.swing.JTextField txtSuppliernr;
    // End of variables declaration//GEN-END:variables
}
