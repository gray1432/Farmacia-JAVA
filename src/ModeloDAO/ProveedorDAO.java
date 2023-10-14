
package ModeloDAO;

import Modelo.Proveedor;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.ProveedorInterface;
import java.util.Set;

public class ProveedorDAO implements ProveedorInterface{
    Connection conn;
    Conexion con = new Conexion();
    Proveedor p;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    
    
    @Override
    public boolean agregar(Proveedor p) {
        try {
            String sql = "insert into proveedor (idProveedor, nombreProv, numTelf, direccion)"
                    + "values(?,?,?,?)";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.setString(1, p.getIdProveedor());
            ps.setString(2, p.getNombreProv());
            ps.setString(3, p.getNumTelf());
            ps.setString(4, p.getDireccion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from proveedor where idProveedor = '"+codigo+"'";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean modificar(Proveedor p) {
        try {
            String sql = "UPDATE proveedor SET nombreProv = ? , numTelf = ? , direccion = ? WHERE idProveedor = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getNombreProv());
            ps.setString(2, p.getNumTelf());
            ps.setString(3, p.getDireccion());
            ps.setString(4, p.getIdProveedor());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    
    public String codigo() {
        int cantidadRegistros = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total_registros FROM proveedor";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                cantidadRegistros = resultado.getInt("total_registros");
            }

            resultado.close();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "PROV"+cantidadRegistros;
    }
    

    @Override
    
    
    public ArrayList<Proveedor> listarTodo() {
        ArrayList<Proveedor> lista = new ArrayList<>();
        
        try {
            String sql = "select * from proveedor ";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Proveedor();
                p.setIdProveedor(rs.getString("idProveedor"));
                p.setNombreProv(rs.getString("nombreProv"));
                p.setDireccion(rs.getString("direccion"));
                p.setNumTelf(rs.getString("numTelf"));
                
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Proveedor listarUno(String codigo){
    
         try {
            String sql = "select * from proveedor where idProveedor = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Proveedor();
                p.setIdProveedor(rs.getString("idProveedor"));
                p.setNombreProv(rs.getString("nombreProv"));
                p.setDireccion(rs.getString("direccion"));
                p.setNumTelf(rs.getString("numTelf"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return p;
    }
    
    public Proveedor listarUnoNombre(String nombre){
    
         try {
            String sql = "select * from proveedor where nombreProv = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Proveedor();
                p.setIdProveedor(rs.getString("idProveedor"));
                p.setNombreProv(rs.getString("nombreProv"));
                p.setDireccion(rs.getString("direccion"));
                p.setNumTelf(rs.getString("numTelf"));

                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return p;
    }

    public void ordenarProveedorAscPorTelefono() {
        ProveedorDAO proveedorDAO = new ProveedorDAO();
        ArrayList<Proveedor> listaProveedor = proveedorDAO.listarTodo();

        int i, j;
        for (i = 0; i < listaProveedor.size() - 1; i++) {
            for (j = i + 1; j < listaProveedor.size(); j++) {

                if (listaProveedor.get(i).getNumTelf().compareTo(listaProveedor.get(j).getNumTelf()) > 0) {
                    Proveedor temp = listaProveedor.get(i);
                    listaProveedor.set(i, listaProveedor.get(j));
                    listaProveedor.set(j, temp);
                }
            }
        }
    }
    
    public boolean existeProveedor(String nombreProveedor) {
        try {
            String sql = "SELECT * FROM proveedor WHERE nombreProv = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombreProveedor);
            rs = ps.executeQuery();
            return rs.next(); // Devuelve true si existe un proveedor con el nombre proporcionado
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Cerrar conexiones y recursos aquí si es necesario
        }
        return false; // Devuelve false en caso de error o si no existe el proveedor
    }
  
}

