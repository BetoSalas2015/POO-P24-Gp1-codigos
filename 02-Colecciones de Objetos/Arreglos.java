
/**
 * Write a description of class Arreglos here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class Arreglos
{
    // tipo_dato nombre[dimensión]
    private int arreglo[], variable ;
    private int []arreglo1, arreglo4 = new int[15];
    private int[] arreglo2, arreglo5 = { 0, 1, 2, 3, 4, 5};
    ;
    private int[][] matriz = { {1,2,3 }, {4}, {5,6,7,8}, { 9,10 } };
    
    public Arreglos() {
        arreglo = new int[10];
        arreglo[4] = 10;
        
        for(int i = 0; i < arreglo4.length; i++)
            arreglo4[i] = i * 2;
            
        variable = 10;
            
        cambiaArreglo(arreglo4);        // Paso de Parametros por referencia (alias)
        cambiaVariable(variable);       // Paso de argumentos por valor (copia)
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++)
                System.out.print( matriz[i][j] + ",");
            System.out.println("");
        }
        
    }
    
    public void cambiaVariable(int var) { 
        var = 0;
    }

    public void cambiaArreglo(int[] arreglo) { 
        for(int i = 0; i < arreglo4.length; i++)
            arreglo[i] = 0;
    }
    
    public static void main(String[] args) {
        
    }
    
}



