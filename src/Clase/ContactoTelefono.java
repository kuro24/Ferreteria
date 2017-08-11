
package Clase;

/**
 *
 * @author manuel
 */
public abstract class ContactoTelefono {
    
    private int idContactoTelefono;
    private OperadorMovil operadorMovil;
    private String numeroTelefonico;

    public ContactoTelefono() {}

    public int getIdContactoTelefono() {
        return idContactoTelefono;
    }

    public void setIdContactoTelefono(int idContactoTelefono) {
        this.idContactoTelefono = idContactoTelefono;
    }

    public OperadorMovil getOperadorMovil() {
        return operadorMovil;
    }

    public void setOperadorMovil(OperadorMovil operadorMovil) {
        this.operadorMovil = operadorMovil;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }   
}
