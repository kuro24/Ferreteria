
package Clase;

/**
 *
 * @author manuel
 */
public class ContactoTelefonoProveedor {
    
    private int idContactoTelefonoProveedor;
    private Proveedor proveedor;
    private boolean activo;

    public ContactoTelefonoProveedor() {}

    public ContactoTelefonoProveedor(int idContactoTelefonoProveedor) {
        this.idContactoTelefonoProveedor = idContactoTelefonoProveedor;
    }

    public int getIdContactoTelefonoProveedor() {
        return idContactoTelefonoProveedor;
    }

    public void setIdContactoTelefonoProveedor(int idContactoTelefonoProveedor) {
        this.idContactoTelefonoProveedor = idContactoTelefonoProveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
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
