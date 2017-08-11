
package Clase;

/**
 *
 * @author manuel
 */
public class Inventario {
    
    private int idInventario;
    private float stockReal;
    private float disponibilidad;
    private int stockMinimo;

    public Inventario() {}

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public float getStockReal() {
        return stockReal;
    }

    public void setStockReal(float stockReal) {
        this.stockReal = stockReal;
    }

    public float getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(float disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }
}
