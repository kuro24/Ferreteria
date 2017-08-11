
package Clase;

/**
 *
 * @author manuel
 */
public class Iva {
    
    private int idIva;
    private String fechaEmision;
    private int PorcentajeIva;
    private boolean activo;

    public Iva() {}

    public Iva(int idIva) {
        this.idIva = idIva;
    }

    public int getIdIva() {
        return idIva;
    }

    public void setIdIva(int idIva) {
        this.idIva = idIva;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getPorcentajeIva() {
        return PorcentajeIva;
    }

    public void setPorcentajeIva(int PorcentajeIva) {
        this.PorcentajeIva = PorcentajeIva;
    }
    
    public double getIvaAplicado( double monto ) {
        return monto * ( (double) getPorcentajeIva() / 100);
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
        return this.activo == true ? 1 : 0;
    }

    public void setActivo(int estado) {
        this.activo = ( estado == 1 );
    }
}
