
package Clase;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author manuel
 */
public class Empleado extends Persona {
    
    private int numEmpleado;
    private String inss;
    private FileInputStream guardarFoto;
    private InputStream leerFoto;
    private boolean activo;

    public Empleado() {}

    public Empleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getInss() {
        return inss;
    }

    public void setInss(String inss) {
        this.inss = inss;
    }

    public FileInputStream getGuardarFoto() {
        return guardarFoto;
    }

    public void setGuardarFoto(FileInputStream guardarFoto) {
        this.guardarFoto = guardarFoto;
    }

    public InputStream getLeerFoto() {
        return leerFoto;
    }

    public void setLeerFoto(InputStream leerFoto) {
        this.leerFoto = leerFoto;
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
