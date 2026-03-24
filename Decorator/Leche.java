public class Leche extends AgregadoDecorator {
    public Leche(Bebida bebida) { super(bebida); }

    @Override
    public String getDescripcion() {
        return bebidaElegida.getDescripcion() + ", con Leche";
    }

    @Override
    public double costo() {
        return bebidaElegida.costo() + 5;
    }
}