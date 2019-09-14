package GUI;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

public class FrameAnggota extends javax.swing.JInternalFrame {
    
    Connection conn ;
    Statement stat;
    ResultSet rs;
    String[][]dataAnggota;
    String formatTanggal = "yyyy-MM-dd";
    SimpleDateFormat sdf = new SimpleDateFormat(formatTanggal);     
    
    public FrameAnggota() {
        initComponents();
        conn = new DB.DBConnection().setConnection();
        urutan();
        txtIdAnggota.setEnabled(false);  
        btnubah.setEnabled(false);
        btnhapus.setEnabled(false);
        tabelDataAnggota();
        //tambahTipe();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelAnggota = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        labelJenisKelamin = new javax.swing.JLabel();
        labelTempatLahir = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        labelTanggalLahir = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        labelTelepon = new javax.swing.JLabel();
        labelNoKtp = new javax.swing.JLabel();
        txtPekerjaan = new javax.swing.JTextField();
        labelPekerjaan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxJenisKelamin = new javax.swing.JComboBox();
        labelNoKtp1 = new javax.swing.JLabel();
        txtNoKtp = new javax.swing.JTextField();
        comboAgama = new javax.swing.JComboBox();
        tanggalLahir = new com.toedter.calendar.JDateChooser();
        tanggalMasuk = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelAnggota = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(949, 600));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(871, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelAnggota.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelAnggota.setText("ID Anggota");

        txtIdAnggota.setMinimumSize(new java.awt.Dimension(6, 25));
        txtIdAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAnggotaActionPerformed(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelNama.setText("Nama");

        txtNama.setMinimumSize(new java.awt.Dimension(6, 25));

        labelJenisKelamin.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelJenisKelamin.setText("Jenis Kelamin");

        labelTempatLahir.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelTempatLahir.setText("Tempat Lahir");

        txtTempatLahir.setMinimumSize(new java.awt.Dimension(6, 25));

        labelTanggalLahir.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelTanggalLahir.setText("Tanggal Lahir");

        labelAlamat.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelAlamat.setText("Alamat");

        txtAlamat.setMinimumSize(new java.awt.Dimension(6, 25));

        txtTelepon.setMinimumSize(new java.awt.Dimension(6, 25));

        labelTelepon.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelTelepon.setText("Telepon");

        labelNoKtp.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelNoKtp.setText("Agama");

        txtPekerjaan.setMinimumSize(new java.awt.Dimension(6, 25));

        labelPekerjaan.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelPekerjaan.setText("Pekerjaan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Tanggal Masuk");

        comboBoxJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L", "P" }));

        labelNoKtp1.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelNoKtp1.setText("No Ktp");

        txtNoKtp.setMinimumSize(new java.awt.Dimension(6, 25));

        comboAgama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen", "Hindu", "Budha", "Konghucu" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(labelAnggota))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJenisKelamin)
                            .addComponent(labelTempatLahir)
                            .addComponent(labelTanggalLahir)
                            .addComponent(labelAlamat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNoKtp)
                            .addComponent(labelPekerjaan)
                            .addComponent(labelNoKtp1)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labelTelepon))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnggota)
                    .addComponent(labelTelepon)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJenisKelamin)
                            .addComponent(comboBoxJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTempatLahir)
                            .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTanggalLahir)
                            .addComponent(tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNoKtp)
                            .addComponent(comboAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNoKtp1)
                            .addComponent(txtNoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPekerjaan)
                            .addComponent(txtPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tanggalMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        btnubah.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        btnubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/edit-icon.png"))); // NOI18N
        btnubah.setText("UBAH");
        btnubah.setPreferredSize(new java.awt.Dimension(87, 32));
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/HPS.png"))); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.setPreferredSize(new java.awt.Dimension(89, 32));
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbatal.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/application-exit.png"))); // NOI18N
        btnbatal.setText("BATAL");
        btnbatal.setPreferredSize(new java.awt.Dimension(89, 32));
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        btnsimpan.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/button_30.png"))); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.setPreferredSize(new java.awt.Dimension(97, 32));
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/email-testing.png"))); // NOI18N
        btnKeluar.setText("KELUAR");
        btnKeluar.setPreferredSize(new java.awt.Dimension(97, 32));
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(btnubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelAnggota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Tanggal Lahir", "Tempat Lahir", "JK", "No KTP", "Agama", "Pekerjaan", "Alamat", "Telepon", "Tanggal Masuk"
            }
        ));
        tabelAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAnggotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelAnggota);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        ubahData();
        urutan();
        btnsimpan.setEnabled(true);
        btnhapus.setEnabled(false);
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        btnsimpan.setEnabled(true);
        btnubah.setEnabled(false);
        urutan();
        bersihdata();
        tabelDataAnggota();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtIdAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAnggotaActionPerformed

    private void tabelAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAnggotaMouseClicked
        ambildata();
        btnhapus.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnubah.setEnabled(true);
    }//GEN-LAST:event_tabelAnggotaMouseClicked

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        simpanData();
        urutan();
        txtIdAnggota.setEnabled(false);
        btnhapus.setEnabled(false);
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        hapusdata();
        btnsimpan.setEnabled(true);
        urutan();
    }//GEN-LAST:event_btnhapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JComboBox comboAgama;
    private javax.swing.JComboBox comboBoxJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAnggota;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoKtp;
    private javax.swing.JLabel labelNoKtp1;
    private javax.swing.JLabel labelPekerjaan;
    private javax.swing.JLabel labelTanggalLahir;
    private javax.swing.JLabel labelTelepon;
    private javax.swing.JLabel labelTempatLahir;
    private javax.swing.JTable tabelAnggota;
    private com.toedter.calendar.JDateChooser tanggalLahir;
    private com.toedter.calendar.JDateChooser tanggalMasuk;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoKtp;
    private javax.swing.JTextField txtPekerjaan;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
   
    private void urutan() {
      String sql = "select right(id_anggota,2) as a from anggota";
        try{
            stat = conn.prepareStatement(sql);
            rs = stat.executeQuery(sql);
            if (rs.first()==false){
               txtIdAnggota.setText("K01");
            }else{
                rs.last();
                int no = rs.getInt(1)+1;
                String cno = String.valueOf(no);
                int pjg_cno = cno.length();
                for (int i=0;i<2-pjg_cno;i++){
                    cno = "0"+cno;
                }
                txtIdAnggota.setText("K"+cno);
            }
        }catch (Exception se){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal ! Periksa Koneksi");
        }    }
    
    private ResultSet dataAnggota(){
        try{
            String SQL = "SELECT * from anggota order by id_anggota asc ";
            stat = conn.createStatement();
            rs=stat.executeQuery(SQL);
        } catch (Exception e){
        }
        return rs;
      }
  
        private DefaultTableModel tabelModelAnggota(){
           int rows =0;
           String [] namaKolom={"ID","Nama","Tanggal Lahir","Tempat Lahir","JK","No KTP","Agama","Pekerjaan","Alamat","Telepon","Tanggal Masuk"};
           int baris = 0;
           try{
               while(rs.next()){
                   baris = rs.getRow();
               }
               rs.beforeFirst();
               dataAnggota = new String[baris][namaKolom.length];
               for(int i = 0; i < baris; i++){
                   rs.next();
                    for(int j=0; j < namaKolom.length;j++){
                        dataAnggota[i][j] =rs.getString(j+1);
                    }
               }
           }catch (Exception ex) {}
           return new DefaultTableModel(dataAnggota,namaKolom);
       }
    
    public void tabelDataAnggota(){
        try{
            rs = dataAnggota();
            tabelAnggota.setModel(tabelModelAnggota());         
        }catch (Exception e){
            e.getMessage();
        }
    }

    private void ubahData() {
        String idAng = txtIdAnggota.getText();
        try{
                String SQL = "update anggota set nama_anggota=?, tgl_lhr=?, tpt_lhr=?, jenis_kelamin=?,no_ktp=?,agama=?,pekerjaan=?,alamat=?,telepon=?,create_date=?"                       
                        + "WHERE id_anggota ='" + idAng + "'";
                PreparedStatement PS = conn.prepareStatement(SQL);
                PS.setString(1, txtNama.getText());
                PS.setString(2, String.valueOf(sdf.format(tanggalLahir.getDate())));   
                PS.setString(3, txtTempatLahir.getText());               
                PS.setString(4, comboBoxJenisKelamin.getSelectedItem().toString());
                PS.setString(5, txtNoKtp.getText());
                PS.setString(6, comboAgama.getSelectedItem().toString());  
                PS.setString(7, txtPekerjaan.getText());
                PS.setString(8, txtAlamat.getText());
                PS.setString(9, txtTelepon.getText());               
                PS.setString(10, String.valueOf(sdf.format(tanggalMasuk.getDate()))); 
                
                int data = PS.executeUpdate();
                    if(data !=0){
                            JOptionPane.showMessageDialog(this, "Data Berhasil diubah");
                            tabelDataAnggota();
                            bersihdata();
                    }
                    else{
                         JOptionPane.showMessageDialog(this, "Data gagal diubah");
                    }
        }catch (SQLException se){
             JOptionPane.showMessageDialog(this, "Data gagal diubah" + se.getMessage());
        }
    }

    private void bersihdata() {
        btnubah.setEnabled(false);
        txtNama.setText(""); 
        txtTempatLahir.setText("");
        txtAlamat.setText("");
        txtNoKtp.setText("");
        txtPekerjaan.setText("");
        txtTelepon.setText("");       
        txtIdAnggota.setEnabled(false);
        tanggalLahir.setCalendar(null);        
        tanggalMasuk.setCalendar(null);
    }

    private void hapusdata() {
        String id = txtIdAnggota.getText();
        try{
            String SQL = "DELETE FROM anggota WHERE id_anggota ='" + id + "'";
            stat=conn.createStatement();
            int data = stat.executeUpdate(SQL);
            if(data != 0 )
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil dihapus");
                            tabelDataAnggota();
                            bersihdata();
                           
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data Gagal dihapus");
            }
        }catch (SQLException se)
        {
             JOptionPane.showMessageDialog(this, "Data Gagal dihapus" + se.getMessage());
        }
    }
    
    private void simpanData() {          
       String idAnggota = txtIdAnggota.getText();
       String nama = txtNama.getText();
       String jenisKelamin = comboBoxJenisKelamin.getSelectedItem().toString();
       String tempatLahir = txtTempatLahir.getText();
       String tglLahir = String.valueOf(sdf.format(tanggalLahir.getDate()));
       String alamat = txtAlamat.getText();
       String telepon = txtTelepon.getText();
       String noKtp = txtNoKtp.getText();
       String agama = comboAgama.getSelectedItem().toString();
       String pekerjaan = txtPekerjaan.getText();
       String tglMasuk  = String.valueOf(sdf.format(tanggalMasuk.getDate()));
       
        if(nama.equals("") || jenisKelamin.equals("") || tempatLahir.equals("") || tglLahir.isEmpty() || tglMasuk.isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong"
                + "\nPeriksa Kembali");
        }
        else
        {
            try{
                String SQL = " INSERT INTO anggota VALUES"
                        +"('" + idAnggota + "','" 
                        + nama + "','"
                        + tglLahir + "','"
                        + tempatLahir + "','"
                        + jenisKelamin + "','"  
                        + noKtp + "','"
                        + agama + "','"
                        + pekerjaan + "','"
                        + alamat + "','"
                        + telepon + "','"                                              
                        + tglMasuk + "')";
             
                stat = conn.createStatement();
                int data = stat.executeUpdate(SQL);
                if(data != 0){
                    JOptionPane.showMessageDialog(this, "Data  berhasil disimpan");
                    bersihdata();
                    tabelDataAnggota();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Data  gagal disimpan");
                }} catch (SQLException se){
                    JOptionPane.showMessageDialog
                            (this, "Data  gagal disimpan"+se.getMessage());       
            }}
    }
    
    
     private void ambildata() {
        int row = tabelAnggota.getSelectedRow();
        txtIdAnggota.setText(tabelAnggota.getValueAt(row, 0).toString());
        txtNama.setText(tabelAnggota.getValueAt(row, 1).toString());
        //tanggalLahir.setDateFormatString(tabelAnggota.getValueAt(row, 2).toString());
        txtTempatLahir.setText(tabelAnggota.getValueAt(row, 3).toString());
        comboBoxJenisKelamin.setSelectedItem(tabelAnggota.getValueAt(row, 4).toString());
        txtNoKtp.setText(tabelAnggota.getValueAt(row, 5).toString());
        comboAgama.setSelectedItem(tabelAnggota.getValueAt(row, 6).toString());
        txtPekerjaan.setText(tabelAnggota.getValueAt(row, 7).toString());
        txtAlamat.setText(tabelAnggota.getValueAt(row, 8).toString());
        txtTelepon.setText(tabelAnggota.getValueAt(row, 9).toString());        
        //tanggalMasuk.setDateFormatString(tabelAnggota.getValueAt(row, 10).toString());  
          
        btnubah.setEnabled(true);
    }
    
}
