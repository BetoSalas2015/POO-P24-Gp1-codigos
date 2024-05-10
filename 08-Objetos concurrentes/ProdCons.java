public class ProdCons {
    private Almacen alm;
    private Consumidor c;
    private Productor p;

    public ProdCons() {
        alm = new Almacen();    
        p = new Productor(alm);
        c = new Consumidor(alm); 

        c.start();
        p.start();
    }

    public static void main(String[] args) {
        ProdCons prodCons = new ProdCons();
    }

}
