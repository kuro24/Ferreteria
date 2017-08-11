
package Clase;

/**
 *
 * @author manuel
 */
public class ProveedorMotocicleta {
    
    private int idProveedorMotocicleta;
    private Proveedor proveedor;
    private RepuestoMotocicleta repuestoMotocicleta;

    public ProveedorMotocicleta() {}

    public ProveedorMotocicleta(int idProveedorMotocicleta) {
        this.idProveedorMotocicleta = idProveedorMotocicleta;
    }

    public int getIdProveedorMotocicleta() {
        return idProveedorMotocicleta;
    }

    public void setIdProveedorMotocicleta(int idProveedorMotocicleta) {
        this.idProveedorMotocicleta = idProveedorMotocicleta;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public RepuestoMotocicleta getRepuestoMotocicleta() {
        return repuestoMotocicleta;
    }

    public void setRepuestoMotocicleta(RepuestoMotocicleta repuestoMotocicleta) {
        this.repuestoMotocicleta = repuestoMotocicleta;
    }
}
