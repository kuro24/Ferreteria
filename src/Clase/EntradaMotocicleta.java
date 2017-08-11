
package Clase;

/**
 *
 * @author manuel
 */
public class EntradaMotocicleta extends Movimiento {

    private int idEntradaMotocicleta;
    private InventarioMotocicleta inventarioMotocicleta;
    
    public EntradaMotocicleta() {}

    public EntradaMotocicleta(int idEntradaMotocicleta) {
        this.idEntradaMotocicleta = idEntradaMotocicleta;
    }

    public int getIdEntradaMotocicleta() {
        return idEntradaMotocicleta;
    }

    public void setIdEntradaMotocicleta(int idEntradaMotocicleta) {
        this.idEntradaMotocicleta = idEntradaMotocicleta;
    }

    public InventarioMotocicleta getInventarioMotocicleta() {
        return inventarioMotocicleta;
    }

    public void setInventarioMotocicleta(InventarioMotocicleta inventarioMotocicleta) {
        this.inventarioMotocicleta = inventarioMotocicleta;
    }
}
