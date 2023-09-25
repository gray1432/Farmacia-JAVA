
package ModeloDAO;
import Modelo.Cliente;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.*;
import Modelo.Proveedor;


public class ClienteDAO implements ClienteInterface {
    
    Connection conn;
    Conexion con = new Conexion();
    Cliente c;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    
    
    
    public boolean agregar(Cliente c) {
        try {
            String sql = "insert into cliente (codigo, dni, nombres, apellidos, numtelf)"
                    + "values(?,?,?,?,?)";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCodigo());            
            ps.setString(2, c.getDni());
            ps.setString(3, c.getNombres());
            ps.setString(4, c.getApellidos());
            ps.setString(5, c.getNumtelf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from cliente where codigo = '"+codigo+"'";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(Cliente c) {
        try {
            String sql = "update cliente set  dni=?, nombres=?, apellidos=? , numtelf=? where "
                    + " codigo = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, c.getDni());                
            ps.setString(2, c.getNombres());
            ps.setString(3, c.getApellidos());
            ps.setString(4, c.getNumtelf());
            ps.setString(5, c.getCodigo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    @Override
    
    public ArrayList<Cliente> listarTodo() {
        
        ArrayList<Cliente> lista = new ArrayList<>();
        
        try {
            String sql = "select * from cliente ";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            rs = ps.executeQuery();
            while(rs.next()){
                c = new Cliente();
                c.setCodigo(rs.getString("codigo"));
                c.setDni(rs.getString("dni"));
                c.setNombres(rs.getString("nombres"));
                c.setApellidos(rs.getString("apellidos"));
                c.setNumtelf(rs.getString("numtelf"));
   
                lista.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
   
    
    public Cliente listarUno(String dni){
    
         try {
            String sql = "select * from cliente where dni = ?";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while(rs.next()){
                c = new Cliente();
                c.setDni(rs.getString("dni"));
                c.setNombres(rs.getString("nombres"));
                c.setApellidos(rs.getString("apellidos"));
                c.setNumtelf(rs.getString("numtelf"));
                c.setCodigo(rs.getString("codigo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return c;
    }
    
   public String codigo() {
        int cantidadRegistros = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total_registros FROM cliente";
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

        return "CLI"+cantidadRegistros;
    }     
    
}
