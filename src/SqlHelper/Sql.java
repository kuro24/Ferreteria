
package SqlHelper;

import java.sql.SQLException;

/**
 *
 * @author manuel
 */
public interface Sql {
    
    public void guardar() throws SQLException;
    public void Editar() throws SQLException;
    public void Eliminar() throws SQLException;
    
    /**
     * BUSCA UN REGISTRO DE LA TABLA Y ASIGNA LOS VALORES A TODOS LOS ATRIBUTOS
     * DE LA CLASE. DEVULVE UN REGISTRO
     * @param ID EL IDENTIFICADOR DE LA TABLA SQL
     * @throws SQLException EN CASO DE UN ERROR SQL
     */
    public void buscarPorID(int ID) throws SQLException;
    
    /**
     * BUSCA UN REGISTRO DE LA TABLA Y ASIGNA LOS VALORES A TODOS LOS ATRIBUTOS
     * DE LA CLASE. DEVUELVE UN REGISTRO
     * @param concepto CUALQUIER DESCRIPCION, NOMBRE, ETC. PERTENECIENTE A LA TABLA SQL
     * @throws SQLException EN CASO DE UN ERROR SQL
     */
    public void buscarPorConcepto(String concepto) throws SQLException;
    
    /**
     * SE ENCARGA DE EJECUTAR LA CONSULTA SQL Y GUARDAR LOS REGISTROS EN
     * LOS ATRIBUTOS DE LA CLASE.
     * @param consulta
     * @throws SQLException 
     */
    public void sqlSearchData(String consulta) throws SQLException;
    
    /**
     * CARGA TODOS LOS REGISTROS DE LA TABLA CUYO ID SE ESPECIFIQUE EN EL 
     * PARAMETRO ESPECIFICADO. DEVUELVE UNO O MUCHOS REGISTROS
     * @param ID IDENTIFICADOR DE LA TALA SQL
     * @return LA CONSULTA A EJECUTAR EN STRING
     * @throws SQLException EN CASO DE ERROR SQL
     */
    public String mostrarTodosRegistrosPorID(int ID) throws SQLException;
    
    /**
     * CARGA TODOS LOS REGISTROS DE LA TABLA CUYO NOMBRE, DESCRIPCION, ETC.
     * SEA IGUAL AL PARAMETRO ESPECIFICADO. DEVUELVE MUCHOS REGISTROS
     * @param concepto NOMBRE, DESCRIPCION, ETC. A BUSCAR EN LA TABLA SQL
     * @return LA CONSULTA A EJECUTAR EN STRING
     * @throws SQLException EN CASO DE ERROR SQL
     */
    public String mostrarTodosRegistrosPorConcepto(String concepto) throws SQLException;
    
    /**
     * DEVUELVE LA CANTIDAD DE REGISTROS QUE HAY DENTRO DE LA TABLA
     * @return EL NUMERO TOTAL DE REGISTROS
     * @throws SQLException EN CASO DE ERROR SQL
     */
    public int cantidadDeRegistros() throws SQLException;
}
