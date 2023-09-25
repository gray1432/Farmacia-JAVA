
package vistaCliente;

import Modelo.Cliente;
import ModeloDAO.ClienteDAO;
import vistaProductos.*;
import vistaVender.*;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmRegistroCliente extends javax.swing.JFrame {
    ClienteDAO obj=new ClienteDAO();
    
    public frmRegistroCliente() {
        initComponents();
        muestraImgRegistro();
        muestraImgRetroceder();
        txtCodigo.setText(obj.codigo());
    }
    
    void limpiar(){
        txtApellidos.setText("");
        txtCodigo.setText("");
        txtDni.setText("");
        txtNombres.setText("");
        txtNum.setText("");
    }
   void muestraImgRegistro(){
        String cad="cliente";
        String ruta= new File("src").getAbsolutePath();
        ruta=ruta+"/Imagenes/"+cad+".png";
        // se carga en memoria
        ImageIcon img=new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc= img.getImage().getScaledInstance(lbImgRegistro.getWidth(), lbImgRegistro.getHeight(), Image.SCALE_SMOOTH);
        lbImgRegistro.setIcon(new ImageIcon(imgsc));
    }
   void muestraImgRetroceder(){
        String cad="retroceder";
        String ruta= new File("src").getAbsolutePath();
        ruta=ruta+"/Imagenes/"+cad+".png";
        // se carga en memoria
        ImageIcon img=new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc= img.getImage().getScaledInstance(lbRetroceder.getWidth(), lbRetroceder.getHeight(), Image.SCALE_SMOOTH);
        lbRetroceder.setIcon(new ImageIcon(imgsc));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        DNI = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DNI1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbImgRegistro = new javax.swing.JLabel();
        lbRetroceder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resgistro de Clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        DNI.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DNI.setText("Dni :");
        jPanel1.add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 239, -1, -1));

        txtDni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 166, -1));

        txtNombres.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 166, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Nombres :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 279, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Apellidos :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 319, -1, -1));

        txtApellidos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 166, -1));

        txtNum.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 166, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Telf : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 359, -1, -1));

        DNI1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DNI1.setText("Codigo:");
        jPanel1.add(DNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 193, -1, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 166, -1));
        jPanel1.add(lbImgRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 138, 127));

        lbRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRetrocederMouseClicked(evt);
            }
        });
        jPanel1.add(lbRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 410, 36, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //evento al dar click al boton Retroceder
    private void lbRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetrocederMouseClicked
        dispose(); //ocultar jframe
        frmPrincipal fp=new frmPrincipal();//crear objeto de Frm Principal
        fp.setVisible(true);//haciendo visible el objeto creado
    }//GEN-LAST:event_lbRetrocederMouseClicked
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombres,dni,apellidos,telf,codigo;
        apellidos=txtApellidos.getText();
        nombres=txtNombres.getText();
        dni=txtDni.getText();
        telf=txtNum.getText();
        codigo=txtCodigo.getText();

        Cliente c=new Cliente(codigo,dni, nombres, apellidos, telf);

        obj.agregar(c);
        JOptionPane.showMessageDialog(null, "Cliente Registrado");
        limpiar();
        txtCodigo.setText(obj.codigo());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel DNI1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImgRegistro;
    private javax.swing.JLabel lbRetroceder;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
