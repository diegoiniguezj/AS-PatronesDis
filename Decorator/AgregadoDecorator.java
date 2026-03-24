//creamos la clase con el patrón, para implementar en el objeto principal
public abstract class AgregadoDecorator implements Bebida {
    protected Bebida bebidaElegida;

    public AgregadoDecorator(Bebida bebida) {
        this.bebidaElegida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebidaElegida.getDescripcion();
    }

    @Override
    public double costo() {
        return bebidaElegida.costo();
    }

}