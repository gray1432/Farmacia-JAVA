
package vistaProductos;

import Modelo.Producto;
import Modelo.Proveedor;
import ModeloDAO.ProductoDAO;
import ModeloDAO.ProveedorDAO;
import vistaVender.*;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmListaProductos extends javax.swing.JFrame {

    ProductoDAO obj=new ProductoDAO();
    
    public frmListaProductos() {
        initComponents();
        muestraImgRetroceder();
        listar();
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
    
    void listar(){
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);
        for (Producto p : obj.listarTodo()) {
            Object v[] = {p.getIdProducto(),p.getNombre(),p.getPrecio(),p.getStock(),p.getProveedor().getNombreProv()};
            dt.addRow(v);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbRetroceder = new javax.swing.JLabel();
        btnOrdenarXPrecioStock = new javax.swing.JButton();
        btnBusqIndexada = new javax.swing.JButton();
        btnOrdenarXNombre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Lista de productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 6, -1, -1));

        jPanel1.setBackground(new java.awt.Color(77, 255, 249));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio unit.", "Stock", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lbRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRetrocederMouseClicked(evt);
            }
        });

        btnOrdenarXPrecioStock.setText("Ordenar Precio Stock");
        btnOrdenarXPrecioStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXPrecioStockActionPerformed(evt);
            }
        });

        btnBusqIndexada.setText("Busq. Indexada por Nombre");
        btnBusqIndexada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusqIndexadaActionPerformed(evt);
            }
        });

        btnOrdenarXNombre.setText("Ordenar Nombre");
        btnOrdenarXNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarXNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrdenarXPrecioStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdenarXNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBusqIndexada)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnOrdenarXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnOrdenarXPrecioStock, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnBusqIndexada, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(149, 149, 149))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetrocederMouseClicked
        dispose(); //ocultar jframe
        frmPrincipal fp=new frmPrincipal();//crear objeto de Frm Principal
        fp.setVisible(true);//haciendo visible el objeto creado
    }//GEN-LAST:event_lbRetrocederMouseClicked

    private void btnOrdenarXPrecioStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXPrecioStockActionPerformed
        ordenarProductoXPrecioStockInsercion();
    }//GEN-LAST:event_btnOrdenarXPrecioStockActionPerformed

    private void btnBusqIndexadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusqIndexadaActionPerformed
        busquedaIndexadaXID();
    }//GEN-LAST:event_btnBusqIndexadaActionPerformed

    private void btnOrdenarXNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarXNombreActionPerformed
        ordenarProductoXNombreShellSort();
    }//GEN-LAST:event_btnOrdenarXNombreActionPerformed

    
     ///Metodo para ordenar productos por precio stock utlilizando insercion
    private void ordenarProductoXPrecioStockInsercion() {
        // Obtener la lista de productos de la BD almacenada
        ProductoDAO productoDAO = new ProductoDAO();
        ArrayList<Producto> listaProductos = productoDAO.listarTodo();

        // Implementa el algoritmo de ordenación de inserción para ordenar la lista por precio stock
        int n = listaProductos.size();
        for (int i = 1; i < n; i++) {
            Producto key = listaProductos.get(i);
            int j = i - 1;

            // Mueve los elementos de listaClientes[0..i-1] que son mayores que key.getStock()
            // a una posición adelante de su posición actual
            while (j >= 0 && key.getStock() < listaProductos.get(j).getStock()) {
                listaProductos.set(j + 1, listaProductos.get(j));
                j = j - 1;
            }
            listaProductos.set(j + 1, key);
        }

        // Actualiza la tabla con la lista ordenada
        actualizarTabla(listaProductos);
    }
    
    
    
    
    
    ///Metodo para ordenar productos por nombre utilizando Shell Sort
    private void ordenarProductoXNombreShellSort() {
        // Obtener la lista de productos de la BD almacenada
        ProductoDAO productoDAO = new ProductoDAO();
        ArrayList<Producto> listaProductos = productoDAO.listarTodo();

        // Implementa el algoritmo Shell Sort para ordenar la lista por nombres
        int n = listaProductos.size();
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Producto temp = listaProductos.get(i);
                int j = i;
                while (j >= gap && listaProductos.get(j - gap).getNombre().compareTo(temp.getNombre()) > 0) {
                    listaProductos.set(j, listaProductos.get(j - gap));
                    j -= gap;
                }
                listaProductos.set(j, temp);
            }
            gap /= 2;
        }

        // Actualiza la tabla con la lista ordenada
        actualizarTabla(listaProductos);
    }
    

    
    
    ///Metodo para buscar un nombre de proveedor utilizando Busqueda Indexada
    private void busquedaIndexadaXID() {
    // Solicitar al usuario que ingrese el ID del producto a buscar
    String idProductoBusq = JOptionPane.showInputDialog("Ingrese IDPRODUCTO a buscar:");

    // Obtener la lista de productos de la BD almacenada
    ProductoDAO productoDAO = new ProductoDAO();
    ArrayList<Producto> listaProductos = productoDAO.listarTodo();

    // Inicializar la variable para almacenar el producto encontrado
    Producto productoEncontrado = null;

    // Buscar el producto por ID en la lista de productos
    for (Producto producto : listaProductos) {
        // Compara el ID del producto como una cadena
        if (producto.getIdProducto().equals(idProductoBusq)) {
            productoEncontrado = producto;
            break; // Se encontró el producto, salir del bucle
        }
    }

    // Verificar si se encontró el producto y mostrar el resultado
    if (productoEncontrado != null) {
        String nombreDelProveedor = (productoEncontrado.getProveedor() != null) ? productoEncontrado.getProveedor().getNombreProv() : "Proveedor no especificado";
        JOptionPane.showMessageDialog(rootPane, "Producto encontrado:\nNombre: " + productoEncontrado.getNombre() + "\nProveedor: " + nombreDelProveedor);
    } else {
        JOptionPane.showMessageDialog(rootPane, "Producto no encontrado...");
    }

    // Actualizar la tabla con la lista ordenada
    actualizarTabla(listaProductos);
}
    
        
    // Método para actualizar la tabla con la lista de clientes ordenada
    private void actualizarTabla(ArrayList<Producto> listaProductos) {
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);

        for (Producto p : listaProductos) {
            Object[] fila = {p.getIdProducto(), p.getNombre(), p.getPrecio(), p.getStock(), p.getProveedor()};
            dt.addRow(fila);
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
            java.util.logging.Logger.getLogger(frmListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqIndexada;
    private javax.swing.JButton btnOrdenarXNombre;
    private javax.swing.JButton btnOrdenarXPrecioStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbRetroceder;
    // End of variables declaration//GEN-END:variables
}
