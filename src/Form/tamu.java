
package Form;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class tamu extends javax.swing.JFrame {

   Connection conn = new koneksi_mysql().getConnection();
   
    public tamu() {
        initComponents();
        tampil_Tamu();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        b_refersh_tamu = new javax.swing.JButton();
        b_cari_kamar2 = new javax.swing.JButton();
        t_cari_tamu = new javax.swing.JTextField();
        b_tambah_tamu = new javax.swing.JButton();
        b_cekout = new javax.swing.JButton();
        b_history = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_tamu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jPanel8.setBackground(new java.awt.Color(204, 102, 0));

        jLabel6.setBackground(new java.awt.Color(204, 51, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("INFORMASI DATA TAMU");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        b_refersh_tamu.setBackground(new java.awt.Color(255, 255, 255));
        b_refersh_tamu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_refersh_tamu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/9.png"))); // NOI18N
        b_refersh_tamu.setText("Refresh");
        b_refersh_tamu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh_tamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refersh_tamuActionPerformed(evt);
            }
        });

        b_cari_kamar2.setBackground(new java.awt.Color(255, 255, 255));
        b_cari_kamar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cari_kamar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/13.PNG"))); // NOI18N
        b_cari_kamar2.setText("Cari");
        b_cari_kamar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari_kamar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cari_kamar2ActionPerformed(evt);
            }
        });

        t_cari_tamu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari_tamu.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari_tamu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cari_tamuKeyTyped(evt);
            }
        });

        b_tambah_tamu.setBackground(new java.awt.Color(255, 255, 255));
        b_tambah_tamu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_tambah_tamu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/17.png"))); // NOI18N
        b_tambah_tamu.setText("CEK IN");
        b_tambah_tamu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_tambah_tamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambah_tamuActionPerformed(evt);
            }
        });

        b_cekout.setBackground(new java.awt.Color(255, 255, 255));
        b_cekout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cekout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/18.png"))); // NOI18N
        b_cekout.setText("CEK OUT");
        b_cekout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cekout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cekoutActionPerformed(evt);
            }
        });

        b_history.setBackground(new java.awt.Color(255, 255, 255));
        b_history.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/19.png"))); // NOI18N
        b_history.setText("History");
        b_history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_historyActionPerformed(evt);
            }
        });

        tbl_tamu.setBackground(new java.awt.Color(204, 102, 0));
        tbl_tamu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbl_tamu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(t_cari_tamu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cari_kamar2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(b_refersh_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_tambah_tamu)
                        .addGap(30, 30, 30)
                        .addComponent(b_cekout)
                        .addGap(32, 32, 32)
                        .addComponent(b_history, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_history)
                    .addComponent(b_cekout)
                    .addComponent(b_tambah_tamu)
                    .addComponent(b_refersh_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cari_tamu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cari_kamar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private DefaultTableModel tabmode;
   
    
    public void tampil_Tamu(){
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Tanggal Cek In","Jam Cek In"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_tamu.setModel(tabmode);
        try {
            String sql = "SELECT tb_tamu.*,  tb_kamar.* FROM tb_tamu, tb_kamar WHERE tb_tamu.kode_kamar=tb_kamar.kode_kamar ORDER BY tb_kamar.kode_kamar asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String tgl_cek_in = hasil.getString("tgl_cek_in");
                String jam_cek_in = hasil.getString("jam_cek_in");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, tgl_cek_in, jam_cek_in};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void cari_Tamu(){
        String cari = t_cari_tamu.getText();
        Object []baris = {"ID/No Tamu","Nama Tamu","Jenis Kelamin","Alamat","No Tlp","Kode Kamar","Lantai","No Kamar","Tipe Kamar","Tanggal Cek In","Jam Cek In"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_tamu.setModel(tabmode);
        try{
            String sql = "SELECT tb_tamu.*, tb_kamar.* FROM tb_tamu INNER JOIN tb_kamar ON tb_tamu.kode_kamar=tb_kamar.kode_kamar WHERE "
                    + "no_tamu like '%"+cari+"%' "
                    + "OR nama_tamu like '%"+cari+"%' "
                    + "OR jenis_kelamin like '%"+cari+"%' "
                    + "OR alamat like '%"+cari+"%' "
                    + "OR no_tlp like '%"+cari+"%' "
                    + "OR tb_tamu.kode_kamar like '%"+cari+"%' "
                    + "OR lantai like '%"+cari+"%' "
                    + "OR no_kamar like '%"+cari+"%' "
                    + "OR tipe_kamar like '%"+cari+"%' "
                    + "OR tgl_cek_in like '%"+cari+"%' "
                    + "OR jam_cek_in like '%"+cari+"%' "
                    + "order by tb_tamu.kode_kamar asc";
            Statement stmt=conn.createStatement();
            ResultSet hasil=stmt.executeQuery(sql);
            while(hasil.next()){
                String no_tamu = hasil.getString("no_tamu");
                String nama_tamu = hasil.getString("nama_tamu");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String kode_kamar = hasil.getString("tb_tamu.kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String tgl_cek_in = hasil.getString("tgl_cek_in");
                String jam_cek_in = hasil.getString("jam_cek_in");
                String[] data = {no_tamu, nama_tamu, jenis_kelamin, alamat, no_tlp, kode_kamar, lantai, no_kamar, tipe_kamar, tgl_cek_in, jam_cek_in};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
    }
        
    private void b_refersh_tamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refersh_tamuActionPerformed
        // TODO add your handling code here:
        tampil_Tamu();
    }//GEN-LAST:event_b_refersh_tamuActionPerformed

    private void b_tambah_tamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambah_tamuActionPerformed
        cek_in form_cekin = new cek_in(this, rootPaneCheckingEnabled);
        form_cekin.l_judul.setText("CEK IN");
        form_cekin.ketemu_kamar();
        form_cekin.setVisible(true);
    }//GEN-LAST:event_b_tambah_tamuActionPerformed

    private void b_cari_kamar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cari_kamar2ActionPerformed
        cari_Tamu();
    }//GEN-LAST:event_b_cari_kamar2ActionPerformed

    private void t_cari_tamuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cari_tamuKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Tamu();
        }
    }//GEN-LAST:event_t_cari_tamuKeyTyped

    private void b_cekoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cekoutActionPerformed
        cek_out form_cekout = new cek_out(this, rootPaneCheckingEnabled);
        form_cekout.ketemu_Tamu();
        cek_out.l_judul.setText("CEK OUT");
        int baris = tbl_tamu.getSelectedRow();
        String kode = (String)tbl_tamu.getValueAt(baris, 0);
        form_cekout.c_no_tamu.setSelectedItem(kode);
        form_cekout.cari_ID_Tamu();
        form_cekout.cari_Kode_Kamar();
        form_cekout.hitung_TotalBayar();
        form_cekout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_cekoutActionPerformed

    private void b_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_historyActionPerformed
        history_tamu form_history = new history_tamu(this, rootPaneCheckingEnabled);
        form_history.setVisible(true);
    }//GEN-LAST:event_b_historyActionPerformed

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
            java.util.logging.Logger.getLogger(tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tamu().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cari_kamar2;
    private javax.swing.JButton b_cekout;
    private javax.swing.JButton b_history;
    private javax.swing.JButton b_refersh_tamu;
    private javax.swing.JButton b_tambah_tamu;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField t_cari_tamu;
    private javax.swing.JTable tbl_tamu;
    // End of variables declaration//GEN-END:variables

}
