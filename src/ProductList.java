/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammed Ali LALE
 */
public class ProductList extends javax.swing.JFrame {
        
        ArrayList<Product> allProducts;
        ArrayList<Product> enableProducts;
        ArrayList<Product> disableProducts;
        ArrayList<Product> onStockProducts;
        ArrayList<Product> offStockProducts;
        ProductOperations list = new ProductOperations();
    
     /**
      * Creates new form ProductList
      */
    public ProductList() {
        initComponents();
        allProducts = list.getProductList();
        addProductToTable(allProducts);
    }
    /*
    public void listInject(){
        java.awt.EventQueue.invokeLater(() -> {
                new ProductList().setVisible(true);
            });
    }*/
    
    //Verilen Listeyi JTable'a ekler
    public void addProductToTable(ArrayList<Product> Products){
        String sale;
        for(Product p:Products){
            if(p.enabled){
                sale="Satışta";
            }else{
                sale="Satışta Değil";
            }
            getDefaultModel().addRow(new Object[]{Integer.toString(p.ID),p.name,p.priceFormatter(p.price),p.priceFormatter(p.marketPrice),p.priceFormatter(p.cost),Integer.toString(p.stock),sale});
        }
    }
    
    public DefaultTableModel getDefaultModel() {
        return (DefaultTableModel) product_table.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        jComboBox = new javax.swing.JComboBox<>();
        addPrButton = new javax.swing.JButton();
        updatePrButton = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        enabledButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        excelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ürün Listesi");
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        product_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün ID", "Ürün Adı", "Fiyat", "Pazar Fiyatı", "Maliyet", "Stok Sayısı", "Satış Durumu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        product_table.setRowHeight(25);
        product_table.getColumnModel().getColumn(0).setPreferredWidth(20);
        product_table.getColumnModel().getColumn(1).setPreferredWidth(100);
        product_table.getColumnModel().getColumn(5).setPreferredWidth(25);
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product_table);

        jComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tüm Ürünler", "Stoktaki Ürünler", "Stokta Olmayan Ürünler", "Satıştaki Ürünler", "Satışta Olmayan Ürünler", " " }));
        jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxİtemStateChanged(evt);
            }
        });
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        addPrButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addPrButton.setText("Yeni Ürün Ekle");
        addPrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrButtonActionPerformed(evt);
            }
        });

        updatePrButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updatePrButton.setText("Ürün Bilgilerini Düzenle");
        updatePrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePrButtonActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteButton.setText("Ürünü Sil");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        enabledButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enabledButton.setText("Ürünü Satıştan Kaldır");
        enabledButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enabledButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ÜRÜN LİSTESİ");

        excelButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        excelButton.setText("Excele dök");
        excelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPrButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updatePrButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enabledButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(excelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(445, 445, 445)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(excelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(enabledButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(updatePrButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(addPrButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    //Tabloyu temizler
    public void clearTable(){
        while(getDefaultModel().getRowCount()>0){
            getDefaultModel().removeRow(0);
        }
    }
    
    //Hangi ürün liestesinin ekranda görüntüleneceğini ayarlar
    private void jComboBoxİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxİtemStateChanged
        message.setText("");
        if(jComboBox.getSelectedIndex()==0){
            clearTable();
            addProductToTable(allProducts = list.getProductList());
        }else if(jComboBox.getSelectedIndex()==1){
            clearTable();
            addProductToTable(onStockProducts = list.getProductsOnStock());
        }else if(jComboBox.getSelectedIndex()==2){
            clearTable();
            addProductToTable(offStockProducts= list.getProductsOffStock());
        }else if(jComboBox.getSelectedIndex()==3){
            clearTable();
            addProductToTable(enableProducts= list.getEnableProducts());
        }else if(jComboBox.getSelectedIndex()==4){
            clearTable();
            addProductToTable(disableProducts= list.getDisableProducts());
        }
    }//GEN-LAST:event_jComboBoxİtemStateChanged

    //Ürün ekleme ekranına gider
    private void addPrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrButtonActionPerformed
        message.setText("");
        AddProductFrontEnd apf = new AddProductFrontEnd();
        //dispose();
        setVisible(false);
        apf.Inject();
    }//GEN-LAST:event_addPrButtonActionPerformed
    
    //Listeyi Silip tekrar yazdırır (refresh)
    public void returnToList(){
        if(jComboBox.getSelectedIndex()==0){
        clearTable();
        addProductToTable(allProducts = list.getProductList());
        }else if(jComboBox.getSelectedIndex()==1){
            clearTable();
            addProductToTable(onStockProducts = list.getProductsOnStock());
        }else if(jComboBox.getSelectedIndex()==2){
            clearTable();
            addProductToTable(offStockProducts= list.getProductsOffStock());
        }else if(jComboBox.getSelectedIndex()==3){
            clearTable();
            addProductToTable(enableProducts= list.getEnableProducts());
        }else if(jComboBox.getSelectedIndex()==4){
            clearTable();
            addProductToTable(disableProducts= list.getDisableProducts());
        }
    }
    
   //comboBoxa göre seçili olan ürün listesini döndürür
    private ArrayList<Product> getCurrentList(){
        if(jComboBox.getSelectedIndex()==0){
            return allProducts;
        }else if(jComboBox.getSelectedIndex()==1){
            return onStockProducts;
        }else if(jComboBox.getSelectedIndex()==2){
            return offStockProducts;
        }else if(jComboBox.getSelectedIndex()==3){
            return enableProducts;
        }else{
            return disableProducts;
        }
    }
    
    //message Labelında yazacak metni düzenler
    public void putMessage(Color renk, String msg){
        message.setForeground(renk);
        message.setText(msg);
    }
    
    //Tabloda seçili satırdaki ürünü döndürür
    private Product getSelectedProduct(){
        int selectedIndex;
        selectedIndex = product_table.getSelectedRow();
        return getCurrentList().get(selectedIndex);
    }
    
    //Ürün güncelleme penceresine yönlendirir
    private void updatePrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePrButtonActionPerformed
        int selectedIndex;
        selectedIndex = product_table.getSelectedRow(); 
        if(selectedIndex == -1){
            putMessage(Color.red, "Bir ürün seçiniz");
        }else{
            message.setText("");
            Product selP = getSelectedProduct();
            UpdateProduct updt = new UpdateProduct(selP,list,this);
            updt.setVisible(true);
            
        }
    }//GEN-LAST:event_updatePrButtonActionPerformed
    
    //Databaseden ürün silme işlemini gerçekleştirir
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedIndex;
        selectedIndex = product_table.getSelectedRow(); 
        if(selectedIndex == -1){
            putMessage(Color.red, "Bir ürün seçiniz");
        }else{
            Object[] options = { "EVET", "HAYIR" };
            int response=JOptionPane.showOptionDialog(this, "Ürünü silmek istediğinize emin misiniz?", "Uyarı", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            if(response == JOptionPane.YES_OPTION){  
                message.setText("");
                list.remove(getSelectedProduct().ID);
                putMessage(Color.green, "Ürün Silindi");
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    //ürünleri enable-disable eder
    private void enabledButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enabledButtonActionPerformed
        int selectedIndex;
        selectedIndex = product_table.getSelectedRow(); 
        if(selectedIndex == -1){
            putMessage(Color.red, "Bir ürün seçiniz");
        }else if(getSelectedProduct().enabled){
            Object[] options = { "EVET", "HAYIR" };
            int response=JOptionPane.showOptionDialog(this, "Ürünü satıştan kaldırmak istiyor musunuz?", "Uyarı", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            if(response == JOptionPane.YES_OPTION){  
                list.disable(getSelectedProduct().ID);
                returnToList();
                putMessage(Color.green, "Ürün Satıştan Kaldırıldı");
            }
        }else if(!getSelectedProduct().enabled){
            Object[] options = { "EVET", "HAYIR" };
            int response=JOptionPane.showOptionDialog(this, "Ürünü tekrar satışa koymak istiyor musunuz?", "Uyarı", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            if(response == JOptionPane.YES_OPTION){  
                list.enable(getSelectedProduct().ID);
                returnToList();
                putMessage(Color.green, "Ürün Satışa Konuldu");
            }
        }
    }//GEN-LAST:event_enabledButtonActionPerformed

    //seçili ürüne göre enable butonundaki metni değiştirir
    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        if(getSelectedProduct().enabled){
            enabledButton.setText("Ürünü Satıştan kaldır");
        }else{
            enabledButton.setText("Ürünü Satışa koy");
        }
    }//GEN-LAST:event_product_tableMouseClicked

    //ürün listesini excel dosyası olarak export eder
    private void excelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelButtonActionPerformed
        try {
            CSVExporter.jtExportResultSetWithDialog(this, product_table, true);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(ProductList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excelButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

       
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
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPrButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton enabledButton;
    private javax.swing.JButton excelButton;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel message;
    private javax.swing.JTable product_table;
    private javax.swing.JButton updatePrButton;
    // End of variables declaration//GEN-END:variables
}
