
package Clase;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author manuel
 */
public abstract class Producto {
    
    private int numProducto;
    private TipoProducto tipoProducto;
    private Marca marca;
    private UnidadMedida unidadMedida;
    private String nombreProducto;
    private String descripcionProducto;
    private String presentacionProducto;
    private FileInputStream guardarFoto;
    private InputStream leerFoto;

    public Producto() {}

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getPresentacionProducto() {
        return presentacionProducto;
    }

    public void setPresentacionProducto(String presentacionProducto) {
        this.presentacionProducto = presentacionProducto;
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
}
