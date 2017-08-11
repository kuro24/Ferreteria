
package BlueBird;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * MANEJA OPERACIONES DE FECHAS, TIPO STRING, DATE, ETC.
 * @author manuel
 */
public class Fecha {
    
    /**
     * DEVUELVE LA FECHA DEL SISTEMA EN FORMATO DIA-MES-AÑO
     * @return la fecha obtenida del sistema
     */
    public static String getFechaDMY() {
        SimpleDateFormat formato = new SimpleDateFormat("dd'/'MM'/'yyyy");
        
        Date date = new Date();
        String fecha = formato.format(date);
                
        return fecha;
    }
    
    /**
     * CONVIERTE UN OBJETO DATE A TIPO STRING Y DEVUELVE EN FORMATO DIA-MES-AÑO
     * @param date: objeto DATE que se piensa convertir
     * @return  la fecha del sistema
     */
    public static String getFechaDMY( Date date ) {        
        SimpleDateFormat formato = new SimpleDateFormat("dd'/'MM'/'yyyy");
        
        String fecha = formato.format(date);             
        return fecha;
    }
    
    /**
     * CONVIERTE UN OBJETO STRING EN FORMATO DATE
     * @param fecha: de tipo STRING que se piensa convertir a tipo DATE
     * @return el objeto DATE que representa la fecha
     * @throws ParseException en caso de una excepcion de convercion de fecha
     */
    public static Date getFecha( String fecha ) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd'/'MM'/'yyyy");
        
        Date date = formato.parse(fecha);
        return date;
    }
}
