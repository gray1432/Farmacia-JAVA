
package vistaProveedor;

import Modelo.Proveedor;
import ModeloDAO.ProveedorDAO;
import vistaVender.*;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmListarProveedor extends javax.swing.JFrame {

    ProveedorDAO obj=new ProveedorDAO();
    
    public frmListarProveedor() {
        initComponents();
        muestraImgRetroceder();
    
        listar();
    }

    void listar(){
        DefaultTableModel dt=(DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        for (Proveedor p : obj.listarTodo()) {
            Object v[] = {p.getIdProveedor(),p.getNombreProv(),p.getNumTelf(),p.getDireccion()};
            dt.addRow(v);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        lbRetroceder = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnbusqBinaria = new javax.swing.JButton();
        busqSecID = new javax.swing.JButton();
        OrdenarNombres = new javax.swing.JButton();
        btnordenartelefono = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Proveedores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 83, 375, 275));

        lbRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(lbRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 6, 36, 36));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Proveedores");

        btnbusqBinaria.setText("Busq. Binaria por Telefono");
        btnbusqBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusqBinariaActionPerformed(evt);
            }
        });

        busqSecID.setText("Busq Secuencial ID");
        busqSecID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqSecIDActionPerformed(evt);
            }
        });

        OrdenarNombres.setText("Ordenar Nombres");
        OrdenarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarNombresActionPerformed(evt);
            }
        });

        btnordenartelefono.setText("Ordenar Telefono");
        btnordenartelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenartelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OrdenarNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(busqSecID, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnbusqBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnordenartelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OrdenarNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(btnordenartelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbusqBinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busqSecID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetrocederMouseClicked
        dispose(); //ocultar jframe
        frmPrincipal fp=new frmPrincipal();//crear objeto de Frm Principal
        fp.setVisible(true);//haciendo visible el objeto creado
    }//GEN-LAST:event_lbRetrocederMouseClicked
                                             
    
 

    private void btnbusqBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusqBinariaActionPerformed
        ProveedorDAO proveedorDAO = new ProveedorDAO();
        ArrayList<Proveedor> listaProveedor = proveedorDAO.listarTodo();
// Obtén el número de teléfono a buscar
    String telefonoBusqueda = JOptionPane.showInputDialog("Ingrese el número de teléfono a buscar:");

    // Llama al método para ordenar la lista de proveedores por teléfono
    proveedorDAO.ordenarProveedorAscPorTelefono();

    // Realiza la búsqueda binaria
    Proveedor proveedorEncontrado = buscarProveedorPorTelefono(proveedorDAO.listarTodo(), telefonoBusqueda);

    if (proveedorEncontrado != null) {
        // Si se encuentra el proveedor, muestra su información
        JOptionPane.showMessageDialog(rootPane, "Proveedor encontrado:\nNombre: " + proveedorEncontrado.getNombreProv() + "\nTeléfono: " + proveedorEncontrado.getNumTelf());
    } else {
        // Si no se encuentra el proveedor, muestra un mensaje de error
        JOptionPane.showMessageDialog(rootPane, "Proveedor no encontrado.");
    }
    }//GEN-LAST:event_btnbusqBinariaActionPerformed

    private Proveedor buscarProveedorPorTelefono(ArrayList<Proveedor> listaProveedor, String telefono) {
        int low = 0;
        int high = listaProveedor.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Proveedor proveedor = listaProveedor.get(mid);
            String proveedorTelefono = proveedor.getNumTelf();

            int comparison = telefono.compareTo(proveedorTelefono);

            if (comparison == 0) {
                // Número de teléfono encontrado
                return proveedor;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

//        // Número de teléfono no encontrado
        return null;
    }
    
    
    
    private void busqSecIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busqSecIDActionPerformed
// Muestra un cuadro de diálogo para ingresar el ID a buscar
    String idBusqueda = JOptionPane.showInputDialog("Ingrese el ID a buscar:");

    // Llama a la función de búsqueda secuencial por ID
    buscarProveedorPorID(idBusqueda);    }//GEN-LAST:event_busqSecIDActionPerformed

    private void OrdenarNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarNombresActionPerformed
        ordenarProveedoresPorNombresMergeSort();
    }//GEN-LAST:event_OrdenarNombresActionPerformed

    private void btnordenartelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenartelefonoActionPerformed
        ordenarProveedoresPorTelefonoQuickSort();
    }//GEN-LAST:event_btnordenartelefonoActionPerformed


    private void ordenarProveedoresPorNombresMergeSort() {
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    ArrayList<Proveedor> listaProveedor = proveedorDAO.listarTodo();

    // Ordena la lista utilizando el algoritmo Merge Sort
    mergeSortProveedoresPorNombres(listaProveedor);

    // Crea un nuevo DefaultTableModel para actualizar la tabla
    DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
    dt.setRowCount(0); // Limpia la tabla

    // Agrega los datos ordenados a la tabla
    for (Proveedor proveedor : listaProveedor) {
        Object[] row = {proveedor.getIdProveedor(), proveedor.getNombreProv(), proveedor.getNumTelf(), proveedor.getDireccion()};
        dt.addRow(row);
    }
}

private void mergeSortProveedoresPorNombres(ArrayList<Proveedor> listaProveedor) {
    if (listaProveedor.size() <= 1) {
        return;
    }

    int medio = listaProveedor.size() / 2;
    ArrayList<Proveedor> mitadIzquierda = new ArrayList<>(listaProveedor.subList(0, medio));
    ArrayList<Proveedor> mitadDerecha = new ArrayList<>(listaProveedor.subList(medio, listaProveedor.size()));

    mergeSortProveedoresPorNombres(mitadIzquierda);
    mergeSortProveedoresPorNombres(mitadDerecha);

    // Combina las mitades ordenadas
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
        if (mitadIzquierda.get(i).getNombreProv().compareTo(mitadDerecha.get(j).getNombreProv()) <= 0) {
            listaProveedor.set(k, mitadIzquierda.get(i));
            i++;
        } else {
            listaProveedor.set(k, mitadDerecha.get(j));
            j++;
        }
        k++;
    }

    while (i < mitadIzquierda.size()) {
        listaProveedor.set(k, mitadIzquierda.get(i));
        i++;
        k++;
    }

    while (j < mitadDerecha.size()) {
        listaProveedor.set(k, mitadDerecha.get(j));
        j++;
        k++;
    }
}

    
    private void buscarProveedorPorID(String idBusqueda) {
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    Proveedor proveedorEncontrado = proveedorDAO.listarUno(idBusqueda);

    if (proveedorEncontrado != null) {
        // Si se encuentra el proveedor, muestra su información en un JOptionPane
        String mensaje = "Proveedor encontrado:\n" +
                         "ID: " + proveedorEncontrado.getIdProveedor() + "\n" +
                         "Nombre: " + proveedorEncontrado.getNombreProv() + "\n" +
                         "Teléfono: " + proveedorEncontrado.getNumTelf() + "\n" +
                         "Dirección: " + proveedorEncontrado.getDireccion();
        JOptionPane.showMessageDialog(rootPane, mensaje);
    } else {
        // Si no se encuentra el proveedor, muestra un mensaje de error en un JOptionPane
        JOptionPane.showMessageDialog(rootPane, "Proveedor no encontrado.");
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    public void quickSortProveedoresPorTelefono(ArrayList<Proveedor> listaProveedor, int primero, int ultimo) {
        int i, j;
        i = primero;
        j = ultimo;

        // Obtén el número de teléfono del proveedor en la posición del pivote
        String pivot = listaProveedor.get((primero + ultimo) / 2).getNumTelf();

        do {
            // Compara los números de teléfono en lugar de enteros
            while (listaProveedor.get(i).getNumTelf().compareTo(pivot) < 0) {
                i++;
            }

            while (listaProveedor.get(j).getNumTelf().compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                Proveedor temp = listaProveedor.get(i);
                listaProveedor.set(i, listaProveedor.get(j));
                listaProveedor.set(j, temp);
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quickSortProveedoresPorTelefono(listaProveedor, primero, j);
        }

        if (i < ultimo) {
            quickSortProveedoresPorTelefono(listaProveedor, i, ultimo);
        }
    }

    private void ordenarProveedoresPorTelefonoQuickSort() {
        ProveedorDAO proveedorDAO = new ProveedorDAO();
        ArrayList<Proveedor> listaProveedor = proveedorDAO.listarTodo();

        quickSortProveedoresPorTelefono(listaProveedor, 0, listaProveedor.size() - 1);

        // Create a new DefaultTableModel to update the table
        DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0); // Clear the table

        // Add sorted data to the table
        for (Proveedor proveedor : listaProveedor) {
            Object[] row = {proveedor.getIdProveedor(), proveedor.getNombreProv(), proveedor.getNumTelf(), proveedor.getDireccion()};
            dt.addRow(row);
        }
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
    void muestraImgEliminar(){
        String cad="eliminar";
        String ruta= new File("src").getAbsolutePath();
        ruta=ruta+"/Imagenes/"+cad+".png";
        // se carga en memoria
        ImageIcon img=new ImageIcon(ruta);
        //se ajusta al label 
        Image imgsc= img.getImage().getScaledInstance(lbRetroceder.getWidth(), lbRetroceder.getHeight(), Image.SCALE_SMOOTH);
        lbRetroceder.setIcon(new ImageIcon(imgsc));
    }
    
    
    
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
            java.util.logging.Logger.getLogger(frmListarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OrdenarNombres;
    private javax.swing.JButton btnbusqBinaria;
    private javax.swing.JButton btnordenartelefono;
    private javax.swing.JButton busqSecID;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRetroceder;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
