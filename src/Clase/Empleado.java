
package Clase;

import BlueBird.Conexion;
import BlueBird.Fecha;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

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
    
    public static final String SQL_BUSCAR_REGISTRO = "select numempleado, cedularuc, nombre, "
            + "apellidorazonsocial, "
            + "to_char(fechanacimientoconstitucion, 'DD/MM/YYYY'), "
            + "ciudad, direccion, genero, inss, fotoempleado, estado "
            + "from cat_empleado ";
    public static final String SQL_MOSTRAR_REGISTRO = "select numempleado, cedularuc, inss, nombre, "
            + "apellidorazonsocial, "
            + "to_char(fechanacimientoconstitucion, 'DD/MM/YYYY'), "
            + "ciudad, direccion, genero "
            + "from cat_empleado ";
    public static final String SQL_CANTIDAD_REGISTRO = "select count(numempleado) from cat_empleado ";
    
    public Empleado() {}

    public Empleado(int numEmpleado) throws SQLException {
        buscarPorID(numEmpleado);
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

    @Override
    public void guardar() throws SQLException {
        CallableStatement consulta = Conexion.conectar.prepareCall("{call prc_empleado(?,?,?,?,?,?,?,?,?,?,?)}");
        sqlTransact(consulta);
    }

    @Override
    public void Editar() throws SQLException {
        CallableStatement consulta = Conexion.conectar.prepareCall("{call prc_empleado(?,?,?,?,?,?,?,?,?,?,?)}");        
        sqlTransact(consulta);
    }

    @Override
    public void Eliminar() throws SQLException {       
        CallableStatement consulta = Conexion.conectar.prepareCall("{call prc_empleado(?,?,?,?,?,?,?,?,?,?,?)}");      
        sqlTransact(consulta);
    }
    
    public void sqlTransact( CallableStatement consulta ) throws SQLException {
        Date fecha = null;
        try { fecha = new Date( Fecha.getFecha(this.getFechaNacimientoConstitucion()).getTime() );
        } catch (ParseException ex) {}
        
        consulta.setInt(1, this.getNumEmpleado());
        consulta.setString(2, this.getCedulaRuc());
        consulta.setString(3, this.getNombre());
        consulta.setString(4, this.getApellidoRazonSocial());
        consulta.setDate(5, fecha);
        consulta.setString(6, this.getCiudad());
        consulta.setString(7, this.getDireccion());
        consulta.setString(8, this.getGenero());
        consulta.setString(9, this.getInss());
        consulta.setBinaryStream(10, this.getGuardarFoto());
        consulta.setInt(11, this.getActivo());
        
        consulta.execute();
        consulta.close();
    }
    
    @Override
    public final void buscarPorID(int ID) throws SQLException {
        sqlSearchData( SQL_BUSCAR_REGISTRO.concat("where numempleado = '"+ID+"' and estado = '1'") );
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
        return SQL_MOSTRAR_REGISTRO.concat("where numempleado = '"+ID+"' and estado = '1'");
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
        this.setNumEmpleado(resultado.getInt(1));
        this.setCedulaRuc(resultado.getString(2));
        this.setNombre(resultado.getString(3));
        this.setApellidoRazonSocial(resultado.getString(4));
        this.setFechaNacimientoConstitucion(resultado.getString(5));
        this.setCiudad(resultado.getString(6));
        this.setDireccion(resultado.getString(7));
        this.setGenero(resultado.getString(8));
        this.setInss(resultado.getString(9));
        this.setLeerFoto(resultado.getBinaryStream(10));
        this.setActivo(resultado.getInt(11));
    }
}
