// Aquí se aplica el patrón, ejecutándo todo al mismo tiempo
public class CineFacade {
    //se crean las variables
    private Luces luces;
    private Proyector proyector;
    private Sonido sonido;
    private Aire aire;

    public CineFacade(Luces luces, Proyector proyector, Sonido sonido, Aire aire) {
        this.luces = luces;
        this.proyector = proyector;
        this.sonido = sonido;
        this.aire = aire;
    }

    //se ejecuta la acción principal en donde muestra lo realizado en 2do plano
    public void verPelicula() {
        System.out.println("Preparando todo para la película...");
        luces.atenuar(10);
        proyector.encender();
        proyector.modoPanoramico();
        sonido.encender();
        sonido.setVolumen(20);
        aire.encender();
        aire.nivelAire(20);
        System.out.println("¡Disfruta la función!");
    }

    public void terminarPelicula() {
        System.out.println("Apagando sistema...");
        luces.atenuar(100);
        System.out.println("Aire acondicionado apagado.");
        System.out.println("Cine en casa apagado.");
    }
}

//clase para configurar las luces
class Luces {
    public void atenuar(int nivel) { System.out.println("Luces atenuadas al " + nivel + "%"); }
}

//clase para configuración del proyector
class Proyector {
    public void encender() { System.out.println("Proyector encendido."); }
    public void modoPanoramico() { System.out.println("Proyector en modo 16:9."); }
}

//configuración del sonido
class Sonido {
    public void encender() { System.out.println("Sistema de sonido encendido."); }
    public void setVolumen(int nivel) { System.out.println("Volumen ajustado a " + nivel); }
}

class Aire {
    public void encender() { System.out.println("Aire acondicionado encendido."); }
    public void nivelAire(int nivel) { System.out.println("Aire ajustado a " + nivel + " °C"); }
}