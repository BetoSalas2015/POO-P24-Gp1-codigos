/**
 * ReadFile1
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ReadFile1 extends Frame {
    private TextArea editor;
    private FileInputStream entrada;
    private FileOutputStream salida;

    public ReadFile1() throws IOException {
        super("Lector de Archivos");
        int c;
        editor = new TextArea();
        setLayout(new BorderLayout() );   //  No es necesario so es para recordar
        add(editor, "Center");

        try {
            entrada = new FileInputStream("ReadFile1.java");
            salida = new FileOutputStream("Copia de ReadFile1.java");
            while ( (c = entrada.read()) != -1 ) {
                editor.append( String.valueOf( (char) c));
                salida.write(c);
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
            ReadFile1 ReadFile1 = new ReadFile1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}