
package Clase;

/**
 *
 * @author manuel
 */
public class ContactoTelefonoCliente {
    
    private int idContactoTelefonoCliente;
    private Cliente cliente;
    private boolean activo;

    public ContactoTelefonoCliente() {}

    public ContactoTelefonoCliente(int idContactoTelefonoCliente) {
        this.idContactoTelefonoCliente = idContactoTelefonoCliente;
    }

    public int getIdContactoTelefonoCliente() {
        return idContactoTelefonoCliente;
    }

    public void setIdContactoTelefonoCliente(int idContactoTelefonoCliente) {
        this.idContactoTelefonoCliente = idContactoTelefonoCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
