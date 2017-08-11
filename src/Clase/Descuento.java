
package Clase;

/**
 *
 * @author manuel
 */
public class Descuento {
    
    private int idDescuento;
    private Empleado empleado;
    private String fechaEmision;
    private String fechaLimite;
    private String conceptoDescuento;
    private int porcentajeDescuento;
    private boolean activo;

    public Descuento() {}

    public Descuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getConceptoDescuento() {
        return conceptoDescuento;
    }

    public void setConceptoDescuento(String conceptoDescuento) {
        this.conceptoDescuento = conceptoDescuento;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    public double getIvaAplicado( double monto ) {
        return monto * ( (double) getPorcentajeDescuento() / 100);
    }
    
    public double getMontoMasIva( double monto ) {
        return monto + getIvaAplicado(monto);
    }

    public double getMontoMenosIva( double monto ) {
        return monto - getIvaAplicado(monto);
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
