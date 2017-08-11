
package Clase;

/**
 *
 * @author manuel
 */
public class SalidaFerreteria extends Movimiento {
    
    private int idSalidaFerreteria;
    private InventarioFerreteria inventarioFerreteria;

    public SalidaFerreteria() {}

    public SalidaFerreteria(int idSalidaFerreteria) {
        this.idSalidaFerreteria = idSalidaFerreteria;
    }

    public int getIdEntradaFerreteria() {
        return idSalidaFerreteria;
    }

    public void setIdEntradaFerreteria(int idEntradaFerreteria) {
        this.idSalidaFerreteria = idEntradaFerreteria;
    }

    public InventarioFerreteria getInventarioFerreteria() {
        return inventarioFerreteria;
    }

    public void setInventarioFerreteria(InventarioFerreteria inventarioFerreteria) {
        this.inventarioFerreteria = inventarioFerreteria;
    }
}
