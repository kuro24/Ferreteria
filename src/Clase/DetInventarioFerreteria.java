
package Clase;

/**
 *
 * @author manuel
 */
public class DetInventarioFerreteria {
    
    private int idDetInventarioFerreteria;
    private InventarioFerreteria inventarioFerreteria;
    private Empleado empleado;
    private String fechaApertura;
    private float cantidadApertura;
    private String fechaCierre;
    private float cantidadCierre;
    private boolean activo;

    public DetInventarioFerreteria() {}

    public DetInventarioFerreteria(int idDetInventarioFerreteria) {
        this.idDetInventarioFerreteria = idDetInventarioFerreteria;
    }

    public int getIdDetInventarioFerreteria() {
        return idDetInventarioFerreteria;
    }

    public void setIdDetInventarioFerreteria(int idDetInventarioFerreteria) {
        this.idDetInventarioFerreteria = idDetInventarioFerreteria;
    }

    public InventarioFerreteria getInventarioFerreteria() {
        return inventarioFerreteria;
    }

    public void setInventarioFerreteria(InventarioFerreteria inventarioFerreteria) {
        this.inventarioFerreteria = inventarioFerreteria;
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

    public int getActivo() {
        return activo == true ? 1 : 0;
    }

    public void setActivo(int estado) {
        this.activo = ( estado == 1 );
    }
}
