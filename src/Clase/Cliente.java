
package Clase;

import BlueBird.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author manuel
 */
public class Cliente extends Persona {
    
    private int numCliente;
    
    public static final String SQL_BUSCAR_REGISTRO = "select numcliente, cedularuc, nombre, "
            + "apellidorazonsocial, "
            + "to_char(fechanacimientoconstitucion, 'DD/MM/YYYY'), "
            + "ciudad, direccion, genero, estado "
            + "from cat_cliente ";
    public static final String SQL_MOSTRAR_REGISTRO = "select numcliente, cedularuc, nombre, "
            + "apellidorazonsocial, "
            + "to_char(fechanacimientoconstitucion, 'DD/MM/YYYY'), "
            + "ciudad, direccion, genero "
            + "from cat_cliente ";
    public static final String SQL_CANTIDAD_REGISTRO = "select count(numcliente) from cat_cliente ";

    public Cliente() {}

    public Cliente(int numCliente) throws SQLException {
        buscarPorID(numCliente);
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }    
    
    @Override
    public void guardar() throws SQLException {
        String consulta = "select prc_cliente('0', '"+this.getCedulaRuc()+"', "
                + "'"+this.getNombre()+"', "
                + "'"+this.getApellidoRazonSocial()+"', "
                + "'"+this.getFechaNacimientoConstitucion()+"', "
                + "'"+this.getCiudad()+"', "
                + "'"+this.getDireccion()+"', "
                + "'"+this.getGenero()+"')";
        sqlTransact(consulta);
    }

    @Override
    public void Editar() throws SQLException {
        String consulta = "select prc_cliente('"+this.getNumCliente()+"', "
                + "'"+this.getCedulaRuc()+"', "
                + "'"+this.getNombre()+"', "
                + "'"+this.getApellidoRazonSocial()+"', "
                + "'"+this.getFechaNacimientoConstitucion()+"', "
                + "'"+this.getCiudad()+"', "
                + "'"+this.getDireccion()+"', "
                + "'"+this.getGenero()+"')";
        sqlTransact(consulta);
    }

    @Override
    public void Eliminar() throws SQLException {
        String consulta = "select prc_cliente('"+this.getNumCliente()+"', "
                + "'"+this.getCedulaRuc()+"', "
                + "'"+this.getNombre()+"', "
                + "'"+this.getApellidoRazonSocial()+"', "
                + "'"+this.getFechaNacimientoConstitucion()+"', "
                + "'"+this.getCiudad()+"', "
                + "'"+this.getDireccion()+"', "
                + "'"+this.getGenero()+"')";
        sqlTransact(consulta);
    }
    
    public void sqlTransact( String consulta ) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);       
        while( resultado.next() ) {}
    }
    
    @Override
    public final void buscarPorID(int ID) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where numcliente = '"+ID+"' and estado = '1'") );
    }

    @Override
    public void buscarPorConcepto(String concepto) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where (cedularuc ilike '%"+concepto+"%' or nombre ilike '%"+concepto+"%' or "
                + "apellidorazonsocial ilike '%"+concepto+"%') and estado = '1'") );
    }
    
    @Override
    public void sqlSearchData(String consulta) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);        
        while( resultado.next() ) { set(resultado); } 
    }
    
    @Override
    public String mostrarTodosRegistrosPorID(int ID) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where numcliente = '"+ID+"' and estado = '1'");
    }

    @Override
    public String mostrarTodosRegistrosPorConcepto(String concepto) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where (cedularuc ilike '%"+concepto+"%' or nombre ilike '%"+concepto+"%' or "
                + "apellidorazonsocial ilike '%"+concepto+"%') and estado = '1'");
    }
    
    @Override
    public int cantidadDeRegistros() throws SQLException {
        ResultSet resultado = Conexion.consulta(SQL_CANTIDAD_REGISTRO);        
        while( resultado.next() ) { return resultado.getInt(1); } 
        return 0;
    }
    
    public void set( ResultSet resultado ) throws SQLException {
        this.setNumCliente(resultado.getInt(1));
        this.setCedulaRuc(resultado.getString(2));
        this.setNombre(resultado.getString(3));
        this.setApellidoRazonSocial(resultado.getString(4));
        this.setFechaNacimientoConstitucion(resultado.getString(5));
        this.setCiudad(resultado.getString(6));
        this.setDireccion(resultado.getString(7));
        this.setGenero(resultado.getString(8));
    }
}
