/**
 * ReadFile31
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ReadFile3 extends Frame {
    private TextArea editor;
    private BufferedReader entrada;
    private BufferedWriter salida;

    public ReadFile3() throws IOException {
        super("Lector de Archivos");
        String c;
        editor = new TextArea();
        setLayout(new BorderLayout() );   //  No es necesario so es para recordar
        add(editor, "Center");

        try {
            entrada =  new BufferedReader(new FileReader("ReadFile3.java"));
            salida = new BufferedWriter(new FileWriter("Copia de ReadFile3.java"));
            while ( (c = entrada.readLine()) != null ) {
                editor.append( c + "\n" );
                salida.append( c + "\n" );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            entrada.close();
            salida.close();
        }

        setSize(400, 400);
        setVisible(true);
        addWindowListener(new CloseWin() );
    }

    private class CloseWin extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            dispose();
        }
             
    }

    public static void main(String[] args) { 
        try {
            ReadFile3 ReadFile3 = new ReadFile3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}