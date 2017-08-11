
package Clase;

/**
 *
 * @author manuel
 */
public class Proveedor extends Persona {
    
    private int numProveedor;

    public Proveedor() {}

    public Proveedor(int numProveedor) {
        this.numProveedor = numProveedor;
    }

    public int getNumProveedor() {
        return numProveedor;
    }

    public void setNumProveedor(int numProveedor) {
        this.numProveedor = numProveedor;
    }
}
