
package Clase;

import BlueBird.Conexion;
import SqlHelper.Sql;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author manuel
 */
public class OperadorMovil implements Sql {
    
    private int idOperadorMovil;
    private String operadorMovil;
    private boolean activo;
    
    public static final String SQL_BUSCAR_REGISTRO = "select idoperadormovil, "
            + "operadormovil, estado "
            + "from cat_operadormovil ";
    public static final String SQL_MOSTRAR_REGISTRO = "select idoperadormovil, "
            + "operadormovil, estado "
            + "from cat_operadormovil ";
    public static final String SQL_CANTIDAD_REGISTRO = "select count(idoperadormovil) from cat_operadormovil ";

    public OperadorMovil() {}

    public OperadorMovil(int idOperadorMovil) throws SQLException {
        buscarPorID(idOperadorMovil);
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
    
    @Override
    public void guardar() throws SQLException {
        String consulta = "select prc_operadormovil('0', '"+this.getOperadorMovil()+"', "
                + "'"+this.getActivo()+"')";
        sqlTransact(consulta);
    }

    @Override
    public void Editar() throws SQLException {
        String consulta = "select prc_operadormovil('"+this.getIdOperadorMovil()+"', "
                + "'"+this.getOperadorMovil()+"', '1')";
        sqlTransact(consulta);
    }

    @Override
    public void Eliminar() throws SQLException {
        String consulta = "select prc_operadormovil('"+this.getIdOperadorMovil()+"', "
                + "'"+this.getOperadorMovil()+"', '0')";
        sqlTransact(consulta);
    }
    
    public void sqlTransact( String consulta ) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);       
        while( resultado.next() ) {}
    }

    @Override
    public final void buscarPorID(int ID) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where idoperadormovil = '"+ID+"' and estado = '1'") );
    }

    @Override
    public void buscarPorConcepto(String concepto) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where operadormovil ilike '%"+concepto+"%' and estado = '1'") );
    }
    
    @Override
    public void sqlSearchData(String consulta) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);        
        while( resultado.next() ) { set(resultado); } 
    }
    
    @Override
    public String mostrarTodosRegistrosPorID(int ID) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where idoperadormovil = '"+ID+"' and estado = '1'");
    }

    @Override
    public String mostrarTodosRegistrosPorConcepto(String concepto) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where operadormovil ilike '%"+concepto+"%' and estado = '1'");
    }
    
    @Override
    public int cantidadDeRegistros() throws SQLException {
        ResultSet resultado = Conexion.consulta(SQL_CANTIDAD_REGISTRO);        
        while( resultado.next() ) { return resultado.getInt(1); } 
        return 0;
    }
    
    public void set( ResultSet resultado ) throws SQLException {
        this.setIdOperadorMovil(resultado.getInt(1));
        this.setOperadorMovil(resultado.getString(2));
        this.setActivo(resultado.getInt(3));
    }
}
