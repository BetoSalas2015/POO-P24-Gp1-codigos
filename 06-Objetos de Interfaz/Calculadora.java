/**
 * Calculadora
 */
import java.awt.*;

public class Calculadora extends Frame {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnMas, btnMenos, btnMult, btnDiv, btnPunto, btnIgual, btnC;
    private TextField txtDisplay; 
    private Panel pnlTeclado, pnlDisplay;

    public Calculadora() {
        super("Calculadora");

        //  Creación de Objetos
        btn0 = new Button("0");     btn1 = new Button("1"); 
        btn2 = new Button("2");     btn3 = new Button("3"); 
        btn4 = new Button("4");     btn5 = new Button("5"); 
        btn6 = new Button("6");     btn7 = new Button("7"); 
        btn8 = new Button("8");     btn9 = new Button("9"); 
        btnMas = new Button("+");   btnMenos = new Button("-"); 
        btnMult = new Button("*");  btnDiv = new Button("/"); 
        btnPunto = new Button("."); btnIgual = new Button("="); 
        btnC = new Button("C"); 

        txtDisplay = new TextField("0");

        pnlDisplay = new Panel();
        pnlTeclado = new Panel();

        // Organizar los paneles
        pnlDisplay.setLayout( new BorderLayout() );
        pnlDisplay.add(btnC, "East");
        pnlDisplay.add(txtDisplay, "Center");

        pnlTeclado.setLayout( new GridLayout(4, 4, 2, 2) );
        pnlTeclado.add(btn7);   pnlTeclado.add(btn8);   pnlTeclado.add(btn9);   pnlTeclado.add(btnDiv);
        pnlTeclado.add(btn4);   pnlTeclado.add(btn5);   pnlTeclado.add(btn6);   pnlTeclado.add(btnMult);
        pnlTeclado.add(btn1);   pnlTeclado.add(btn2);   pnlTeclado.add(btn3);   pnlTeclado.add(btnMenos);
        pnlTeclado.add(btnIgual);   pnlTeclado.add(btn0);   pnlTeclado.add(btnPunto);   pnlTeclado.add(btnMas);

        //  Agregamos los paneles al Frame
        add(pnlDisplay, "North");
        add(pnlTeclado, "Center");
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.resize(400,400);
        calc.show();
    }
    
}