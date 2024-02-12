
/**
 * Write a description of class TestPunto here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class TestPunto
{
    // Variables de Instancia 


    /**
     * Constructor para objetos de la clase TestPunto
     */
    public TestPunto()
    {
        

    }
    
    
    public static void main(String[] args) {
        Punto<Integer> puntoEntero = new Punto<Integer>(Integer.valueOf(1), Integer.valueOf(1) );
        Punto<Double> puntoDouble = new  Punto<Double>(Double.valueOf(2.5), Double.valueOf(2.75));
        
        System.out.println("(" + puntoDouble.getX().toString() + "," 
                               + puntoDouble.getY().toString() + ")");
        System.out.println("(" + puntoEntero.getX().toString() + "," 
                               + puntoEntero.getY().toString() + ")");
    }
    
}








