
package Form;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class kamar extends javax.swing.JFrame {

   Connection conn = new koneksi_mysql().getConnection();
   
    public kamar() {
        initComponents();
        tampil_kamar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        b_refersh_kamar = new javax.swing.JButton();
        b_tambah_kamar = new javax.swing.JButton();
        b_edit_kamar = new javax.swing.JButton();
        b_delete_kamar = new javax.swing.JButton();
        b_cari_kamar = new javax.swing.JButton();
        t_cari_kamar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_kamar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jPanel6.setBackground(new java.awt.Color(204, 102, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("INFORMASI DATA KAMAR");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        b_refersh_kamar.setBackground(new java.awt.Color(255, 255, 255));
        b_refersh_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_refersh_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/9.png"))); // NOI18N
        b_refersh_kamar.setText("Refresh");
        b_refersh_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refersh_kamarActionPerformed(evt);
            }
        });

        b_tambah_kamar.setBackground(new java.awt.Color(255, 255, 255));
        b_tambah_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_tambah_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/10.png"))); // NOI18N
        b_tambah_kamar.setText("Tambah");
        b_tambah_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_tambah_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambah_kamarActionPerformed(evt);
            }
        });

        b_edit_kamar.setBackground(new java.awt.Color(255, 255, 255));
        b_edit_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_edit_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/11.png"))); // NOI18N
        b_edit_kamar.setText("Edit");
        b_edit_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_edit_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_edit_kamarActionPerformed(evt);
            }
        });

        b_delete_kamar.setBackground(new java.awt.Color(255, 255, 255));
        b_delete_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_delete_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/12.png"))); // NOI18N
        b_delete_kamar.setText("Delete");
        b_delete_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_delete_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_delete_kamarActionPerformed(evt);
            }
        });

        b_cari_kamar.setBackground(new java.awt.Color(255, 255, 255));
        b_cari_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cari_kamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/13.PNG"))); // NOI18N
        b_cari_kamar.setText("Cari");
        b_cari_kamar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cari_kamarActionPerformed(evt);
            }
        });

        t_cari_kamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari_kamar.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari_kamar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cari_kamarKeyTyped(evt);
            }
        });

        tbl_kamar.setBackground(new java.awt.Color(204, 102, 0));
        tbl_kamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbl_kamar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(t_cari_kamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_cari_kamar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(b_refersh_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_tambah_kamar)
                        .addGap(18, 18, 18)
                        .addComponent(b_edit_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_delete_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_refersh_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_tambah_kamar)
                    .addComponent(b_edit_kamar)
                    .addComponent(b_delete_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cari_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cari_kamar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
   
    private DefaultTableModel tabmode;
   
    
    public void tampil_kamar(){
        Object []baris = {"Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga Per Malam"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_kamar.setModel(tabmode);
        try {
            String sql = "SELECT * FROM tb_kamar order by kode_kamar asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga_permalam = hasil.getString("harga_permalam");
                String[] data = {kode_kamar, lantai, no_kamar, tipe_kamar, harga_permalam};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void cari_Kamar(){
        String cari = t_cari_kamar.getText();
        Object []baris = {"Kode Kamar","Lantai","No Kamar","Tipe Kamar","Harga Per Malam"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_kamar.setModel(tabmode);
        try{
            String sql="Select * from tb_kamar where "
                    + "kode_kamar like '%"+cari+"%' "
                    + "or lantai like '%"+cari+"%' "
                    + "or no_kamar like '%"+cari+"%' "
                    + "or tipe_kamar like '%"+cari+"%' "
                    + "or harga_permalam like '%"+cari+"%' "
                    + "order by kode_kamar asc";
            Statement stmt=conn.createStatement();
            ResultSet hasil=stmt.executeQuery(sql);
            while(hasil.next()){
                String kode_kamar = hasil.getString("kode_kamar");
                String lantai = hasil.getString("lantai");
                String no_kamar = hasil.getString("no_kamar");
                String tipe_kamar = hasil.getString("tipe_kamar");
                String harga_permalam = hasil.getString("harga_permalam");
                String[] data = {kode_kamar, lantai, no_kamar, tipe_kamar, harga_permalam};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
    }
    
        
    private void b_tambah_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambah_kamarActionPerformed
        tambah_edit_kamar kamar = new tambah_edit_kamar(this, rootPaneCheckingEnabled);
        kamar.l_judul.setText("TAMBAH KAMAR");
        kamar.t_kode_kamar.setText(null);
        kamar.t_kode_kamar.setEnabled(true);
        kamar.setVisible(true);
    }//GEN-LAST:event_b_tambah_kamarActionPerformed

    private void b_refersh_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refersh_kamarActionPerformed
        // TODO add your handling code here:
        tampil_kamar();
    }//GEN-LAST:event_b_refersh_kamarActionPerformed

    private void b_edit_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_edit_kamarActionPerformed
        tambah_edit_kamar a = new tambah_edit_kamar(this, rootPaneCheckingEnabled);
        a.l_judul.setText("EDIT DATA KAMAR");
        int baris = tbl_kamar.getSelectedRow();
        String kode = (String)tbl_kamar.getValueAt(baris, 0);
        a.t_kode_kamar.setText(kode);
        a.t_kode_kamar.setEnabled(false);
        a.cari_Kode_kamar();
        a.setVisible(true);
    }//GEN-LAST:event_b_edit_kamarActionPerformed

    private void b_cari_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cari_kamarActionPerformed
        cari_Kamar();
    }//GEN-LAST:event_b_cari_kamarActionPerformed

    private void t_cari_kamarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cari_kamarKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Kamar();
        }
    }//GEN-LAST:event_t_cari_kamarKeyTyped

    private void b_delete_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_delete_kamarActionPerformed
        int baris = tbl_kamar.getSelectedRow();
        String kode = (String)tbl_kamar.getValueAt(baris, 0);
        int ok = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data Kamar\n Dengan Kode Kamar : "+ kode +"..?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try{
                //panggil method koneksi
                String sql="DELETE FROM tb_kamar WHERE kode_kamar ='"+kode+"'";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Menghapus data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_kamar();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Meghapus data GAGAL");
            }
        }
    }//GEN-LAST:event_b_delete_kamarActionPerformed

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
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kamar().setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cari_kamar;
    private javax.swing.JButton b_delete_kamar;
    private javax.swing.JButton b_edit_kamar;
    private javax.swing.JButton b_refersh_kamar;
    private javax.swing.JButton b_tambah_kamar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t_cari_kamar;
    private javax.swing.JTable tbl_kamar;
    // End of variables declaration//GEN-END:variables

} 
