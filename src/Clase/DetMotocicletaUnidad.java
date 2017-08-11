
package Clase;

/**
 *
 * @author manuel
 */
public class DetMotocicletaUnidad {
    
    private int idDetMotocicletaUnidad;
    private RepuestoMotocicleta repuestoMotocicleta;
    private UnidadMedida unidadMedida;
    private float equivalencia;
    private boolean activo;

    public DetMotocicletaUnidad() {}

    public DetMotocicletaUnidad(int idDetMotocicletaUnidad) {
        this.idDetMotocicletaUnidad = idDetMotocicletaUnidad;
    }

    public int getIdDetMotocicletaUnidad() {
        return idDetMotocicletaUnidad;
    }

    public void setIdDetMotocicletaUnidad(int idDetMotocicletaUnidad) {
        this.idDetMotocicletaUnidad = idDetMotocicletaUnidad;
    }

    public RepuestoMotocicleta getRepuestoMotocicleta() {
        return repuestoMotocicleta;
    }

    public void setRepuestoMotocicleta(RepuestoMotocicleta repuestoMotocicleta) {
        this.repuestoMotocicleta = repuestoMotocicleta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public float getEquivalencia() {
        return equivalencia;
    }

    public void setEquivalencia(float equivalencia) {
        this.equivalencia = equivalencia;
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
