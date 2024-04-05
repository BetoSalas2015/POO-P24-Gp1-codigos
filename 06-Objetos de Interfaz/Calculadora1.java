/**
 * Calculadora V1 - awt 1.0
 */
import java.awt.*;

public class Calculadora1 extends Frame {
    //  Interfaz
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private Button btnMas, btnMenos, btnMult, btnDiv, btnPunto, btnIgual, btnC;
    private TextField txtDisplay; 
    private Panel pnlTeclado, pnlDisplay;
    // Funcionalidad
    private double numero1, numero2, resultado;
    private char operación;
    private boolean operando, punto;
    private String displaynum, sign;

    public Calculadora1() {
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

        // Funcionalidad
        punto = operando = true;
    }

    public boolean handleEvent(Event e) {
        if(e.id == Event.WINDOW_DESTROY) {
            hide();
            dispose();
            return true;
        }
        return super.handleEvent(e);
    }

    public boolean action(Event e, Object o) {
        if (e.target instanceof Button) {
            if (e.target == btnC) {
                txtDisplay.setText("0");
                punto = operando = true;
                numero1 = numero2 = 0.0;
            } else {
                if (e.target == btnMas || e.target == btnMenos || e.target == btnMult || e.target == btnDiv) {
                    Button btnTemp = (Button) e.target;
                    sign = new String(btnTemp.getLabel());
                    operación = sign.charAt(0);
                    numero1 = Double.parseDouble( txtDisplay.getText()) ;
                    txtDisplay.setText("0");
                    operando = false;
                } else {
                    if (e.target == btnPunto) {
                        if (punto) {
                            displaynum = new String(txtDisplay.getText());
                            displaynum += ".";
                            txtDisplay.setText(displaynum);
                            punto = false;
                        } // de if(punto)
                    } else {
                        if (e.target == btnIgual) {
                            numero2 = Double.parseDouble(txtDisplay.getText());
                            switch (operación) {
                                case '+': resultado = numero1 + numero2;  break;
                                case '-': resultado = numero1 - numero2;  break;
                                case '*': resultado = numero1 * numero2;  break;
                                case '/': resultado = numero1 / numero2;  break;

                            }
                            txtDisplay.setText(String.valueOf(resultado));
                            operando = punto = true;
                        } else {
                            displaynum = new String( txtDisplay.getText() );
                            if( displaynum.equals("0") )
                                displaynum = "";
                            Button btnTemp = (Button) e.target;
                            displaynum += btnTemp.getLabel();
                            txtDisplay.setText(displaynum);
                        } //  btnIgual
                    } //  btnPunto
                } // btnMas....
            } //  btnc
        } // instanceof

        return super.action(e, o);
    }   // de action

    public static void main(String[] args) {
        Calculadora1 calc = new Calculadora1();
        calc.resize(400,400);
        calc.show();
    }

    
}

