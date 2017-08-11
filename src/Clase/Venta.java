
package Clase;

/**
 *
 * @author manuel
 */
public class Venta {
    
    private int numVenta;
    private String codigoVenta;
    private Empleado empleado;
    private Cliente cliente;
    private Iva iva;
    private Moneda moneda;
    private TipoPago tipoPago;
    private String fechaVenta;
    private String empleadoAutoriza;
    private String empleadoAnula;
    private String fechaFactura;
    private String fechaAnulacion;
    private float montoPago;
    private float cambio;
    private int estadoVenta;

    public Venta() {}

    public Venta(int numVenta) {
        this.numVenta = numVenta;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getEmpleadoAutoriza() {
        return empleadoAutoriza;
    }

    public void setEmpleadoAutoriza(String empleadoAutoriza) {
        this.empleadoAutoriza = empleadoAutoriza;
    }

    public String getEmpleadoAnula() {
        return empleadoAnula;
    }

    public void setEmpleadoAnula(String empleadoAnula) {
        this.empleadoAnula = empleadoAnula;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(String fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public float getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(float montoPago) {
        this.montoPago = montoPago;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public int getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(int estadoVenta) {
        this.estadoVenta = estadoVenta;
    }
}
