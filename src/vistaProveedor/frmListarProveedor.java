
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
import ListaEnlazada.LEnlazadaSimple;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class frmListarProveedor extends javax.swing.JFrame {

    ProveedorDAO obj=new ProveedorDAO();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    ArrayList<Proveedor> listaProveedor = proveedorDAO.listarTodo();
    LEnlazadaSimple listaEnlazada = new LEnlazadaSimple();
    
    
    private DefaultTableModel modeloTabla;

    
    
    public frmListarProveedor() {
        initComponents();
        muestraImgRetroceder();
        
        listar();
        
        
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Direccion");
        txtAreaResultado.setModel(modeloTabla);
        // Asegúrate de agregar datos al modelo de la tabla
        for (Proveedor proveedor : listaProveedor) {
            modeloTabla.addRow(new Object[] { proveedor.getIdProveedor(), proveedor.getNombreProv(), proveedor.getNumTelf(), proveedor.getDireccion() });
        }

        txtAreaResultado.setModel(modeloTabla);

        txtAreaResultado.revalidate();
        txtAreaResultado.repaint();

       

        
        btnBusquedaESimple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor: ");

                boolean existeProveedor = proveedorDAO.existeProveedor(nombreProveedor);

                if (existeProveedor) {
                    JOptionPane.showMessageDialog(null, "Proveedor encontrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
                }
            }
        });

        
        btnRecorridoESimple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 listaEnlazada.llenarTabla(modeloTabla);
            }
        });

             
        
        
        btnInsercionInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener datos del proveedor desde los campos de texto
                String idProveedor = txtIdProveedor.getText();
                String nombreProveedor = txtNombreProveedor.getText();
                String numTelf = txtNumTelf.getText();
                String direccion = txtDireccion.getText();
                
                listaEnlazada.insertarInicio(idProveedor, nombreProveedor, numTelf, direccion);           
                        
                // Crear un array de objetos para representar una fila de datos en la tabla
                /*Object[] fila = {idProveedor, nombreProveedor, numTelf, direccion};*/

                // Obtener el modelo de la tabla y agregar la fila de datos
                DefaultTableModel modelo = (DefaultTableModel) txtAreaResultado.getModel();
                modelo.setRowCount(0);
                
                for (Proveedor proveedor : listaProveedor){
                    modelo.addRow(new Object[] { proveedor.getIdProveedor(), proveedor.getNombreProv(), proveedor.getNumTelf(), proveedor.getDireccion()});
                }
                txtAreaResultado.revalidate();
                txtAreaResultado.repaint();
            }
        });
        

        btnInsercionFinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener datos del proveedor desde los campos de texto
                String idProveedor = txtIdProveedor.getText();
                String nombreProveedor = txtNombreProveedor.getText();
                String numTelf = txtNumTelf.getText();
                String direccion = txtDireccion.getText();

                // Crear un array de objetos para representar una fila de datos en la tabla
                Object[] fila = {idProveedor, nombreProveedor, numTelf, direccion};

                // Obtener el modelo de la tabla y agregar la fila de datos
                DefaultTableModel modelo = (DefaultTableModel) txtAreaResultado.getModel();
                modelo.addRow(fila);
            }
        });

        
        btnInsercionMedio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener datos del proveedor desde los campos de texto
                String idProveedor = txtIdProveedor.getText();
                String nombreProveedor = txtNombreProveedor.getText();
                String numTelf = txtNumTelf.getText();
                String direccion = txtDireccion.getText();
                
                listaEnlazada.insertarMedio(idProveedor, nombreProveedor, numTelf, direccion); 

                // Obtener el modelo de la tabla y agregar la fila de datos
                DefaultTableModel modelo = (DefaultTableModel) txtAreaResultado.getModel();
                modelo.setRowCount(0);
                
                for (Proveedor proveedor : listaProveedor){
                    modelo.addRow(new Object[] { proveedor.getIdProveedor(), proveedor.getNombreProv(), proveedor.getNumTelf(), proveedor.getDireccion()});
                }
                txtAreaResultado.revalidate();
                txtAreaResultado.repaint();
            }
        });
        
        

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
        lbRetroceder = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        OrdenarNombres = new javax.swing.JButton();
        btnordenartelefono = new javax.swing.JButton();
        busqSecID = new javax.swing.JButton();
        btnbusqBinaria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBusquedaESimple = new javax.swing.JButton();
        btnRecorridoESimple = new javax.swing.JButton();
        btnInsercionInicio = new javax.swing.JButton();
        btnInsercionFinal = new javax.swing.JButton();
        btnInsercionMedio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaResultado = new javax.swing.JTable();
        txtIdProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtNumTelf = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Proveedores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(lbRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 6, 36, 36));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Proveedores");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        OrdenarNombres.setBackground(new java.awt.Color(204, 204, 204));
        OrdenarNombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OrdenarNombres.setForeground(new java.awt.Color(0, 0, 0));
        OrdenarNombres.setText("Ordenar Nombres");
        OrdenarNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarNombresActionPerformed(evt);
            }
        });

        btnordenartelefono.setBackground(new java.awt.Color(204, 204, 204));
        btnordenartelefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnordenartelefono.setForeground(new java.awt.Color(0, 0, 0));
        btnordenartelefono.setText("Ordenar Telefono");
        btnordenartelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenartelefonoActionPerformed(evt);
            }
        });

        busqSecID.setBackground(new java.awt.Color(204, 204, 204));
        busqSecID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        busqSecID.setForeground(new java.awt.Color(0, 0, 0));
        busqSecID.setText("Busq Secuencial ID");
        busqSecID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busqSecIDActionPerformed(evt);
            }
        });

        btnbusqBinaria.setBackground(new java.awt.Color(204, 204, 204));
        btnbusqBinaria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbusqBinaria.setForeground(new java.awt.Color(0, 0, 0));
        btnbusqBinaria.setText("Busq. Binaria por Telefono");
        btnbusqBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusqBinariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(OrdenarNombres)
                        .addGap(57, 57, 57)
                        .addComponent(btnordenartelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(busqSecID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbusqBinaria)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrdenarNombres)
                    .addComponent(btnordenartelefono))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busqSecID)
                    .addComponent(btnbusqBinaria))
                .addContainerGap(285, Short.MAX_VALUE))
        );

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista Enlazada");

        btnBusquedaESimple.setBackground(new java.awt.Color(204, 204, 204));
        btnBusquedaESimple.setForeground(new java.awt.Color(0, 0, 0));
        btnBusquedaESimple.setText("Busqueda");
        btnBusquedaESimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaESimpleActionPerformed(evt);
            }
        });

        btnRecorridoESimple.setBackground(new java.awt.Color(204, 204, 204));
        btnRecorridoESimple.setForeground(new java.awt.Color(0, 0, 0));
        btnRecorridoESimple.setText("Recorrido");
        btnRecorridoESimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorridoESimpleActionPerformed(evt);
            }
        });

        btnInsercionInicio.setBackground(new java.awt.Color(204, 204, 204));
        btnInsercionInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInsercionInicio.setText("Insercion Inicio");
        btnInsercionInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionInicioActionPerformed(evt);
            }
        });

        btnInsercionFinal.setBackground(new java.awt.Color(204, 204, 204));
        btnInsercionFinal.setForeground(new java.awt.Color(0, 0, 0));
        btnInsercionFinal.setText("Insercion Final");
        btnInsercionFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionFinalActionPerformed(evt);
            }
        });

        btnInsercionMedio.setBackground(new java.awt.Color(204, 204, 204));
        btnInsercionMedio.setForeground(new java.awt.Color(0, 0, 0));
        btnInsercionMedio.setText("Insercion Medio");
        btnInsercionMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionMedioActionPerformed(evt);
            }
        });

        txtAreaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(txtAreaResultado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnBusquedaESimple, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRecorridoESimple))
                    .addComponent(btnInsercionInicio)
                    .addComponent(btnInsercionFinal)
                    .addComponent(btnInsercionMedio)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBusquedaESimple)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecorridoESimple)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsercionInicio)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsercionFinal)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsercionMedio))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetrocederMouseClicked
        dispose(); //ocultar jframe
        frmPrincipal fp=new frmPrincipal();//crear objeto de Frm Principal
        fp.setVisible(true);//haciendo visible el objeto creado
    }//GEN-LAST:event_lbRetrocederMouseClicked
                                             
    
 

    private void btnbusqBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusqBinariaActionPerformed

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

    private void btnBusquedaESimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaESimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBusquedaESimpleActionPerformed

    private void btnRecorridoESimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorridoESimpleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRecorridoESimpleActionPerformed

    private void btnInsercionInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsercionInicioActionPerformed

    private void btnInsercionFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsercionFinalActionPerformed

    private void btnInsercionMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsercionMedioActionPerformed


    private void ordenarProveedoresPorNombresMergeSort() {
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
    private javax.swing.JButton btnBusquedaESimple;
    private javax.swing.JButton btnInsercionFinal;
    private javax.swing.JButton btnInsercionInicio;
    private javax.swing.JButton btnInsercionMedio;
    private javax.swing.JButton btnRecorridoESimple;
    private javax.swing.JButton btnbusqBinaria;
    private javax.swing.JButton btnordenartelefono;
    private javax.swing.JButton busqSecID;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbRetroceder;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable txtAreaResultado;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNumTelf;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
