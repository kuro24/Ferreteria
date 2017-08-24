
package Clase;

import BlueBird.Conexion;
import SqlHelper.Sql;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author manuel
 */
public class EmpleadoUsuario implements Sql {
    
    private int idEmpleadoUsuario;
    private String usuario;
    private String clave;
    private int preguntaSeguridad;
    private String respuestaSeguridad;
    private boolean enLinea;
    private boolean primerInicio;
    private boolean activo;
    
    public static final String SQL_BUSCAR_REGISTRO = "select idempleadousuario, usuario, encode(clave, 'base64'), "
            + "preguntadeseguridad, respuestadeseguridad, enlinea, primerinicio, estado "
            + "from empleado_usuario ";
    public static final String SQL_MOSTRAR_REGISTRO = "select idempleadousuario, usuario, encode(clave, 'base64'), "
            + "preguntadeseguridad, respuestadeseguridad, enlinea, primerinicio, estado "
            + "from empleado_usuario ";
    public static final String SQL_CANTIDAD_REGISTRO = "select count(idempleadousuario) from empleado_usuario ";

    public EmpleadoUsuario() {}

    public EmpleadoUsuario(int idEmpleadoUsuario) throws SQLException {
        buscarPorID(idEmpleadoUsuario);
    }

    public int getIdEmpleadoUsuario() {
        return idEmpleadoUsuario;
    }

    public void setIdEmpleadoUsuario(int idEmpleadoUsuario) {
        this.idEmpleadoUsuario = idEmpleadoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(int preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public boolean isEnLinea() {
        return enLinea;
    }
    
    public int getEnLinea() {
        return enLinea == true ? 1 : 0;
    }

    public void setEnLinea(int enLinea) {
        this.enLinea = (enLinea == 1);
    }

    public boolean isPrimerInicio() {
        return primerInicio;
    }

    public int getPrimerInicio() {
        return primerInicio == true ? 1 : 0;
    }
    
    public void setPrimerInicio(int primerInicio) {
        this.primerInicio = (primerInicio == 1);
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
        String consulta = "select prc_empleado_usuario('0', '"+this.getIdEmpleadoUsuario()+"', "
                + "'"+this.getUsuario()+"', decode('"+this.getClave()+"', 'base64'), '"+this.getPreguntaSeguridad()+"', "
                + "'"+this.getRespuestaSeguridad()+"', '"+this.getEnLinea()+"', "
                + "'"+this.getPrimerInicio()+"', '"+this.getActivo()+"')";
        sqlTransact(consulta);
    }

    @Override
    public void Editar() throws SQLException {
        String consulta = "select prc_empleado_usuario('1', '"+this.getIdEmpleadoUsuario()+"', "
                + "'"+this.getUsuario()+"', decode('"+this.getClave()+"', 'base64'), '"+this.getPreguntaSeguridad()+"', "
                + "'"+this.getRespuestaSeguridad()+"', '"+this.getEnLinea()+"', "
                + "'"+this.getPrimerInicio()+"', '1')";
        sqlTransact(consulta);
    }

    @Override
    public void Eliminar() throws SQLException {
        String consulta = "select prc_empleado_usuario('1', '"+this.getIdEmpleadoUsuario()+"', "
                + "'"+this.getUsuario()+"', decode('"+this.getClave()+"', 'base64'), '"+this.getPreguntaSeguridad()+"', "
                + "'"+this.getRespuestaSeguridad()+"', '"+this.getEnLinea()+"', "
                + "'"+this.getPrimerInicio()+"', '0')";
        sqlTransact(consulta);
    }
    
    public void sqlTransact( String consulta ) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);       
        while( resultado.next() ) {}
    }

    @Override
    public final void buscarPorID(int ID) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where idempleadousuario = '"+ID+"' and estado = '1'") );
    }

    @Override
    public void buscarPorConcepto(String concepto) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where usuario ilike '%"+concepto+"%' and estado = '1'") );
    }
    
    @Override
    public void sqlSearchData(String consulta) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);        
        while( resultado.next() ) { set(resultado); } 
    }
    
    @Override
    public String mostrarTodosRegistrosPorID(int ID) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where idempleadousuario = '"+ID+"' and estado = '1'");
    }

    @Override
    public String mostrarTodosRegistrosPorConcepto(String concepto) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where usuario ilike '%"+concepto+"%' and estado = '1'");
    }
    
    @Override
    public int cantidadDeRegistros() throws SQLException {
        ResultSet resultado = Conexion.consulta(SQL_CANTIDAD_REGISTRO);        
        while( resultado.next() ) { return resultado.getInt(1); } 
        return 0;
    }
    
    public void set( ResultSet resultado ) throws SQLException {
        this.setIdEmpleadoUsuario(resultado.getInt(1));
        this.setUsuario(resultado.getString(2));
        this.setClave(resultado.getString(3));
        this.setPreguntaSeguridad(resultado.getInt(4));
        this.setRespuestaSeguridad(resultado.getString(5));
        this.setEnLinea(resultado.getInt(6));
        this.setPrimerInicio(resultado.getInt(7));
        this.setActivo(resultado.getInt(8));
    }
}
