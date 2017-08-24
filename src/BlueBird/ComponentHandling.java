
package BlueBird;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author manuel
 */
public class ComponentHandling {
    
    private static ResultSet result;
    
    /**
     * ESTABLECE EL MODELO DE TABLA QUE LLEVARA EL COMPONENTE.
     * POR DEFECTO, LAS FILAS NO PODRAN EDITARSE.
     * 
     * @param tabla: el objeto tabla en donde se agregara el modelo.
     * @param nombreColumnas: el array de las columnas que conformara la tabla.
     * @return el modelo de tabla preestablecido que se utilizara.
     */
    public static DefaultTableModel setTableModel( JTable tabla, String[] nombreColumnas ) {
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable( int row, int column ) {
                return false;
            }
        };
        
        DefaultTableCellRenderer color = new DefaultTableCellRenderer() {
            @Override
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
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        
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
    public static void loadTabla( String consulta, DefaultTableModel modelo ) throws SQLException {
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
     * @param combo: El getSelectedItem() dentro del JComboBox.
     * @return el id seleccionado.
     */
    public static String getIdCombo( String combo ) {
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
    public static void loadComboBox( JComboBox combo, String consulta ) throws SQLException {
        combo.removeAllItems();
        result = Conexion.consulta(consulta);

        while( result.next() ) combo.addItem(result.getInt(1)+". "+result.getObject(2));
    }
    
    /**
     * VALIDA EL TIPO DE DATO QUE RECIBE EL JTEXTFIELD QUE SE PASA COMO PARAMETRO
     * @param opcion 1: SOLO ACEPTAN LETRAS. 2: SOLO ACEPTAN NUMEROS. 3: ACEPTAR NUMERO Y LETRA
     * @param campo EL OBJETO JTEXTFIELD QUE SE QUIERE VALIDAR
     * @param evt EL OBJETO KEYEVENT QUE MODIFICARA EL JTEXTFIELD
     * @param limiteCaracteres LIMITE DE CARACTERES PERMITIDOS DENTRO DEL TEXTFIELD
     */
    public static void validarTextField( int opcion, JTextField campo, KeyEvent evt, int limiteCaracteres ) {
        switch(opcion) {
            case 1: //NO ACEPTEN NUMEROS
                if( Character.isDigit(evt.getKeyChar()) || campo.getText().length() >= limiteCaracteres ) 
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                break;
            case 2: //NO ACEPTEN LETRAS
                if( Character.isLetter(evt.getKeyChar()) || campo.getText().length() >= limiteCaracteres ) 
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                break;
            case 3: //ACEPTAR NUMEROS Y LETRAS
                if( campo.getText().length() >= limiteCaracteres ) 
                    evt.consume();
                break;
        }
    }
}
