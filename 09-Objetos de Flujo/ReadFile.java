/**
 * ReadFile1
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ReadFile extends Frame {
    private TextArea editor;
    private DataInputStream entrada;

    public ReadFile() throws IOException {
        super("Lector de Archivos");
        String c;
        editor = new TextArea();
        setLayout(new BorderLayout() );   //  No es necesario so es para recordar
        add(editor, "Center");

        try {
            //entrada =  new BufferedReader(new FileReader("ReadFile.java"));
            entrada = new DataInputStream(
                     new BufferedInputStream(
                     new FileInputStream("agenda.dat")));  

            while(true) {
                String nomString = entrada.readUTF();
                String apString = entrada.readUTF();
                int edad = entrada.readInt();
                c = nomString + " " + apString + ", Edad: " + edad + "\n";
                editor.append(c);
            }
        } catch (EOFException exception) {
                System.out.println("Fin de Arcchivo Alcanzado");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            entrada.close();
            
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