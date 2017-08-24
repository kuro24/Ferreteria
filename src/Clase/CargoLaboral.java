
package Clase;

import BlueBird.Conexion;
import SqlHelper.Sql;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CargoLaboral implements Sql {
    
    private int idCargoLaboral;
    private String nombreCargo;
    private String descripcionCargo;
    private boolean activo;
    
    public static final String SQL_BUSCAR_REGISTRO = "select idcargolaboral, nombredelcargo, "
            + "descripciondelcargo, estado "
            + "from cat_cargolaboral ";
    public static final String SQL_MOSTRAR_REGISTRO = "select idcargolaboral, nombredelcargo, "
            + "descripciondelcargo "
            + "from cat_cargolaboral ";
    public static final String SQL_CANTIDAD_REGISTRO = "select count(idcargolaboral) from cat_cargolaboral ";

    public CargoLaboral() {}

    public CargoLaboral(int idCargoLaboral) throws SQLException {
        buscarPorID(idCargoLaboral);
    }

    public int getIdCargoLaboral() {
        return idCargoLaboral;
    }

    public void setIdCargoLaboral(int idCargoLaboral) {
        this.idCargoLaboral = idCargoLaboral;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getDescripcionCargo() {
        return descripcionCargo;
    }

    public void setDescripcionCargo(String descripcionCargo) {
        this.descripcionCargo = descripcionCargo;
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
        String consulta = "select prc_cargolaboral('0', '"+this.getNombreCargo()+"', "
                + "'"+this.getDescripcionCargo()+"', "
                + "'"+this.getActivo()+"')";
        sqlTransact(consulta);
    }

    @Override
    public void Editar() throws SQLException {
        String consulta = "select prc_cargolaboral('"+this.getIdCargoLaboral()+"', "
                + "'"+this.getNombreCargo()+"', "
                + "'"+this.getDescripcionCargo()+"', '1')";
        sqlTransact(consulta);
    }

    @Override
    public void Eliminar() throws SQLException {
        String consulta = "select prc_cargolaboral('"+this.getIdCargoLaboral()+"', "
                + "'"+this.getNombreCargo()+"', "
                + "'"+this.getDescripcionCargo()+"', '0')";
        sqlTransact(consulta);
    }
    
    public void sqlTransact( String consulta ) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);       
        while( resultado.next() ) {}
    }

    @Override
    public final void buscarPorID(int ID) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where idcargolaboral = '"+ID+"' and estado = '1'") );
    }

    @Override
    public void buscarPorConcepto(String concepto) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where nombredelcargo ilike '%"+concepto+"%' and estado = '1'") );
    }
    
    @Override
    public void sqlSearchData(String consulta) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);        
        while( resultado.next() ) { set(resultado); } 
    }
    
    @Override
    public String mostrarTodosRegistrosPorID(int ID) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where idcargolaboral = '"+ID+"' and estado = '1'");
    }

    @Override
    public String mostrarTodosRegistrosPorConcepto(String concepto) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where nombredelcargo ilike '%"+concepto+"%' and estado = '1'");
    }
    
    @Override
    public int cantidadDeRegistros() throws SQLException {
        ResultSet resultado = Conexion.consulta(SQL_CANTIDAD_REGISTRO);        
        while( resultado.next() ) { return resultado.getInt(1); } 
        return 0;
    }
    
    public void set( ResultSet resultado ) throws SQLException {
        this.setIdCargoLaboral(resultado.getInt(1));
        this.setNombreCargo(resultado.getString(2));
        this.setDescripcionCargo(resultado.getString(3));
        this.setActivo(resultado.getInt(4));
    }
}
