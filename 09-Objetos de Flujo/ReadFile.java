/**
 * ReadFile1
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ReadFile extends Frame {
    private TextArea editor;
    private DataOutputStream salida;
    //private BufferedWriter salida;

    private String nombres[] = {"Juan", "Raul", "Miguel"};
    private String apellidos[] = {"Pérez", "Zapata", "Díaz"};
    private int edades[] = { 25, 19, 35 };

    public ReadFile() throws IOException {
        super("Lector de Archivos");
        String c;
        editor = new TextArea();
        setLayout(new BorderLayout() );   //  No es necesario so es para recordar
        add(editor, "Center");

        try {
            //entrada =  new BufferedReader(new FileReader("ReadFile.java"));
            salida = new DataOutputStream(
                     new BufferedOutputStream(
                     new FileOutputStream("agenda.dat")));  
   
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //entrada.close();
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
            ReadFile readFile = new ReadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}