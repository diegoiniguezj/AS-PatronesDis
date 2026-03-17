// Es el corazón del patrón. Implementa la clase PagoDolares y mantiene una referencia interna al ServicioPagoPesos. 
// Cuando se llama a pagar(), el adaptador realiza la conversión de moneda 
// y llama al método realizarPago() del servicio de pesos.
public class PagoAdapter implements PagoDolares {
    private ServicioPagoPesos servicioPesos;
    private final double TASA_CAMBIO = 17.86; // 1 USD = 17.86 MN

    public PagoAdapter(ServicioPagoPesos servicioPesos) {
        this.servicioPesos = servicioPesos;
    }

    @Override
    public void pagar(double cantidadDolares) {
        // El adaptador realiza la traducción/conversión
        double cantidadPesos = cantidadDolares * TASA_CAMBIO;
        System.out.print("[Adapter] Convirtiendo $ " + cantidadDolares + " dolares a $ " + cantidadPesos + " pesos -> ");
        servicioPesos.realizarPago(cantidadPesos);
    }
}