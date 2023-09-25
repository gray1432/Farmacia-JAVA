package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ventas {

    private int idVenta;
    private String IDtrabajador;
    private String fechaVenta;
    private double montoTotal;
    private String dniCli;

    public Ventas(int idVenta, String IDtrabajador, String fechaVenta, double montoTotal, String dniCli) {
        this.idVenta = idVenta;
        this.IDtrabajador = IDtrabajador;
        this.fechaVenta = fechaVenta;
        this.montoTotal = montoTotal;
        this.dniCli = dniCli;
    }

    public Ventas() {
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getIDtrabajador() {
        return IDtrabajador;
    }

    public void setIDtrabajador(String IDtrabajador) {
        this.IDtrabajador = IDtrabajador;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    
    
   

    

}
