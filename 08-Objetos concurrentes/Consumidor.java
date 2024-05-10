public class Consumidor extends Thread {
    private Almacen dato;

    public Consumidor(Almacen alm) {
        dato = alm;
    }

    @Override
    public void run() {
        int num;
        for (int i = 1; i <= 10; i++) {
            try {
                sleep((int) Math.random() * 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num = dato.getValor();
            System.out.println("Se extrajoel número: " + num);
        }
    }
}
