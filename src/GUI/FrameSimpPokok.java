package GUI;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

public class FrameSimpPokok extends javax.swing.JInternalFrame {
    
    Connection conn ;
    Statement stat;
    ResultSet rs;
    String[][]dataSimpananPokok;
    String formatTanggal = "yyyy-MM-dd";
    SimpleDateFormat sdf = new SimpleDateFormat(formatTanggal);     
       
    public FrameSimpPokok() {
        initComponents();
        conn = new DB.DBConnection().setConnection();
        urutan();
        txtIdSimpanan.setEnabled(false);  
        btnubah.setEnabled(false);
        btnhapus1.setEnabled(false);
        txtNama.setEnabled(false);
        tabelDataSimpananPokok();
        tambahId();
        //tambahTipe();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelAnggota = new javax.swing.JLabel();
        txtIdSimpanan = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        labelJenisKelamin = new javax.swing.JLabel();
        labelTempatLahir = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        labelTanggalLahir = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        tanggalBayar = new com.toedter.calendar.JDateChooser();
        txtNama = new javax.swing.JTextField();
        tanggalBerlaku = new com.toedter.calendar.JDateChooser();
        comboIdAnggota = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        btnubah = new javax.swing.JButton();
        btnhapus1 = new javax.swing.JButton();
        btnbatal1 = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSimpanan = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(949, 600));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(871, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelAnggota.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelAnggota.setText("ID Simpanan");

        txtIdSimpanan.setMinimumSize(new java.awt.Dimension(6, 25));
        txtIdSimpanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSimpananActionPerformed(evt);
            }
        });

        labelNama.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelNama.setText("ID Anggota");

        labelJenisKelamin.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelJenisKelamin.setText("Nama");

        labelTempatLahir.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelTempatLahir.setText("Jumlah");

        txtJumlah.setMinimumSize(new java.awt.Dimension(6, 25));

        labelTanggalLahir.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelTanggalLahir.setText("Tanggal Bayar");

        labelAlamat.setFont(new java.awt.Font("Andalus", 0, 16)); // NOI18N
        labelAlamat.setText("Tanggal Berlaku");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        comboIdAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdAnggotaActionPerformed(evt);
            }
        });

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
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdSimpanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboIdAnggota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJenisKelamin)
                            .addComponent(labelTempatLahir)
                            .addComponent(labelTanggalLahir)
                            .addComponent(labelAlamat))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tanggalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(txtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNama)
                            .addComponent(tanggalBerlaku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdSimpanan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnggota))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNama)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboIdAnggota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelJenisKelamin)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(labelTempatLahir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTanggalLahir)
                            .addComponent(tanggalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(labelAlamat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tanggalBerlaku, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        btnhapus1.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        btnhapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/HPS.png"))); // NOI18N
        btnhapus1.setText("HAPUS");
        btnhapus1.setPreferredSize(new java.awt.Dimension(89, 32));
        btnhapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapus1ActionPerformed(evt);
            }
        });

        btnbatal1.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        btnbatal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/application-exit.png"))); // NOI18N
        btnbatal1.setText("BATAL");
        btnbatal1.setPreferredSize(new java.awt.Dimension(89, 32));
        btnbatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatal1ActionPerformed(evt);
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

        jButton2.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/email-testing.png"))); // NOI18N
        jButton2.setText("KELUAR");
        jButton2.setPreferredSize(new java.awt.Dimension(97, 32));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(btnubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhapus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnhapus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbatal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelSimpanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Simpanan Pokok", "ID Anggota", "Nama", "Jumlah Simpanan Pokok", "Tanggal Bayar", "Tanggal Aktif"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelSimpanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSimpananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelSimpanan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        ubahData();
        urutan();
        btnhapus1.setEnabled(false);
        btnsimpan.setEnabled(true);
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnbatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatal1ActionPerformed
        bersihdata();
        btnsimpan.setEnabled(true);
        btnubah.setEnabled(false);
        urutan();
        bersihdata();
        tabelDataSimpananPokok();
    }//GEN-LAST:event_btnbatal1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtIdSimpananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSimpananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSimpananActionPerformed

    private void tabelSimpananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSimpananMouseClicked
        ambildata();
        btnhapus1.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnubah.setEnabled(true);
    }//GEN-LAST:event_tabelSimpananMouseClicked

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        simpanData();
        urutan();
        txtIdSimpanan.setEnabled(false);
        btnhapus1.setEnabled(false);
        btnubah.setEnabled(false);
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnhapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapus1ActionPerformed
        hapusdata();
        btnsimpan.setEnabled(true);
        urutan();
        btnubah.setEnabled(false);        
        btnhapus1.setEnabled(false);
    }//GEN-LAST:event_btnhapus1ActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void comboIdAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdAnggotaActionPerformed
       namaId();
    }//GEN-LAST:event_comboIdAnggotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal1;
    private javax.swing.JButton btnhapus1;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JComboBox comboIdAnggota;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelAnggota;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTanggalLahir;
    private javax.swing.JLabel labelTempatLahir;
    private javax.swing.JTable tabelSimpanan;
    private com.toedter.calendar.JDateChooser tanggalBayar;
    private com.toedter.calendar.JDateChooser tanggalBerlaku;
    private javax.swing.JTextField txtIdSimpanan;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
   
    private void urutan() {
      String sql = "select right(id_simp_pokok,2) as a from simpanan_pokok ORDER BY a ASC";
        try{
            stat = conn.prepareStatement(sql);
            rs = stat.executeQuery(sql);
            if (rs.first()==false){
               txtIdSimpanan.setText("SP01");
            }else{
                rs.last();
                int no = rs.getInt(1)+1;
                String cno = String.valueOf(no);
                int pjg_cno = cno.length();
                for (int i=0;i<2-pjg_cno;i++){
                    cno = "0"+cno;
                }
                txtIdSimpanan.setText("SP"+cno);
            }
        }catch (Exception se){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal ! Periksa Koneksi");
        }    
    }
    
    private ResultSet dataSimpananPokok(){
        try{
            String SQL = "SELECT * from simpanan_pokok order by id_simp_pokok asc ";
            stat = conn.createStatement();
            rs=stat.executeQuery(SQL);
        } catch (Exception e){
        }
        return rs;
      }
  
    private DefaultTableModel tabelModel(){
           int rows =0;
           String [] namaKolom={"ID","ID Anggota","Nama","Jumlah SP","Tanggal Bayar","Tanggal Aktif"};
           int baris = 0;
           try{
               while(rs.next()){
                   baris = rs.getRow();
               }
               rs.beforeFirst();
               dataSimpananPokok = new String[baris][namaKolom.length];
               for(int i = 0; i < baris; i++){
                   rs.next();
                    for(int j=0; j < namaKolom.length;j++){
                        dataSimpananPokok[i][j] =rs.getString(j+1);
                    }
               }
           }catch (Exception ex) {}
           return new DefaultTableModel(dataSimpananPokok,namaKolom);
       }
    
    public void tabelDataSimpananPokok(){
        try{
            rs = dataSimpananPokok();
            tabelSimpanan.setModel(tabelModel());         
        }catch (Exception e){
            e.getMessage();
        }
    }
    
    private void tambahId() {
          String sql = "select id_anggota from anggota order by id_anggota asc" ;
       try{
           Statement stat = conn.createStatement();
           ResultSet rs = stat.executeQuery(sql);
           while(rs.next()){
               String nama = rs.getString("id_anggota");
               comboIdAnggota.addItem(nama);
           }
           stat.close();
       }catch (SQLException se){}
    }
    
   /* private void namaTipe() {
       
      String sql = "select * from tbl_type_kamar  where "
              + "type_kamar='" + cmbtipe.getSelectedItem()+ 
              "'";
      
    }
     
    private void tambahTipe() {
          String sql = " select type_kamar from tbl_type_kamar order by type_kamar asc" ;
       try{
           Statement stat = conn.createStatement();
           ResultSet rs = stat.executeQuery(sql);
           while(rs.next()){
               String nama = rs.getString("type_kamar");
               cmbtipe.addItem(nama);
           }
           stat.close();
       }catch (SQLException se){}
    }
    */
      private void namaId() {
       
      String sql = "SELECT * FROM anggota WHERE "
              + "id_anggota='" + comboIdAnggota.getSelectedItem()+ 
              "'";
      try{
          Statement stat = conn.createStatement();
          ResultSet rs = stat.executeQuery(sql);
          if(rs.next())
          {
              String nama = rs.getString("nama_anggota");
              txtNama.setText(nama);

          }else
          {
             
              txtNama.setText("");
          }
          stat.close();
          
    }catch (SQLException se){}
    
      
    }
       
    private void simpanData() {       
       String idSimPokok = txtIdSimpanan.getText();
       String idAnggota = comboIdAnggota.getSelectedItem().toString();
       String nama = txtNama.getText();
       String jumlahSp = txtJumlah.getText();
       String tglBayar  = String.valueOf(sdf.format(tanggalBayar.getDate()));
       String tglBerlaku  = String.valueOf(sdf.format(tanggalBerlaku.getDate()));     
       
        if(idSimPokok.equals("") || nama.equals("") || idAnggota.equals("") || jumlahSp.equals("") || tglBayar.isEmpty() || tglBerlaku.isEmpty() )
        {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong"
                + "\nPeriksa Kembali");
        }
        else
        {
            try{
                String SQL = " INSERT INTO simpanan_pokok VALUES"
                        +"('" + idSimPokok + "','" 
                        + idAnggota + "','"
                        + nama + "','"
                        + jumlahSp + "','"
                        + tglBayar + "','"  
                        + tglBerlaku + "')";
             
                stat = conn.createStatement();
                int data = stat.executeUpdate(SQL);
                if(data != 0){
                    JOptionPane.showMessageDialog(this, "Data  berhasil disimpan");
                    bersihdata();
                    tabelDataSimpananPokok();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Data  gagal disimpan");
                }} catch (SQLException se){
                    JOptionPane.showMessageDialog
                            (this, "Data  gagal disimpan"+se.getMessage());       
            }}
    }
    

    private void ubahData() {
        String id = txtIdSimpanan.getText();
        try{
                String SQL = "update simpanan_pokok set id_anggota=?, nama_anggota=?, Jumlah_sp=?, createDate=?,forDate=?"                       
                        + "WHERE id_simp_pokok ='" + id + "'";
                PreparedStatement PS = conn.prepareStatement(SQL);
                PS.setString(1, comboIdAnggota.getSelectedItem().toString());
                PS.setString(2, txtNama.getText());
                PS.setString(3, txtJumlah.getText());                                           
                PS.setString(4, String.valueOf(sdf.format(tanggalBayar.getDate())));                                         
                PS.setString(5, String.valueOf(sdf.format(tanggalBerlaku.getDate())));
                
                int data = PS.executeUpdate();
                    if(data !=0){
                             JOptionPane.showMessageDialog(this, "Data Berhasil diubah");
                             tabelDataSimpananPokok();
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
        tanggalBayar.setCalendar(null);
        tanggalBerlaku.setCalendar(null);
        txtJumlah.setText("");          
        txtIdSimpanan.setEnabled(false);
    }

    private void hapusdata() {
        String id = txtIdSimpanan.getText();
        try{
            String SQL = "DELETE FROM simpanan_pokok WHERE id_simp_pokok ='" + id + "'";
            stat=conn.createStatement();
            int data = stat.executeUpdate(SQL);
            if(data != 0 )
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil dihapus");
                            tabelDataSimpananPokok();
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
    
     private void ambildata() {
        int row = tabelSimpanan.getSelectedRow();
        txtIdSimpanan.setText(tabelSimpanan.getValueAt(row, 0).toString());
        comboIdAnggota.setSelectedItem(tabelSimpanan.getValueAt(row, 1).toString());
        txtNama.setText(tabelSimpanan.getValueAt(row,2).toString());
        txtJumlah.setText(tabelSimpanan.getValueAt(row,3).toString());
       // tanggalBayar.setDateFormatString(tabelSimpanan.getValueAt(row, 4).toString());
       // tanggalBerlaku.setDateFormatString(tabelSimpanan.getValueAt(row, 5).toString());      
                
        btnubah.setEnabled(true);
    }
    
}
