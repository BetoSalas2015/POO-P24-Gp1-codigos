/**
 * ReadFile41
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ReadFile4 extends Frame {
    private TextArea editor;
    private DataOutputStream salida;
    //private BufferedWriter salida;

    private String nombres[] = {"Juan", "Raul", "Miguel"};
    private String apellidos[] = {"Pérez", "Zapata", "Díaz"};
    private int edades[] = { 25, 19, 35 };

    public ReadFile4() throws IOException {
        super("Lector de Archivos");
        String c;
        editor = new TextArea();
        setLayout(new BorderLayout() );   //  No es necesario so es para recordar
        add(editor, "Center");

        try {
            //entrada =  new BufferedReader(new FileReader("ReadFile4.java"));
            salida = new DataOutputStream(
                     new BufferedOutputStream(
                     new FileOutputStream("agenda.dat")));  

            for (int i = 0; i < 3; i++) {
                salida.writeUTF(nombres[i]);
                salida.writeUTF(apellidos[i]);
                salida.writeInt(edades[i]);
            }
   
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
            ReadFile4 ReadFile4 = new ReadFile4();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}