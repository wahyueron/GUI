
import java.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class selasa extends javax.swing.JFrame {

    /**
     * Creates new form selasa
     */
    Connection con = null;
    public DefaultTableModel model;
    public selasa() {
        initComponents();
        con = config.getConnection();
    
    
        
        
        String[] header1 = {"Mulai","Matkul","Selesai"};
        model = new DefaultTableModel(header1,0);
        jTable1.setModel(model);
        
        tampil_jadwal();
        
    }
    
    public void tampil_jadwal(){
        
       if(logindosen.idDosen == 3|| informatika.dosenId == 3){
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select waktu_mulai,nama_matkul,waktu_selesai from jadwal where hari = 'selasa' and dosen_id = 3");
            while(rs.next()){
                String[] baris = {rs.getString(1),rs.getString(2),rs.getString(3)};
                model.addRow(baris);
            }
                    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }   
       }else if (logindosen.idDosen == 1 || informatika.dosenId == 1){
           try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select waktu_mulai,nama_matkul,waktu_selesai from jadwal where hari = 'selasa' and dosen_id = 1");
            while(rs.next()){
                String[] baris = {rs.getString(1),rs.getString(2),rs.getString(3)};
                model.addRow(baris);
            }
                    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }   
       }else if (logindosen.idDosen==2|| tpb.dosenid == 2){
           try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select waktu_mulai,nama_matkul,waktu_selesai from jadwal where hari = 'selasa' and dosen_id = 2");
            while(rs.next()){
                String[] baris = {rs.getString(1),rs.getString(2),rs.getString(3)};
                model.addRow(baris);
            }
                    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }   
       }else if (logindosen.idDosen==4 || informatika.dosenId == 4){
           try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select waktu_mulai,nama_matkul,waktu_selesai from jadwal where hari = 'selasa' and dosen_id = 4");
            while(rs.next()){
                String[] baris = {rs.getString(1),rs.getString(2),rs.getString(3)};
                model.addRow(baris);
            }
                    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }   
       }else if (logindosen.idDosen==5 || tpb.dosenid == 5){
           try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select waktu_mulai,nama_matkul,waktu_selesai from jadwal where hari = 'selasa' and dosen_id = 5");
            while(rs.next()){
                String[] baris = {rs.getString(1),rs.getString(2),rs.getString(3)};
                model.addRow(baris);
            }
                    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }   
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Selasa");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 20, 47, 23);

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        jTable1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 375, 177);

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 250, 55, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/rsz_anak.jpg"))); // NOI18N
        jLabel2.setText("  ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 40, 207, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Jadwal se = new Jadwal();
        se.setVisible(true);
        this.dispose();        
                
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(selasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
