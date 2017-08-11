
package Clase;

/**
 *
 * @author manuel
 */
public class Moneda {
    
    private int idMoneda;
    private String nombreMoneda;
    private String simbolo;
    private boolean monedaPrincipal;
    private boolean activo;

    public Moneda() {}

    public Moneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public int getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(int idMoneda) {
        this.idMoneda = idMoneda;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public boolean isMonedaPrincipal() {
        return monedaPrincipal;
    }

    public int getMonedaPrincipal() {
        return this.monedaPrincipal == true ? 1 : 0;
    }
    
    public void setMonedaPrincipal(int monedaPrincipal) {
        this.monedaPrincipal = (monedaPrincipal == 1);
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
