//Se crea la subclase para agregar el jarabe
public class Jarabemiel extends AgregadoDecorator {
    public Jarabemiel(Bebida bebida) { super(bebida); }

    @Override
    public String getDescripcion() {
        return bebidaElegida.getDescripcion() + ", con Jarabe";
    }

    @Override
    public double costo() {
        return bebidaElegida.costo() + 7;
    }
}