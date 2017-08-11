package Clase;

import java.util.Calendar;

/**
 *
 * @author manuel
 */
public abstract class Persona {
    
    private int numPersona;
    private String nombre;
    private String apellidoRazonSocial;
    private String fechaNacimientoConstitucion;
    private String ciudad;
    private String direccion;
    private String genero;

    public Persona() {}

    public int getNumPersona() {
        return numPersona;
    }

    public void setNumPersona(int numPersona) {
        this.numPersona = numPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoRazonSocial() {
        return apellidoRazonSocial;
    }

    public void setApellidoRazonSocial(String apellidoRazonSocial) {
        this.apellidoRazonSocial = apellidoRazonSocial;
    }

    public String getFechaNacimientoConstitucion() {
        return fechaNacimientoConstitucion;
    }

    public void setFechaNacimientoConstitucion(String fechaNacimientoConstitucion) {
        this.fechaNacimientoConstitucion = fechaNacimientoConstitucion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        switch( genero ) {
            case "M": return "Masculino";
            case "F": return "Femenino";
            case "N": return "N/A";
            case "Masculino": return "M";
            case "Femenino": return "F";
            case "N/A": return "N";
            default: return "/N/A/";
        }
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        int anio = Calendar.getInstance().get(Calendar.YEAR);
        String edad = this.fechaNacimientoConstitucion.substring(6, 10);
        
        return anio - Integer.parseInt(edad);
    }
}
