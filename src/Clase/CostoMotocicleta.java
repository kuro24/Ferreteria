
package Clase;

public class CostoMotocicleta extends Costo {
    
    private int idCostoMotocicleta;
    private RepuestoMotocicleta repuestoMotocicleta;
    private boolean activo;

    public CostoMotocicleta() {}

    public CostoMotocicleta(int idCostoMotocicleta) {
        this.idCostoMotocicleta = idCostoMotocicleta;
    }

    public int getIdCostoMotocicleta() {
        return idCostoMotocicleta;
    }

    public void setIdCostoMotocicleta(int idCostoMotocicleta) {
        this.idCostoMotocicleta = idCostoMotocicleta;
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

    public int getActivo() {
        return activo == true ? 1 : 0;
    }

    public void setActivo(int estado) {
        this.activo = ( estado == 1 );
    }
}
