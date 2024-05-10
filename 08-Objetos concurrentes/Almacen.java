public class Almacen {
    private int valor;
    private boolean libre = true;       // Semáforo

    public synchronized void setValor(int valor) {
        while ( !libre ) {              //  Monitor
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.valor = valor;
        libre = false;
        notify();
    }

    public synchronized int getValor() {
        while (libre) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        libre = true;
        notify(); 
        return valor;
    }
}
