// Clase base de la logística
public abstract class Logistica {
    // Este es el "Factory Method"
    public abstract Transporte crearTransporte();

    public void planificarEntrega() {
        // Usamos el método de fábrica para obtener un objeto sin saber cuál es
        Transporte t = crearTransporte();
        t.entregar();
    }
}

