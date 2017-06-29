
package BlueBird;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author manuel
 */
public class ComponentHandling {
    
    ResultSet result;
    
    /**
     * ESTABLECE EL MODELO DE TABLA QUE LLEVARA EL COMPONENTE.
     * POR DEFECTO, LAS FILAS NO PODRAN EDITARSE.
     * 
     * @param tabla: el objeto tabla en donde se agregara el modelo.
     * @param nombreColumnas: el array de las columnas que conformara la tabla.
     * @return el modelo de tabla preestablecido que se utilizara.
     */
    public DefaultTableModel setTableModel( JTable tabla, String[] nombreColumnas ) {
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable( int row, int column ) {
                return false;
            }
        };
        
        DefaultTableCellRenderer color = new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
                
                if( isSelected ) {
                    this.setOpaque(true);
                    this.setBackground(new Color(135, 206, 250));
                    this.setForeground(Color.BLACK);
                } else {
                    if( row == 0 ) {
                        this.setOpaque(true);
                        this.setBackground(Color.WHITE);
                        this.setForeground(Color.BLACK);
                    } else if( row%2 != 0 ) {
                        this.setOpaque(true);
                        this.setBackground(new Color(230, 230, 250));
                        this.setForeground(Color.BLACK);
                    } else {
                        this.setOpaque(true);
                        this.setBackground(Color.WHITE);
                        this.setForeground(Color.BLACK);
                    }
                }               
                return this;
            }
        };         
        color.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (String nombreColumna : nombreColumnas) {
            modelo.addColumn(nombreColumna);
            
            TableColumn columna = tabla.getColumn(nombreColumna);
            columna.setPreferredWidth(nombreColumna.length()*25);
            columna.setMaxWidth(300); columna.setMinWidth(50);
        }    
        tabla.setModel(modelo);
        tabla.setRowHeight(27);
        
        for(int i = 0; i < nombreColumnas.length; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(color);
        }
        return modelo;
    }
    
    /**
     * MUESTRA TODOS LOS ELEMENTOS DE LA CONSULTA EN UNA TABLA
     * 
     * @param consulta: consulta SQL donde se mostraran los datos.
     * @param modelo: modelo de tabla utilizado para mostrar los datos de SQL.
     *
     * @throws SQLException lanza error SQL.
     */
    public void loadTabla( String consulta, DefaultTableModel modelo) throws SQLException {
        modelo.setRowCount(0);

        result = Conexion.consulta(consulta);
        while( result.next() ) {
            Vector v = new Vector();
            
            for (int i = 0; i < modelo.getColumnCount(); i++) v.add(result.getObject(i+1));
            modelo.addRow(v);
        }
    }
    
    /**
     * DEVUELVE EL ID DE LA BD AL SELECCIONAR UN ITEM DENTRO DEL JCOMBOBOX.
     * 
     * @param combo: El item dentro del JComboBox.
     * @return el id seleccionado.
     */
    public String getIdCombo( String combo ) {
        String id;
        int index = 0;       
        
        for (int i = 0; i < combo.length(); i++) {
            if( combo.charAt(i) == '.' ) { index = i; }
        }
        
        id = combo.substring(0, index);
        return id;
    }
    
    /**
     * LLENA EL JCOMBOBOX CON UNA CONSULTA A UNA TABLA SQL.
     * 
     * @param combo: el objeto JComboBox donde se cargaran los registros.
     * @param consulta: la consulta SQL que cargara los registros de la BD.
     * @exception SQLException lanza error SQL.
     */
    public void loadComboBox( JComboBox combo, String consulta ) throws SQLException {
        combo.removeAllItems();
        result = Conexion.consulta(consulta);

        while( result.next() ) combo.addItem(result.getInt(1)+". "+result.getObject(2));
    }
}