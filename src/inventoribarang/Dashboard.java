package inventoribarang;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Barang = new javax.swing.JMenuItem();
        Lokasi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Masuk = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROGRAM INVENTORI BARANG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jMenu1.setText("Master");

        Barang.setText("Data Barang");
        Barang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangActionPerformed(evt);
            }
        });
        jMenu1.add(Barang);

        Lokasi.setText("Data Lokasi");
        Lokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LokasiActionPerformed(evt);
            }
        });
        jMenu1.add(Lokasi);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");

        Masuk.setText("Inventaris Masuk");
        Masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasukActionPerformed(evt);
            }
        });
        jMenu2.add(Masuk);

        keluar.setText("Inventaris Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jMenu2.add(keluar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangActionPerformed
       new Barang();
    }//GEN-LAST:event_BarangActionPerformed

    private void MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasukActionPerformed
       new InventarisMasuk();
    }//GEN-LAST:event_MasukActionPerformed

    private void LokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LokasiActionPerformed
        new Lokasi();
    }//GEN-LAST:event_LokasiActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        new InventarisKeluar();
    }//GEN-LAST:event_keluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Barang;
    private javax.swing.JMenuItem Lokasi;
    private javax.swing.JMenuItem Masuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem keluar;
    // End of variables declaration//GEN-END:variables
}
