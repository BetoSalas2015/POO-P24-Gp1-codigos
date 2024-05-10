public class Productor extends Thread {
    private Almacen dato;

    public Productor(Almacen alm) {
        dato = alm;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            dato.setValor(i); 
            System.out.println("Se guardo el valor: " + i);
        }
        try {
            sleep( (int) Math.random() * 500 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
