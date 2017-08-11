
package Clase;

/**
 *
 * @author manuel
 */
public class OperadorMovil {
    
    private int idOperadorMovil;
    private String operadorMovil;
    private boolean activo;

    public OperadorMovil() {}

    public OperadorMovil(int idOperadorMovil) {
        this.idOperadorMovil = idOperadorMovil;
    }

    public int getIdOperadorMovil() {
        return idOperadorMovil;
    }

    public void setIdOperadorMovil(int idOperadorMovil) {
        this.idOperadorMovil = idOperadorMovil;
    }

    public String getOperadorMovil() {
        return operadorMovil;
    }

    public void setOperadorMovil(String operadorMovil) {
        this.operadorMovil = operadorMovil;
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
