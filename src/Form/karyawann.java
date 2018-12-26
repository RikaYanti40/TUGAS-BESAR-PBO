
package Form;


import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class karyawann extends javax.swing.JFrame {

   Connection conn = new koneksi_mysql().getConnection();
   
    public karyawann() {
        initComponents();
        tampil_karyawan();
       
    }
    
        karyawann(utama aThis, boolean rootPaneCheckingEnabled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        b_refersh_karyawan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_karyawan = new javax.swing.JTable();
        b_tambah_karyawan = new javax.swing.JButton();
        b_edit_karyawan = new javax.swing.JButton();
        b_delete_karyawan = new javax.swing.JButton();
        b_cari_karyawan = new javax.swing.JButton();
        t_cari_karyawan = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(735, 593));

        b_refersh_karyawan.setBackground(new java.awt.Color(255, 255, 255));
        b_refersh_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_refersh_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/9.png"))); // NOI18N
        b_refersh_karyawan.setText("Refresh");
        b_refersh_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refersh_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refersh_karyawanActionPerformed(evt);
            }
        });

        tbl_karyawan.setBackground(new java.awt.Color(204, 102, 0));
        tbl_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_karyawan);

        b_tambah_karyawan.setBackground(new java.awt.Color(255, 255, 255));
        b_tambah_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_tambah_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/15.png"))); // NOI18N
        b_tambah_karyawan.setText("Tambah");
        b_tambah_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_tambah_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tambah_karyawanActionPerformed(evt);
            }
        });

        b_edit_karyawan.setBackground(new java.awt.Color(255, 255, 255));
        b_edit_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_edit_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/11.png"))); // NOI18N
        b_edit_karyawan.setText("Edit");
        b_edit_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_edit_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_edit_karyawanActionPerformed(evt);
            }
        });

        b_delete_karyawan.setBackground(new java.awt.Color(255, 255, 255));
        b_delete_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_delete_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/12.png"))); // NOI18N
        b_delete_karyawan.setText("Delete");
        b_delete_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_delete_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_delete_karyawanActionPerformed(evt);
            }
        });

        b_cari_karyawan.setBackground(new java.awt.Color(255, 255, 255));
        b_cari_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_cari_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/13.PNG"))); // NOI18N
        b_cari_karyawan.setText("Cari");
        b_cari_karyawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cari_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cari_karyawanActionPerformed(evt);
            }
        });

        t_cari_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t_cari_karyawan.setToolTipText("Ketikkan yang akan dicari DISINI");
        t_cari_karyawan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_cari_karyawanKeyTyped(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMASI KARYAWAN");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b_refersh_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_tambah_karyawan)
                                .addGap(18, 18, 18)
                                .addComponent(b_edit_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_delete_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(t_cari_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(b_cari_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_refersh_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_tambah_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_edit_karyawan)
                    .addComponent(b_delete_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cari_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_cari_karyawan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(448, 448, 448))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_cari_karyawanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cari_karyawanKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            cari_Karyawan();
        }
    }//GEN-LAST:event_t_cari_karyawanKeyTyped

    private void b_cari_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cari_karyawanActionPerformed
        cari_Karyawan();
    }//GEN-LAST:event_b_cari_karyawanActionPerformed

    private void b_delete_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_delete_karyawanActionPerformed
        int baris = tbl_karyawan.getSelectedRow();
        String id_karyawan = (String)tbl_karyawan.getValueAt(baris, 0);
        int ok = JOptionPane.showConfirmDialog(null,"Apakah anda yakin ingin menghapus data Karyawan\n Dengan ID : "+ id_karyawan +"..?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try{
                //panggil method koneksi
                String sql="DELETE FROM tb_karyawan WHERE id_karyawan ='"+id_karyawan+"'";
                Statement st = conn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Menghapus data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_karyawan();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Meghapus data GAGAL");
            }
        }
    }//GEN-LAST:event_b_delete_karyawanActionPerformed

    private void b_edit_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_edit_karyawanActionPerformed
        // TODO add your handling code here:
        tambah_edit_karyawan karyawan = new tambah_edit_karyawan(this, rootPaneCheckingEnabled);
        karyawan.l_judul.setText("EDIT DATA KARYAWAN");
        int baris = tbl_karyawan.getSelectedRow();
        String id_karyawan = (String)tbl_karyawan.getValueAt(baris, 0);
        karyawan.t_id_karyawan.setText(id_karyawan);
        karyawan.t_id_karyawan.setEnabled(false);
        karyawan.cari_Id();
        karyawan.setVisible(true);
    }//GEN-LAST:event_b_edit_karyawanActionPerformed

    private void b_tambah_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tambah_karyawanActionPerformed
        tambah_edit_karyawan a = new tambah_edit_karyawan(this, rootPaneCheckingEnabled);
        a.l_judul.setText("TAMBAH KARYAWAN");
        a.t_id_karyawan.setText(null);
        a.t_id_karyawan.setEnabled(true);
        a.setVisible(true);
    }//GEN-LAST:event_b_tambah_karyawanActionPerformed

    private void b_refersh_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refersh_karyawanActionPerformed
        // TODO add your handling code here:
        tampil_karyawan();
        t_cari_karyawan.setText(null);
    }//GEN-LAST:event_b_refersh_karyawanActionPerformed
    
    
    private DefaultTableModel tabmode;
    
    public void tampil_karyawan(){
        Object []baris = {"ID Karyawan","Nama Karyawan","Jenis Kelamin","Alamat","No Tlp"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_karyawan.setModel(tabmode);
        try {
            String sql = "SELECT * FROM tb_karyawan order by id_karyawan asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id_karyawan = hasil.getString("id_karyawan");
                String nama_karyawan = hasil.getString("nama_karyawan");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String alamat = hasil.getString("alamat");
                String no_tlp = hasil.getString("no_tlp");
                String[] data = {id_karyawan, nama_karyawan, jenis_kelamin, alamat, no_tlp};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
    public void cari_Karyawan(){
        String cari = t_cari_karyawan.getText();
        Object []baris = {"ID Karyawan","Nama Karyawan","Jenis Kelamin","Alamat","No Tlp"};
        tabmode = new DefaultTableModel(null, baris);
        tbl_karyawan.setModel(tabmode);
        try{
            String sql="Select * from tb_karyawan where id_karyawan like '%"+cari+"%' or nama_karyawan like '%"+cari+"%' or jenis_kelamin like '%"+cari+"%' or alamat like '%"+cari+"%' or no_tlp like '%"+cari+"%' order by id_karyawan asc";
            Statement stmt=conn.createStatement();
            ResultSet rslt=stmt.executeQuery(sql);
            while(rslt.next()){
                String id_karyawan=rslt.getString("id_karyawan");
                String nama_karyawan=rslt.getString("nama_karyawan");
                String jenis_kelamin=rslt.getString("jenis_kelamin");
                String alamat=rslt.getString("alamat");
                String no_tlp=rslt.getString("no_tlp");
                String[] data={id_karyawan,nama_karyawan,jenis_kelamin,alamat,no_tlp};
                tabmode.addRow(data);
            }
        }
        catch(Exception ex){
        }
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
            java.util.logging.Logger.getLogger(karyawann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawann.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawann().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cari_karyawan;
    public javax.swing.JButton b_delete_karyawan;
    public javax.swing.JButton b_edit_karyawan;
    public javax.swing.JButton b_refersh_karyawan;
    public javax.swing.JButton b_tambah_karyawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_cari_karyawan;
    private javax.swing.JTable tbl_karyawan;
    // End of variables declaration//GEN-END:variables
}
