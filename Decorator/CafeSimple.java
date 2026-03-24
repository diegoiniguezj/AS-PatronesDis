//Esta es la clase que genera el objeto principal, implementando la clase Bebida
public class CafeSimple implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café Simple";
    }

    @Override
    public double costo() {
        return 30;
    }
}


