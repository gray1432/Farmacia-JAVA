
package ModeloDAO;

import Interfaces.ProductoInterface;
import Modelo.Producto;
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

public class ProductoDAO implements ProductoInterface{
    Connection conn;
    Conexion con = new Conexion();
    Producto c;
    Proveedor pr;
    ProveedorDAO obj=new ProveedorDAO();
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    
    @Override
    public boolean agregar(Producto c) {
        try {
            String sql = "insert into productos (idProducto, nombreProduc, precio, stock, idProveedor) "
                    + " values(?,?,?,?,?)";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.setString(1, c.getIdProducto());
            ps.setString(2, c.getNombre());
            ps.setDouble(3, c.getPrecio());
            ps.setInt(4, c.getStock());
            ps.setString(5, c.getProveedor().getIdProveedor());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from productos where idProducto = '"+codigo+"'";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(Producto c) {
        try {
            String sql = "UPDATE productos SET nombreProduc = ? , precio = ? , stock = ?, idProveedor = ? WHERE idProducto = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.setString(1, c.getNombre());
            ps.setDouble(2, c.getPrecio());
            ps.setInt(3, c.getStock());
            ps.setString(4, c.getProveedor().getIdProveedor());
            ps.setString(5, c.getIdProducto());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public ArrayList<Producto> listarTodo() {
        ArrayList<Producto> lista = new ArrayList<>();
        
        try {
            String sql = "select * from productos";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            rs = ps.executeQuery();
            while(rs.next()){
                c = new Producto();
                c.setIdProducto(rs.getString("idProducto"));
                c.setNombre(rs.getString("nombreProduc"));
                c.setPrecio(rs.getDouble("precio"));
                c.setStock(rs.getInt("stock"));
                
                String cp = rs.getString("idProveedor");     
                
                Proveedor pr=new Proveedor();
                
                pr=obj.listarUno(cp);
                
                c.setProveedor(pr);
                lista.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    
    
    
    
    @Override
    public String codigo() {
        int cantidadRegistros = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total_registros FROM productos";
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

        return "PROD"+cantidadRegistros;
    }
    //UPDATE productos set stock = 100 WHERE idProducto  
    
    public boolean actualizarStock(Producto c) {
        try {
            String sql = "UPDATE productos SET  stock = ? WHERE nombreProduc = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.setInt(1, c.getStock());
            ps.setString(2, c.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Producto listarUno(String nombre) {
        int cantidadRegistros = 0;
        
        try {
            String sql = "select * from productos where nombreProduc = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next()){
                c = new Producto();
                c.setIdProducto(rs.getString("idProducto"));
                c.setNombre(rs.getString("nombreProduc"));
                c.setPrecio(rs.getDouble("precio"));
                c.setProveedor(obj.listarUno(rs.getString("idProveedor")));
                c.setStock(rs.getInt("stock"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return c;
    }
    
}
