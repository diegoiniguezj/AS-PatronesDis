//Se crea la subclase para agregar el chocolate
public class Chocolate extends AgregadoDecorator {
    public Chocolate(Bebida bebida) { super(bebida); }

    @Override
    public String getDescripcion() {
        return bebidaElegida.getDescripcion() + ", con Chocolate";
    }

    @Override
    public double costo() {
        return bebidaElegida.costo() + 10;
    }
}