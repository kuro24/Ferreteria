
package Clase;

public class InventarioMotocicleta extends Inventario {
    
    private int idInventarioMotocicleta;
    private RepuestoMotocicleta repuestoMotocicleta;

    public InventarioMotocicleta() {}

    public InventarioMotocicleta(int idInventarioMotocicleta) {
        this.idInventarioMotocicleta = idInventarioMotocicleta;
    }

    public int getIdInventarioMotocicleta() {
        return idInventarioMotocicleta;
    }

    public void setIdInventarioMotocicleta(int idInventarioMotocicleta) {
        this.idInventarioMotocicleta = idInventarioMotocicleta;
    }

    public RepuestoMotocicleta getRepuestoMotocicleta() {
        return repuestoMotocicleta;
    }

    public void setRepuestoMotocicleta(RepuestoMotocicleta repuestoMotocicleta) {
        this.repuestoMotocicleta = repuestoMotocicleta;
    }
}
