
package Clase;

/**
 *
 * @author manuel
 */
public class Compra {
    
    private int numCompra;
    private Proveedor proveedor;
    private Iva iva;
    private Moneda moneda;
    private String fechaPedido;
    private int autorizacion;
    private String fechaAutorizacion;
    private String empleadoQueAutoriza;
    private String fechaRecibido;
    private String empleadoQueRecibe;
    private String fechaPago;
    private String empleadoQuePaga;
    private String facturaProveedor;
    private int estadoCompra;

    public Compra() {}

    public Compra(int numCompra) {
        this.numCompra = numCompra;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Iva getIva() {
        return iva;
    }

    public void setIva(Iva iva) {
        this.iva = iva;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(int autorizacion) {
        this.autorizacion = autorizacion;
    }

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getEmpleadoQueAutoriza() {
        return empleadoQueAutoriza;
    }

    public void setEmpleadoQueAutoriza(String empleadoQueAutoriza) {
        this.empleadoQueAutoriza = empleadoQueAutoriza;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public String getEmpleadoQueRecibe() {
        return empleadoQueRecibe;
    }

    public void setEmpleadoQueRecibe(String empleadoQueRecibe) {
        this.empleadoQueRecibe = empleadoQueRecibe;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEmpleadoQuePaga() {
        return empleadoQuePaga;
    }

    public void setEmpleadoQuePaga(String empleadoQuePaga) {
        this.empleadoQuePaga = empleadoQuePaga;
    }

    public String getFacturaProveedor() {
        return facturaProveedor;
    }

    public void setFacturaProveedor(String facturaProveedor) {
        this.facturaProveedor = facturaProveedor;
    }

    public int getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(int estadoCompra) {
        this.estadoCompra = estadoCompra;
    }
}
