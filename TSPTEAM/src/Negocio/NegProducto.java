package Negocio;

import Datos.Conexion;
import Datos.DatProducto;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author GAb
 */
public class NegProducto {

    private long codProducto;
    private String nombreProducto;
    private long precioUnitario;
    private int codMarca;
    private long stockInicial;
    private long stockMinimo;
    private int codSucursal;
    private Date fechaCreacion;
    private String fechaVencimiento;
    private int tipoImpuesto;

    public NegProducto() {
    }

    public NegProducto(String nombreProducto, long precioUnitario, int codMarca, long stockInicial, long stockMinimo, int codSucursal, Date fechaCreacion, String fechaVencimiento, int tipoImpuesto) {
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.codMarca = codMarca;
        this.stockInicial = stockInicial;
        this.stockMinimo = stockMinimo;
        this.codSucursal = codSucursal;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoImpuesto = tipoImpuesto;
    }

    public static boolean insertProducto(NegProducto negProducto) {
        boolean estadoOrdenSql = false;
        Connection conexion = Conexion.getConnection();

        try {
            conexion.setAutoCommit(false);

            DatProducto.insertAll(conexion, negProducto);
            estadoOrdenSql = true;

            conexion.commit();
        } catch (Exception ex) {
            conexion.rollback();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            return estadoOrdenSql;
        }
    }

    public long getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(long codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public long getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(long stockInicial) {
        this.stockInicial = stockInicial;
    }

    public long getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(long stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(int codSucursal) {
        this.codSucursal = codSucursal;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getTipoImpuesto() {
        return tipoImpuesto;
    }

    public void setTipoImpuesto(int tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }

}
