
package Clase;

/**
 *
 * @author manuel
 */
public class SalidaMotocicleta extends Movimiento {
    
    private int idSalidaMotocicleta;
    private InventarioMotocicleta inventarioMotocicleta;
    
    public SalidaMotocicleta() {}

    public SalidaMotocicleta(int idSalidaMotocicleta) {
        this.idSalidaMotocicleta = idSalidaMotocicleta;
    }

    public int getIdEntradaMotocicleta() {
        return idSalidaMotocicleta;
    }

    public void setIdEntradaMotocicleta(int idEntradaMotocicleta) {
        this.idSalidaMotocicleta = idEntradaMotocicleta;
    }

    public InventarioMotocicleta getInventarioMotocicleta() {
        return inventarioMotocicleta;
    }

    public void setInventarioMotocicleta(InventarioMotocicleta inventarioMotocicleta) {
        this.inventarioMotocicleta = inventarioMotocicleta;
    }
}
