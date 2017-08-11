
package Clase;

/**
 *
 * @author manuel
 */
public class DetDescuentoCliente {
    
    private int idDescuentoCliente;
    private Descuento descuento;
    private Cliente cliente;

    public DetDescuentoCliente() {}

    public DetDescuentoCliente(int idDescuentoCliente) {
        this.idDescuentoCliente = idDescuentoCliente;
    }

    public int getIdDescuentoCliente() {
        return idDescuentoCliente;
    }

    public void setIdDescuentoCliente(int idDescuentoCliente) {
        this.idDescuentoCliente = idDescuentoCliente;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
