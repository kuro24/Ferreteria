
package SqlHelper;

import java.sql.SQLException;

/**
 *
 * @author manuel
 */
public interface SqlSearch extends Sql {
    
    public void buscarActivo() throws SQLException;
    public void buscarActivo(int ID) throws SQLException;
    public void buscarActivo(int primerId, int segundoId) throws SQLException;
}
