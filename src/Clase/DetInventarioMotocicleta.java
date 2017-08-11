
package Clase;

/**
 *
 * @author manuel
 */
public class DetInventarioMotocicleta {
    
    private int idDetInventarioMotocicleta;
    private InventarioMotocicleta inventarioMotocicleta;
    private Empleado empleado;
    private String fechaApertura;
    private float cantidadApertura;
    private String fechaCierre;
    private float cantidadCierre;
    private boolean activo;

    public DetInventarioMotocicleta() {}

    public DetInventarioMotocicleta(int idDetInventarioMotocicleta) {
        this.idDetInventarioMotocicleta = idDetInventarioMotocicleta;
    }

    public int getIdDetInventarioMotocicleta() {
        return idDetInventarioMotocicleta;
    }

    public void setIdDetInventarioMotocicleta(int idDetInventarioMotocicleta) {
        this.idDetInventarioMotocicleta = idDetInventarioMotocicleta;
    }

    public InventarioMotocicleta getInventarioMotocicleta() {
        return inventarioMotocicleta;
    }

    public void setInventarioMotocicleta(InventarioMotocicleta inventarioMotocicleta) {
        this.inventarioMotocicleta = inventarioMotocicleta;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public float getCantidadApertura() {
        return cantidadApertura;
    }

    public void setCantidadApertura(float cantidadApertura) {
        this.cantidadApertura = cantidadApertura;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public float getCantidadCierre() {
        return cantidadCierre;
    }

    public void setCantidadCierre(float cantidadCierre) {
        this.cantidadCierre = cantidadCierre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
