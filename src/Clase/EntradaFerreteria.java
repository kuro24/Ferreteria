
package Clase;

/**
 *
 * @author manuel
 */
public class EntradaFerreteria extends Movimiento {
    
    private int idEntradaFerreteria;
    private InventarioFerreteria inventarioFerreteria;

    public EntradaFerreteria() {}

    public EntradaFerreteria(int idEntradaFerreteria) {
        this.idEntradaFerreteria = idEntradaFerreteria;
    }

    public int getIdEntradaFerreteria() {
        return idEntradaFerreteria;
    }

    public void setIdEntradaFerreteria(int idEntradaFerreteria) {
        this.idEntradaFerreteria = idEntradaFerreteria;
    }

    public InventarioFerreteria getInventarioFerreteria() {
        return inventarioFerreteria;
    }

    public void setInventarioFerreteria(InventarioFerreteria inventarioFerreteria) {
        this.inventarioFerreteria = inventarioFerreteria;
    }
}
