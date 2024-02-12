
/**
 * Write a description of class Factura here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
import java.util.Vector;

public class Factura
{
    // Variables de Instancia 
    private String empresa;
    private String cliente;
    private static int numFactura = 1;
    private Vector<Articulo> articulos;
    

    /**
     * Constructor para objetos de la clase Factura
     */
    public Factura(String nomCliente)
    {
        empresa = new String("Papelería Thoni");
        cliente = new String(nomCliente);
        numFactura++;
        articulos = new Vector<Articulo>(10);
    }
    
    public int getNumArtículos() {
        return articulos.size();
    }
    
    public void agregaArticulo(Articulo art) {
        articulos.add(art);
    }
    
    public Articulo getArticulo(int index) {
        return articulos.get(index);
    }
    
    public void setArtículo(int index, Articulo nuevo) {
        articulos.set(index, nuevo);
    }
    
    public double calculaTotalArticulos() {
        Articulo recorre;
        double sum = 0.0;
        for(int i = 0; i < articulos.size(); i++) {
            recorre = getArticulo(i);
            sum += recorre.importe();
        }
        return sum;
    }
    
    public double calculaTotalArticulos1() {
        double sum = 0.0;
        for(Articulo recorre : articulos )
            sum += recorre.importe();
        return sum;
    }
    
}






