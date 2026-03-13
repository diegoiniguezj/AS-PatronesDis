public class Camion implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega por tierra en camión de carga.");
    }
}