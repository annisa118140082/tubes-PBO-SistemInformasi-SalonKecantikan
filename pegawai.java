package awal;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class pegawai extends javax.swing.JFrame {
    
    private void kosongkan(){
        txtID.setEditable(true);
        txtID.setText(null);
        txtNama.setText(null);
        txtAlamat.setText(null);
        txtHP.setText(null);
    }
    private void tampilkan(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No ");
        model.addColumn("ID Pegawai");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("No.Telpon");
        try{
            int no=1; //buat nambahin kolom nomor
            String sql="SELECT *FROM pegawai"; //memanggil nama file kita
            java.sql.Connection conn=(Connection)Awal.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet b=stm.executeQuery(sql);
            
            while(b.next()){
                model.addRow(new Object[]{no++, b.getString(1),b.getString(2),b.getString(3),b.getString(4)});
                
            }
          tabelPegawai.setModel(model);
        }catch (SQLException a){
            System.out.println("Error : "+a.getMessage());
        }
    }
    public  pegawai() {
        initComponents();
        tampilkan();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtHP = new javax.swing.JTextField();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPegawai = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PEGAWAI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 160, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("ID Pegawai");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 65, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 120, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("No. Telpon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 270, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 300, -1));
        getContentPane().add(txtHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 150, -1));

        tbTambah.setForeground(new java.awt.Color(204, 0, 0));
        tbTambah.setText("Tambah Data");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tbTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        tbSimpan.setForeground(new java.awt.Color(204, 0, 0));
        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 90, -1));

        tbEdit.setForeground(new java.awt.Color(204, 0, 0));
        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });
        getContentPane().add(tbEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 80, -1));

        tbHapus.setForeground(new java.awt.Color(255, 0, 0));
        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });
        getContentPane().add(tbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 80, -1));

        tbBatal.setForeground(new java.awt.Color(255, 0, 0));
        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });
        getContentPane().add(tbBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 80, -1));

        tbKeluar.setForeground(new java.awt.Color(255, 0, 0));
        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 80, -1));

        tabelPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nomor", "ID Pegawai", "Nama", "Title 4", "No. telpon"
            }
        ));
        tabelPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPegawai);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 620, 100));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        pack();
    }// </editor-fold>                        

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {                                      

        kosongkan();    
    }                                     

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {                                         
  
        kosongkan();
        txtID.setFocusable(true);   
    }                                        

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {                                         
      
           try{
            String sql;
            sql = "insert into pegawai values('"+txtID.getText()+"','"+txtNama.getText()+"','"+txtAlamat.getText()+"','"+txtHP.getText()+"')";
            java.sql.Connection conn=(Connection)Awal.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
            tampilkan();
            kosongkan();
        }
           catch(HeadlessException | SQLException a){
            JOptionPane.showMessageDialog(this,a.getMessage());
        }
    }                                        

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
       try{
            String sql;
           sql = "update pegawai set ID_Pegawai='"+txtID.getText()+"',Nama='"+txtNama.getText()+"',Alamat='"+txtAlamat.getText()+"',no_telp='"+txtHP.getText()+"' where ID_Pegawai='"+txtID.getText()+"'";
            java.sql.Connection conn=(Connection)Awal.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Berhasil Edit data");
        }catch(HeadlessException | SQLException a){
            JOptionPane.showMessageDialog(this,a.getMessage());
        }
        tampilkan();
        kosongkan();
    }                                      

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        System.exit(0); 
    }                                        

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
           try{
            String sql="delete from pegawai where ID_Pegawai='"+txtID.getText()+"'";
            java.sql.Connection conn=(Connection)Awal.configDB();
            java.sql.PreparedStatement pstm=conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Berhasil Hapus data");
        }catch(HeadlessException | SQLException a){
            JOptionPane.showMessageDialog(this,a.getMessage());
        }
        tampilkan();
        kosongkan();
    }                                       

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        kosongkan();
    }                                       

    private void tabelPegawaiMouseClicked(java.awt.event.MouseEvent evt) {                                          
      
        int baris = tabelPegawai.rowAtPoint(evt.getPoint());
        
        String ID_Pegawai = tabelPegawai.getValueAt(baris, 1).toString();
        txtID.setText(ID_Pegawai);
        
        String Nama = tabelPegawai.getValueAt(baris, 2).toString();
        txtNama.setText(Nama);
       
        String Alamat = tabelPegawai.getValueAt(baris, 3).toString();
        txtAlamat.setText(Alamat);
        String no_telp = tabelPegawai.getValueAt(baris, 4).toString();
        txtHP.setText(no_telp);
    }                                         

 
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(() -> {
            new pegawai().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPegawai;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtHP;
    private java.awt.TextField txtID;
    private javax.swing.JTextField txtNama;
    // End of variables declaration                   

    
}
