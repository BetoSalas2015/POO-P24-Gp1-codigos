/**
 * Dibujo
 */
import java.awt.*;

public class Dibujo extends Frame {

    public Dibujo() {
        super("Area de Dibujo");
    }

    public boolean handleEvent(Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            hide();
            dispose();
            return true;
        }
        return super.handleEvent(e);
    }

    public void paint(Graphics g) {
        Color color = new Color(0.0f, 0.0f, 1.0f);
        g.setColor(color);
        g.drawString("Saludos Programas!!!!!", 100, 100);
    }

    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();
        dibujo.resize(350, 380);        // Deprecado
        dibujo.show();                              // Deprecado
    }
    
}