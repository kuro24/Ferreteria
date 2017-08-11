
package Clase;

/**
 *
 * @author manuel
 */
public class PrecioMotocicleta extends Precio {
    
    private int idPrecioMotocicleta;
    private RepuestoMotocicleta repuestoMotocicleta;
    private boolean activo;

    public PrecioMotocicleta() {}

    public PrecioMotocicleta(int idPrecioMotocicleta) {
        this.idPrecioMotocicleta = idPrecioMotocicleta;
    }

    public int getIdPrecioMotocicleta() {
        return idPrecioMotocicleta;
    }

    public void setIdPrecioMotocicleta(int idPrecioMotocicleta) {
        this.idPrecioMotocicleta = idPrecioMotocicleta;
    }

    public RepuestoMotocicleta getRepuestoMotocicleta() {
        return repuestoMotocicleta;
    }

    public void setRepuestoMotocicleta(RepuestoMotocicleta repuestoMotocicleta) {
        this.repuestoMotocicleta = repuestoMotocicleta;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
