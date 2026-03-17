// Esta clase colabora con objetos de PagoDolares. Solo reconoce "Dólares". 
public class Main {
    public static void main(String[] args) {
        // 1. Tenemos el servicio incompatible
        ServicioPagoPesos servicioExterno = new ServicioPagoPesos();

        // 2. Lo envolvemos en el adaptador para que parezca un PagoDolares
        PagoDolares miPago = new PagoAdapter(servicioExterno);

        // 3. El cliente usa el método que reconoce la cantidad en Dolares
        miPago.pagar(100.0);
    }
}