
package ModeloDAO;

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
import Interfaces.VentaInterface;
import Modelo.Ventas;
import java.util.Set;

public class VentaDAO implements VentaInterface{
    Connection conn;
    Conexion con = new Conexion();
    Ventas v;
    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    @Override
    
    public boolean agregar(Ventas v) {
        try {
            String sql = "insert into venta (idUser, fechaVenta, montoTotal,dniCliente)"
                    + "values(?,?,?,?)";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            ps.setString(1, v.getIDtrabajador());
            ps.setString(2, v.getFechaVenta());
            ps.setDouble(3, v.getMontoTotal());
            ps.setString(4, v.getDniCli());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Ventas c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Ventas> listarTodo() {
        ArrayList<Ventas> lista = new ArrayList<>();
        
        try {
            String sql = "select * from venta";
            conn = con.getConectar();
            ps = conn.prepareStatement(sql);            
            rs = ps.executeQuery();
            while(rs.next()){
                Ventas v = new Ventas();
                v.setDniCli(rs.getString("dniCliente"));
                v.setFechaVenta(rs.getString("fechaVenta"));
                v.setIDtrabajador(rs.getString("idUser"));
                v.setIdVenta(rs.getInt("idVenta"));
                v.setMontoTotal(rs.getDouble("montoTotal"));
   
                lista.add(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public String codigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
