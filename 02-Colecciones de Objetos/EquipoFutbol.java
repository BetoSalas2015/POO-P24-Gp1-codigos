
/**
 * Write a description of class EquipoFutbol here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class EquipoFutbol
{
    // Variables de Instancia 
    private String nombre;
    private String entrenador;
    private String[] equipo;

    public EquipoFutbol(String nombre, String entrenador)
    {
        this.nombre = new String(nombre);
        this.entrenador = new String(entrenador);
        equipo = new String[11];        // 11 jugadores
    }
    
    public String getNombre() {
        return new String(nombre);
    }
    
    public String getEntrenador() {
        return new String(entrenador);
    }
    
    public void setEntrenador(String nuevoEntrenador) {
        entrenador = new String(nuevoEntrenador);
    }
    
    public void agregaJugador(int index, String jugador) {
        if(index >= 1 &&  index <= 11) 
            equipo[index - 1] = new String(jugador);
    }
    
    public String getJugador(int index) {
        if(index >= 1 && index <= 11 && equipo[index - 1] != null)
            return new String(equipo[index - 1]);
        else
            return null;
    }

    public static void main(String[] args) {
        EquipoFutbol equipoFu1 = new EquipoFutbol("MAzacotes de Chinconrepec", "Horacio Cascarin");
        equipoFu1.agregaJugador(3, "La Lombriz");
        equipoFu1.agregaJugador(7, "El Jalapeño");
        System.out.println( equipoFu1.getJugador(6));
        System.out.println( equipoFu1.getJugador(7));
    }
    
}






