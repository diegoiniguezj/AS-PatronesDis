// Estrategia 2: Descuento de Navidad (10%)
public class DescuentoNavidad implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precio) { 
        return precio * 0.90; 
    }
}
