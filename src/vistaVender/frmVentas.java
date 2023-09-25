package vistaVender;

import Modelo.Cliente;
import Modelo.Compra;
import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.Ventas;
import Modelo.auxiliar;
import ModeloDAO.ClienteDAO;
import ModeloDAO.DetalleVentaDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.VentaDAO;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVentas extends javax.swing.JFrame {
    String resumen="";
    ArrayList<Compra> cad_compra = new ArrayList();
    ProductoDAO obj = new ProductoDAO();
    ClienteDAO c= new ClienteDAO();
    DetalleVentaDAO dtv=new DetalleVentaDAO();
    VentaDAO vdao=new VentaDAO();
    
    DefaultTableModel model1 = new DefaultTableModel();
    double total = 0;

    public frmVentas() {
        initComponents();
        muestraImgLupa();
        muestraImgAgregar();
        muestraImgLimpiar();
        muestraImgDoctor();
        listarTabla();
        muestraImgCarrito();
        muestraImgRetroceder();
    }
    
   
    void mostrarCarrito() {
        DefaultTableModel dt = (DefaultTableModel) tabla2.getModel();
        dt.setRowCount(0);
        for (Compra p : cad_compra) {
            Object v[] = {p.getNombreProducto(), p.getPrecioProducto(), p.getCantidadProducto(), p.getMonto()};
            dt.addRow(v);
        }
    }

    

    void muestraImgAgregar() {
        String cad = "agregar";
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/Imagenes/" + cad + ".png";
        // se carga en memoria
        ImageIcon img = new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc = img.getImage().getScaledInstance(lbBtnAgregar.getWidth(), lbBtnAgregar.getHeight(), Image.SCALE_SMOOTH);
        lbBtnAgregar.setIcon(new ImageIcon(imgsc));
    }
    
    void muestraImgLupa() {
        String cad = "lupa";
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/Imagenes/" + cad + ".png";
        // se carga en memoria
        ImageIcon img = new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc = img.getImage().getScaledInstance(lbLupa.getWidth(), lbLupa.getHeight(), Image.SCALE_SMOOTH);
        lbLupa.setIcon(new ImageIcon(imgsc));
    }
    
    void muestraImgDoctor() {
        String cad = "doctor";
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/Imagenes/" + cad + ".png";
        // se carga en memoria
        ImageIcon img = new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc = img.getImage().getScaledInstance(lbDoctor.getWidth(), lbDoctor.getHeight(), Image.SCALE_SMOOTH);
        lbDoctor.setIcon(new ImageIcon(imgsc));
    }

    void muestraImgLimpiar() {
        String cad = "limpiar";
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/Imagenes/" + cad + ".png";
        // se carga en memoria
        ImageIcon img = new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc = img.getImage().getScaledInstance(lbBtnLimpiar.getWidth(), lbBtnLimpiar.getHeight(), Image.SCALE_SMOOTH);
        lbBtnLimpiar.setIcon(new ImageIcon(imgsc));
    }

    void muestraImgCarrito() {
        String cad = "carritoCompra";
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/Imagenes/" + cad + ".png";
        // se carga en memoria
        ImageIcon img = new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc = img.getImage().getScaledInstance(lbCarritoCompra.getWidth(), lbCarritoCompra.getHeight(), Image.SCALE_SMOOTH);
        lbCarritoCompra.setIcon(new ImageIcon(imgsc));
    }

    void muestraImgRetroceder() {
        String cad = "retroceder";
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta + "/Imagenes/" + cad + ".png";
        // se carga en memoria
        ImageIcon img = new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc = img.getImage().getScaledInstance(lbRetroceder.getWidth(), lbRetroceder.getHeight(), Image.SCALE_SMOOTH);
        lbRetroceder.setIcon(new ImageIcon(imgsc));
    }

    void listarTabla() {

        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        for (Producto p : obj.listarTodo()) {
            Object v[] = {p.getNombre(), p.getProveedor().getNombreProv(), p.getPrecio(), p.getStock()};
            dt.addRow(v);
        }
    }

    public Compra buscarNombre(String nombre) {
        for (Compra c : cad_compra) {
            if (c.getNombreProducto().equals(nombre)) {
                return c;
            }
        }
        return null;
    }
    
    public void montoTotal(){
        total = 0;
        for (Compra c : cad_compra) {
            total+=c.getMonto();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbDoctor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lbBtnAgregar = new javax.swing.JLabel();
        lbBtnLimpiar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbCarritoCompra = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbRetroceder = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        lbLupa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("VENTA DE PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 32, -1, -1));
        jPanel1.add(lbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 320, 327));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 361, -1, -1));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 358, 157, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel3.setText("Cantidad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 490, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 487, 75, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 427, -1, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 424, 75, -1));

        lbBtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBtnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(lbBtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 557, 60, 55));

        lbBtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBtnLimpiarMouseClicked(evt);
            }
        });
        jPanel1.add(lbBtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 557, 60, 64));

        tabla1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Proveedor", "Precio un.", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla1);
        if (tabla1.getColumnModel().getColumnCount() > 0) {
            tabla1.getColumnModel().getColumn(0).setResizable(false);
            tabla1.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla1.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 82, 510, 215));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 680));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio un.", "Cantidad", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tabla2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 507, 257));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel5.setText("Total :  S/. ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 83, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButton1.setText("Procesar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, 30));

        lbCarritoCompra.setToolTipText("");
        jPanel2.add(lbCarritoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 103, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("CARRITO DE COMPRA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 26, -1, -1));

        lbRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRetrocederMouseClicked(evt);
            }
        });
        jPanel2.add(lbRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 40, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel7.setText("Cliente:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 126, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel8.setText("Dni:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 86, -1, -1));

        txtDni.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 86, 76, -1));

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 126, 207, -1));

        lbLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLupaMouseClicked(evt);
            }
        });
        jPanel2.add(lbLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 29, 30));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 490, 180));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 590, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void lbBtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnLimpiarMouseClicked
        
        txtCantidad.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
    }//GEN-LAST:event_lbBtnLimpiarMouseClicked

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        int f = tabla1.getSelectedRow();
        txtNombre.setText(tabla1.getValueAt(f, 0).toString());
        txtPrecio.setText(tabla1.getValueAt(f, 2).toString());
    }//GEN-LAST:event_tabla1MouseClicked

    private void lbBtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnAgregarMouseClicked

        String nombre = txtNombre.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        
        
        Producto produc=new Producto();
        
        produc=obj.listarUno(nombre);
        
        
        int StockActual=produc.getStock();
         System.out.println(produc.getNombre());
        
        if (cantidad<= StockActual){
            
            produc.setStock(StockActual-cantidad);
            
            double monto = precio * cantidad;
            Compra c = new Compra(nombre, precio, cantidad, monto);
            
            if (cad_compra.size() == 0) {
                
                cad_compra.add(c);
            } else {
                
                Compra buscar = buscarNombre(nombre);
                if (buscar == null) {
 
            
                    cad_compra.add(c);
                } else {
                    for (int i = 0; i < cad_compra.size(); i++) {
                        if (cad_compra.get(i).getNombreProducto().equals(nombre)) {
                            int cantidadAnterior = cad_compra.get(i).getCantidadProducto();
                            cad_compra.get(i).setCantidadProducto(cantidadAnterior + cantidad);
                            double montoNuevo = cad_compra.get(i).getCantidadProducto() * cad_compra.get(i).getPrecioProducto();
                            cad_compra.get(i).setMonto(montoNuevo);
                            
                        }
                    }
                }
            }
            listarTabla();
            obj.modificar(produc);
            mostrarCarrito();
            montoTotal();
            
             
            
            txtTotal.setText("" + total);
        }else{
            JOptionPane.showMessageDialog(null, "No hay suficiente Stock");
        }
        
        listarTabla();

    }//GEN-LAST:event_lbBtnAgregarMouseClicked

    private void lbRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetrocederMouseClicked
        dispose(); //ocultar jframe
        frmPrincipal fp = new frmPrincipal();//crear objeto de Frm Principal
        fp.setVisible(true);//haciendo visible el objeto creado
    }//GEN-LAST:event_lbRetrocederMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-YYYY");
        Date fecha = new Date();
        auxiliar aux = new auxiliar();
        
        //Objeto Venta
        Ventas v=new Ventas();
        v.setDniCli(txtDni.getText());
        v.setFechaVenta(dt.format(fecha));
        v.setIDtrabajador(aux.getTr().getIdUser());
        v.setIdVenta(0);
        v.setMontoTotal(Double.parseDouble(txtTotal.getText()));
        //Objeto VentaDAO
        vdao.agregar(v);
        
        int idveta=vdao.listarTodo().get(vdao.listarTodo().size()-1).getIdVenta();
        //Objeto detalleVentaDAO
        resumen+="Producto\tCanitdad\tPrecio\tSubTotal\n";
        for (int i = 0; i < cad_compra.size(); i++) {
            DetalleVenta dv=new DetalleVenta();
            dv.setCantidad(cad_compra.get(i).getCantidadProducto());
            dv.setIdventa(idveta);
            dv.setNombreProduc(cad_compra.get(i).getNombreProducto());
            dv.setPrecio(cad_compra.get(i).getPrecioProducto());
            dv.setSubtotal(dv.getPrecio()*dv.getCantidad());
            resumen+=dv.getNombreProduc()+"\t"+dv.getCantidad()+"\t"+dv.getPrecio()+"\t"+dv.getSubtotal()+"\n";
            
            dtv.agregar(dv);
        }
        resumen+="Cliente: "+txtCliente.getText()+"\n"+
                "Vendedor: "+aux.getTr().getNombreTrab()+" "+aux.getTr().getApellidoTrab()+"\n";
                 resumen+="Total de compra: S/."+txtTotal.getText()+"\n";
                 resumen+="GRACIAS POR SU COMPRA. VUELVA PRONTO";
        txtArea.setText(resumen);
       resumen="";

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void lbLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLupaMouseClicked
       //------------------------
       Cliente cli=new Cliente();
       cli=c.listarUno(txtDni.getText());
        if (cli==null) {
            JOptionPane.showMessageDialog(null, "No se encontro Cliente");
        }else{
            txtCliente.setText(cli.getNombres()+" "+cli.getApellidos());
        }
       
    }//GEN-LAST:event_lbLupaMouseClicked

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtArea.setText("");
        txtDni.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbBtnAgregar;
    private javax.swing.JLabel lbBtnLimpiar;
    private javax.swing.JLabel lbCarritoCompra;
    private javax.swing.JLabel lbDoctor;
    private javax.swing.JLabel lbLupa;
    private javax.swing.JLabel lbRetroceder;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
