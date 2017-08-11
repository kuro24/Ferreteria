
package BlueBird;

/**
 * Version 1.0.
 * @author manuel.
 * Dedicado al manejo interno del sistema.
 */
public class FullBuster {
    
    public static Despatch despatch;
    public static ComponentHandling componentHandling;
    public static Fecha fecha;
    public static FormDesign formDesign;
    
    public FullBuster() {
        despatch = new Despatch();
        componentHandling = new ComponentHandling();
        fecha = new Fecha();
        formDesign = new FormDesign();
    }
}
