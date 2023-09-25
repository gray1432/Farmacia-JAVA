
package vistaCliente;

import Modelo.Cliente;
import ModeloDAO.ClienteDAO;
import vistaProductos.*;
import vistaVender.*;
import java.awt.Image;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmListaClientes extends javax.swing.JFrame {

    ClienteDAO obj=new ClienteDAO();

    
    public frmListaClientes() {
        initComponents();
        muestraImgRetroceder();
        listar();
        
        btnOrdenarDNI.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent evt) {
                  btnOrdenarDNIActionPerformed(evt);
              }
          });
        
        btnOrdenarNombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnOrdenarNombreActionPerformed(evt);
            }
        });
        
        btnbusqApellidoSec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                busqApellidoSec();
            }
        });
        
        
        btnOrdenarTelefono.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ordenarClientesPorTelefonoInsercion();
            }
        });
        btnOrdenarNombreApellido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ordenarClientesPorApellidosDNISeleccion();
            }
        });
        
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
        DefaultTableModel dt=(DefaultTableModel) tabla1.getModel();
        dt.setRowCount(0);
        for (Cliente c : obj.listarTodo()) {
            Object v[] = {c.getDni(),c.getNombres(),c.getApellidos(),c.getNumtelf()};
            dt.addRow(v);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbRetroceder = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnOrdenarDNI = new javax.swing.JButton();
        btnOrdenarNombre = new javax.swing.JButton();
        btnbusqApellidoSec = new javax.swing.JButton();
        btnOrdenarNombreApellido = new javax.swing.JButton();
        btnOrdenarTelefono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 6, -1, -1));

        lbRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(lbRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 44, 36, 36));

        jPanel1.setBackground(new java.awt.Color(77, 255, 249));

        tabla1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Telf"
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

        btnOrdenarDNI.setText("Ordenar DNI");
        btnOrdenarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarDNIActionPerformed(evt);
            }
        });

        btnOrdenarNombre.setText("Ordenar Nombres");
        btnOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombreActionPerformed(evt);
            }
        });

        btnbusqApellidoSec.setText("Busqueda Apellido Secuencial");
        btnbusqApellidoSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusqApellidoSecActionPerformed(evt);
            }
        });

        btnOrdenarNombreApellido.setText("Ordenar Apellidos y DNI");
        btnOrdenarNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarNombreApellidoActionPerformed(evt);
            }
        });

        btnOrdenarTelefono.setText("Ordenar Telefonos");
        btnOrdenarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOrdenarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdenarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdenarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnbusqApellidoSec)
                .addGap(18, 18, 18)
                .addComponent(btnOrdenarNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOrdenarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOrdenarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdenarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbusqApellidoSec, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenarNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetrocederMouseClicked
        dispose(); //ocultar jframe
        frmPrincipal fp=new frmPrincipal();//crear objeto de Frm Principal
        fp.setVisible(true);//haciendo visible el objeto creado
    }//GEN-LAST:event_lbRetrocederMouseClicked



    
    
    
    
    
    
    /////BOTON ORDENAR POR DNI///////

    private void btnOrdenarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarDNIActionPerformed

    ordenarClientesPorDNI();
    }//GEN-LAST:event_btnOrdenarDNIActionPerformed

    private void btnOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombreActionPerformed
        ordenarClientesPorNombresShellSort();
    }//GEN-LAST:event_btnOrdenarNombreActionPerformed

    private void btnbusqApellidoSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusqApellidoSecActionPerformed
        busqApellidoSec();
    }//GEN-LAST:event_btnbusqApellidoSecActionPerformed

    private void btnOrdenarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarTelefonoActionPerformed
        ordenarClientesPorTelefonoInsercion();
    }//GEN-LAST:event_btnOrdenarTelefonoActionPerformed

    private void btnOrdenarNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarNombreApellidoActionPerformed
        ordenarClientesPorApellidosDNISeleccion();
    }//GEN-LAST:event_btnOrdenarNombreApellidoActionPerformed

    
    // Método para ordenar clientes por DNI burbuja
private void ordenarClientesPorDNI() {
    // Obtén la lista de clientes actual desde la base de datos o donde la tengas almacenada
    ClienteDAO clienteDAO = new ClienteDAO();
    ArrayList<Cliente> listaClientes = clienteDAO.listarTodo();

    // Implementa el algoritmo de ordenamiento burbuja para ordenar la lista por DNI
    int n = listaClientes.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            // Compara los DNIs de dos clientes y realiza el intercambio si es necesario
            if (listaClientes.get(j).getDni().compareTo(listaClientes.get(j + 1).getDni()) > 0) {
                Cliente temp = listaClientes.get(j);
                listaClientes.set(j, listaClientes.get(j + 1));
                listaClientes.set(j + 1, temp);
            }
        }
    }

    // Actualiza la tabla con la lista ordenada
    actualizarTabla(listaClientes);
}



    // Método para ordenar clientes por nombres utilizando Shell Sort
    private void ordenarClientesPorNombresShellSort() {
        // Obtén la lista de clientes actual desde la base de datos o donde la tengas
        // almacenada
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> listaClientes = clienteDAO.listarTodo();

        // Implementa el algoritmo Shell Sort para ordenar la lista por nombres
        int n = listaClientes.size();
        int gap = n / 2;

        while (gap > 0) {
            for (int i = gap; i < n; i++) {
                Cliente temp = listaClientes.get(i);
                int j = i;
                while (j >= gap && listaClientes.get(j - gap).getNombres().compareTo(temp.getNombres()) > 0) {
                    listaClientes.set(j, listaClientes.get(j - gap));
                    j -= gap;
                }
                listaClientes.set(j, temp);
            }
            gap /= 2;
        }

        // Actualiza la tabla con la lista ordenada
        actualizarTabla(listaClientes);
    }
    
 // Método para buscar un Cliente por Apellido y DNI utilizando Búsqueda Secuencial
private void busqApellidoSec() {
    // Mostrar cuadros de diálogo de entrada para que el usuario ingrese el apellido y el DNI
    String apellidoBuscado = JOptionPane.showInputDialog(this, "Ingrese el Apellido:", "Búsqueda por Apellido y DNI", JOptionPane.PLAIN_MESSAGE);
    String dniBuscado = JOptionPane.showInputDialog(this, "Ingrese el DNI:", "Búsqueda por Apellido y DNI", JOptionPane.PLAIN_MESSAGE);

    // Verificar si el usuario ingresó un apellido y un DNI o canceló alguno de los cuadros de diálogo
    if (apellidoBuscado != null && dniBuscado != null) {
        // Realizar la búsqueda secuencial con el apellido y el DNI ingresados y obtener el cliente encontrado
        Cliente clienteEncontrado = buscarClientePorApellidoYDNI(apellidoBuscado, dniBuscado);

        // Mostrar la información del cliente encontrado en un cuadro de diálogo
        mostrarInformacionCliente(clienteEncontrado);
    }
}

private Cliente buscarClientePorApellidoYDNI(String apellido, String dni) {
    // Obtener la lista de clientes actual desde el ClienteDAO
    ClienteDAO clienteDAO = new ClienteDAO();
    ArrayList<Cliente> listaClientes = clienteDAO.listarTodo();

    // Realizar la búsqueda secuencial en la lista de clientes
    for (Cliente cliente : listaClientes) {
        if (cliente.getApellidos().equalsIgnoreCase(apellido) && cliente.getDni().equalsIgnoreCase(dni)) {
            return cliente;
        }
    }

    return null; // Devolver null si no se encontró ningún cliente con el apellido y el DNI ingresados
}

// Función para mostrar la información del cliente en un cuadro de diálogo
private void mostrarInformacionCliente(Cliente cliente) {
    if (cliente != null) {
        String mensaje = "Su nombre es: " + cliente.getNombres() + "\n" +
                         "Apellido: " + cliente.getApellidos() + "\n" +
                         "DNI: " + cliente.getDni() + "\n" +
                         "Teléfono: " + cliente.getNumtelf();

        JOptionPane.showMessageDialog(this, mensaje, "Información del Cliente", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No se encontró ningún cliente con ese apellido y DNI.", "Información del Cliente", JOptionPane.INFORMATION_MESSAGE);
    }
}



// Método para ordenar clientes por teléfono utilizando el algoritmo de inserción
private void ordenarClientesPorTelefonoInsercion() {
    // Obtén la lista de clientes actual desde la base de datos o donde la tengas almacenada
    ClienteDAO clienteDAO = new ClienteDAO();
    ArrayList<Cliente> listaClientes = clienteDAO.listarTodo();

    // Implementa el algoritmo de ordenación de inserción para ordenar la lista por teléfono
    int n = listaClientes.size();
    for (int i = 1; i < n; i++) {
        Cliente key = listaClientes.get(i);
        int j = i - 1;

        // Mueve los elementos de listaClientes[0..i-1] que son mayores que key.getNumtelf()
        // a una posición adelante de su posición actual
        while (j >= 0 && key.getNumtelf().compareTo(listaClientes.get(j).getNumtelf()) < 0) {
            listaClientes.set(j + 1, listaClientes.get(j));
            j = j - 1;
        }
        listaClientes.set(j + 1, key);
    }

    // Actualiza la tabla con la lista ordenada
    actualizarTabla(listaClientes);
}


// Método para ordenar clientes por apellidos y luego por DNI utilizando selección
private void ordenarClientesPorApellidosDNISeleccion() {
    // Obtén la lista de clientes actual desde la base de datos o donde la tengas almacenada
    ClienteDAO clienteDAO = new ClienteDAO();
    ArrayList<Cliente> listaClientes = clienteDAO.listarTodo();

    // Implementa el algoritmo de ordenación por selección para ordenar la lista por apellidos y luego por DNI
    int n = listaClientes.size();

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            // Compara los apellidos de dos clientes
            int apellidoComparison = listaClientes.get(j).getApellidos().compareTo(listaClientes.get(minIndex).getApellidos());
            
            if (apellidoComparison < 0 || (apellidoComparison == 0 && listaClientes.get(j).getDni().compareTo(listaClientes.get(minIndex).getDni()) < 0)) {
                // Si los apellidos son iguales, desempata por DNI
                minIndex = j;
            }
        }
        
        // Intercambia los elementos si se encontró un mínimo
        if (minIndex != i) {
            Cliente temp = listaClientes.get(i);
            listaClientes.set(i, listaClientes.get(minIndex));
            listaClientes.set(minIndex, temp);
        }
    }

    // Actualiza la tabla con la lista ordenada
    actualizarTabla(listaClientes);
}












// Método para actualizar la tabla con la lista de clientes ordenada
private void actualizarTabla(ArrayList<Cliente> listaClientes) {
    DefaultTableModel dt = (DefaultTableModel) tabla1.getModel();
    dt.setRowCount(0);

    for (Cliente c : listaClientes) {
        Object[] fila = {c.getDni(), c.getNombres(), c.getApellidos(), c.getNumtelf()};
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
            java.util.logging.Logger.getLogger(frmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenarDNI;
    private javax.swing.JButton btnOrdenarNombre;
    private javax.swing.JButton btnOrdenarNombreApellido;
    private javax.swing.JButton btnOrdenarTelefono;
    private javax.swing.JButton btnbusqApellidoSec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRetroceder;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Cliente> listarTodo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
