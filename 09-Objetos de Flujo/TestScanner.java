import java.util.Scanner;

public class TestScanner {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una cadena de caracteres: ");
        String string = scanner.nextLine();

        System.out.println("Ingresa un número entero: ");
        int entero = scanner.nextInt();

        System.out.println("LA cadena capturada es: " + string);
        System.out.println("El numero capturado fue: " + entero);
    }
}
