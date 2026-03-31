// Estrategia 3: Descuento Black Friday (50%)
public class DescuentoBlackFriday implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precio) { 
        return precio * 0.50; 
    }
}