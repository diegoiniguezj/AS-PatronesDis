public class CarritoCompras {
    private EstrategiaDescuento estrategia;

    // Permitimos cambiar la estrategia dinámicamente
    public void setEstrategia(EstrategiaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public void procesarPedido(double total) {
        double precioFinal = estrategia.aplicarDescuento(total);
        System.out.println("Precio Normal: $" + total + " | Con descuento: $" + precioFinal);
    }
}