
/**
 * Write a description of class TestGenericos here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class TestGenericos
{
    // Variables de Instancia 


    /**
     * Constructor para objetos de la clase TestGenericos
     */
    public TestGenericos()
    {
    }
    
    public static < E > void imprimeArreglo(E[] arregloEntrada) {
        for(E elemento : arregloEntrada)
            System.out.print(elemento + ", ");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        Double[] arrDouble = { 3.2, 2.3, 5.2, 7.4 };
        Integer[] arrInt = { 1, 2, 3, 4, 5, 6 ,7 };
        Character[] arrChar = { 'a', 'b', 'c', 'd', 'e' };
        Boolean[] arrBoolean = { true, false, false, true };
        imprimeArreglo(arrDouble);
        imprimeArreglo(arrInt);
        imprimeArreglo(arrChar);
        imprimeArreglo(arrBoolean); 
    }
    
    
    
}
