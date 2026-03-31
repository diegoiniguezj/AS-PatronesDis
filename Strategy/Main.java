public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        // 1. Un día normal
        carrito.setEstrategia(new SinDescuento());
        carrito.procesarPedido(100.0);

        // 2. Llega Navidad (cambio de comportamiento en caliente)
        carrito.setEstrategia(new DescuentoNavidad());
        carrito.procesarPedido(100.0);

        // 3. ¡Locura de Black Friday!
        carrito.setEstrategia(new DescuentoBlackFriday());
        carrito.procesarPedido(100.0);
    }
}