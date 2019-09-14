package GUI;

import javax.swing.JOptionPane;

public class FrameMenu extends javax.swing.JFrame {

    public FrameMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        background1 = new IMAGE.background();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuAnggota = new javax.swing.JMenuItem();
        MenuSimpPokok = new javax.swing.JMenuItem();
        MenuSimpWajib = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuLapAnggota = new javax.swing.JMenuItem();
        menuLapSimpPokok = new javax.swing.JMenuItem();
        menuLapSimpWajib = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("SELAMAT DATANG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SISTEM INFORMASI KOPERASI ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setText("GARUDAYAKSA NUSANTARA ");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel1))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel2)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar2.setName(""); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(230, 50));

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/ho.png"))); // NOI18N
        jMenu5.setText("HOME");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icondata.png"))); // NOI18N
        jMenu3.setText("INPUT DATA");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        menuAnggota.setText("Data Anggota");
        menuAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnggotaActionPerformed(evt);
            }
        });
        jMenu3.add(menuAnggota);

        MenuSimpPokok.setText("Data Simp Pokok");
        MenuSimpPokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSimpPokokActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSimpPokok);

        MenuSimpWajib.setText("Data Simp Wajib");
        MenuSimpWajib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSimpWajibActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSimpWajib);

        jMenuBar2.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/laporan_1.png"))); // NOI18N
        jMenu1.setText("LAPORAN");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuLapAnggota.setText("Anggota");
        menuLapAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLapAnggotaActionPerformed(evt);
            }
        });
        jMenu1.add(menuLapAnggota);

        menuLapSimpPokok.setText("Simpanan Pokok");
        menuLapSimpPokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLapSimpPokokActionPerformed(evt);
            }
        });
        jMenu1.add(menuLapSimpPokok);

        menuLapSimpWajib.setText("Simpanan Wajib");
        menuLapSimpWajib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLapSimpWajibActionPerformed(evt);
            }
        });
        jMenu1.add(menuLapSimpWajib);

        jMenuBar2.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/logout.png"))); // NOI18N
        jMenu2.setText("Keluar");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSimpPokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSimpPokokActionPerformed
        FrameSimpPokok FD = new FrameSimpPokok();
        jDesktopPane1.add(FD);
        FD.setVisible(true);
        FD.setSize(949,600);
        FD.toFront();
    }//GEN-LAST:event_MenuSimpPokokActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void menuLapAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLapAnggotaActionPerformed
        LaporanDataAnggota FD = new LaporanDataAnggota();
        jDesktopPane1.add(FD);
        FD.setVisible(true);
        FD.setSize(400,200);
        FD.toFront();
    }//GEN-LAST:event_menuLapAnggotaActionPerformed

    private void menuLapSimpPokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLapSimpPokokActionPerformed
        LaporanSimpPokok FD = new LaporanSimpPokok();
        jDesktopPane1.add(FD);
        FD.setVisible(true);
        FD.setSize(400,200);
        FD.toFront();
    }//GEN-LAST:event_menuLapSimpPokokActionPerformed

    private void menuAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnggotaActionPerformed
        FrameAnggota FA = new FrameAnggota();
        jDesktopPane1.add(FA);
        FA.setVisible(true);
        FA.setSize(949,600);
        FA.toFront();
    }//GEN-LAST:event_menuAnggotaActionPerformed

    private void MenuSimpWajibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSimpWajibActionPerformed
        FrameSimpWajib FW = new FrameSimpWajib();
        jDesktopPane1.add(FW);
        FW.setVisible(true);
        FW.setSize(949,600);
        FW.toFront();
    }//GEN-LAST:event_MenuSimpWajibActionPerformed

    private void menuLapSimpWajibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLapSimpWajibActionPerformed
        LaporanSimpWajib FD = new LaporanSimpWajib();
        jDesktopPane1.add(FD);
        FD.setVisible(true);
        FD.setSize(400,200);
        FD.toFront();
    }//GEN-LAST:event_menuLapSimpWajibActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        int reply = JOptionPane.showConfirmDialog(null, "Anda yakin untuk keluar?");
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
            new FrameLogin().setVisible(true);
        }
        else {

        }    
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
         FrameAnggota FD = new FrameAnggota(); 
         FD.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuSimpPokok;
    private javax.swing.JMenuItem MenuSimpWajib;
    private IMAGE.background background1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAnggota;
    private javax.swing.JMenuItem menuLapAnggota;
    private javax.swing.JMenuItem menuLapSimpPokok;
    private javax.swing.JMenuItem menuLapSimpWajib;
    // End of variables declaration//GEN-END:variables
}
