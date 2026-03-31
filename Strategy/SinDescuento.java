// Estrategia 1: Sin descuento
public class SinDescuento implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precio) { 
        return precio;
    }
}
