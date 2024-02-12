
/**
 * Write a description of class Articulo here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class Articulo
{
    // Variables de Instancia 
    private int cantidad;
    private double precio;
    private String descrip;

    /**
     * Constructor para objetos de la clase Articulo
     */
    public Articulo(int cant, String des, double precio)
    {
        cantidad = cant;
        descrip = new String(des);
        this.precio = precio; 
    }
    
    public double importe() {
        return cantidad * precio;
    }
    
}





