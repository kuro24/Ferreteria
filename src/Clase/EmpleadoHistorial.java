
package Clase;

import BlueBird.Conexion;
import SqlHelper.SqlSearch;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadoHistorial implements SqlSearch {
    
    private int idEmpleadoHistorial;
    private Empleado empleado;
    private CargoLaboral cargoLaboral;
    private String fechaAsignacion;
    private String fechaDestitucion;
    private boolean activo;
    
    public static final String SQL_BUSCAR_REGISTRO = "select idempleadohistorial, numempleado, "
            + "idcargolaboral, to_char(fechadeasignacion, 'DD/MM/YYYY'), "
            + "to_char(fechadedestitucion, 'DD/MM/YYYY'), estado "
            + "from empleado_historial ";
    public static final String SQL_MOSTRAR_REGISTRO = "select idempleadohistorial, numempleado, "
            + "idcargolaboral, to_char(fechadeasignacion, 'DD/MM/YYYY'), "
            + "to_char(fechadedestitucion, 'DD/MM/YYYY'), estado "
            + "from empleado_historial ";
    public static final String SQL_CANTIDAD_REGISTRO = "select count(idempleadohistorial) from empleado_historial ";

    public EmpleadoHistorial() {}

    public EmpleadoHistorial(int idEmpleadoHistorial) throws SQLException {
        buscarPorID(idEmpleadoHistorial);
    }

    public int getIdEmpleadoHistorial() {
        return idEmpleadoHistorial;
    }

    public void setIdEmpleadoHistorial(int idEmpleadoHistorial) {
        this.idEmpleadoHistorial = idEmpleadoHistorial;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public CargoLaboral getCargoLaboral() {
        return cargoLaboral;
    }

    public void setCargoLaboral(CargoLaboral cargoLaboral) {
        this.cargoLaboral = cargoLaboral;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getFechaDestitucion() {
        return fechaDestitucion;
    }

    public void setFechaDestitucion(String fechaDestitucion) {
        this.fechaDestitucion = fechaDestitucion;
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
        String consulta = "select prc_empleado_historial('0', '"+this.getEmpleado().getNumEmpleado()+"', "
                + "'"+this.getCargoLaboral().getIdCargoLaboral()+"', "
                + "'"+this.getFechaAsignacion()+"', "
                + "'"+this.getFechaDestitucion()+"', "
                + "'"+this.getActivo()+"')";
        sqlTransact(consulta);
    }

    @Override
    public void Editar() throws SQLException {
        String consulta = "select prc_empleado_historial('"+this.getIdEmpleadoHistorial()+"', "
                + "'"+this.getEmpleado().getNumEmpleado()+"', "
                + "'"+this.getCargoLaboral().getIdCargoLaboral()+"', "
                + "'"+this.getFechaAsignacion()+"', "
                + "'"+this.getFechaDestitucion()+"', '1')";
        sqlTransact(consulta);
    }

    @Override
    public void Eliminar() throws SQLException {
        String consulta = "select prc_empleado_historial('"+this.getIdEmpleadoHistorial()+"', "
                + "'"+this.getEmpleado().getNumEmpleado()+"', "
                + "'"+this.getCargoLaboral().getIdCargoLaboral()+"', "
                + "'"+this.getFechaAsignacion()+"', "
                + "'"+this.getFechaDestitucion()+"', '0')";
        sqlTransact(consulta);
    }
    
    public void sqlTransact( String consulta ) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);       
        while( resultado.next() ) {}
    }

    @Override
    public final void buscarPorID(int ID) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where idempleadohistorial = '"+ID+"' and estado = '1'") );
    }

    @Override
    public void buscarPorConcepto(String concepto) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where to_char(fechadeasignacion, 'DD/MM/YYYY') ilike '%"+concepto+"%' and estado = '1'") );
    }
    
    @Override
    public void sqlSearchData(String consulta) throws SQLException {
        ResultSet resultado = Conexion.consulta(consulta);        
        while( resultado.next() ) { set(resultado); } 
    }
    
    @Override
    public String mostrarTodosRegistrosPorID(int ID) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where idempleadohistorial = '"+ID+"' and estado = '1'");
    }

    @Override
    public String mostrarTodosRegistrosPorConcepto(String concepto) throws SQLException {
        return SQL_MOSTRAR_REGISTRO.concat("where to_char(fechadeasignacion, 'DD/MM/YYYY') ilike '%"+concepto+"%' and estado = '1'");
    }
    
    @Override
    public int cantidadDeRegistros() throws SQLException {
        ResultSet resultado = Conexion.consulta(SQL_CANTIDAD_REGISTRO);        
        while( resultado.next() ) { return resultado.getInt(1); } 
        return 0;
    }
    
    public void set( ResultSet resultado ) throws SQLException {
        this.setIdEmpleadoHistorial(resultado.getInt(1));
        this.setEmpleado(new Empleado(resultado.getInt(2)));
        this.setCargoLaboral(new CargoLaboral(resultado.getInt(3)));
        this.setFechaAsignacion(resultado.getString(4));
        this.setFechaDestitucion(resultado.getString(5));
        this.setActivo(resultado.getInt(6));
    }
    
    @Override
    public void buscarActivo() throws SQLException {}
    
    @Override
    public void buscarActivo(int ID) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where numempleado = '"+ID+"' and estado = '1'") );
    }
    
    @Override
    public void buscarActivo(int primerId, int segundoId) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where numempleado = '"+primerId+"' and "
                + "idcargolaboral = '"+segundoId+"' and estado = '1'") );
    }
}
