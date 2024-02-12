
/**
 * Write a description of class Punto here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class Punto< E >
{
    // Variables de Instancia 
    private E x;
    private E y;

    /**
     * Constructor para objetos de la clase Punto
     */
    public Punto(E x, E y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setX(E x) {
        this.x = x;
    }
    
    public E getX() {
        return x;
    }
    
    public void setY(E y) {
        this.y = y;
    }
    
    public E getY() {
        return y;
    }
    
}
