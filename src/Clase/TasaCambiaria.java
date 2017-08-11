
package Clase;

/**
 *
 * @author manuel
 */
public class TasaCambiaria {
    
    private int idTasaCammbiaria;
    private Moneda moneda;
    private String fechaValidaInicial;
    private String fechaValidaFinal;
    private float cambio;
    private boolean activo;

    public TasaCambiaria() {}

    public TasaCambiaria(int idTasaCammbiaria) {
        this.idTasaCammbiaria = idTasaCammbiaria;
    }

    public int getIdTasaCammbiaria() {
        return idTasaCammbiaria;
    }

    public void setIdTasaCammbiaria(int idTasaCammbiaria) {
        this.idTasaCammbiaria = idTasaCammbiaria;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public String getFechaValidaInicial() {
        return fechaValidaInicial;
    }

    public void setFechaValidaInicial(String fechaValidaInicial) {
        this.fechaValidaInicial = fechaValidaInicial;
    }

    public String getFechaValidaFinal() {
        return fechaValidaFinal;
    }

    public void setFechaValidaFinal(String fechaValidaFinal) {
        this.fechaValidaFinal = fechaValidaFinal;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
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
