//Desde la clase principal se llama todo el sistema de cine
public class Main {
    public static void main(String[] args) {
        // Componentes del subsistema
        Luces luces = new Luces();
        Proyector proyector = new Proyector();
        Sonido sonido = new Sonido();
        Aire aire = new Aire();

        // Creamos la fachada
        CineFacade cineEnCasa = new CineFacade(luces, proyector, sonido, aire);

        // Uso simplificado
        cineEnCasa.verPelicula();
        
        System.out.println("::::: Configuración a 2 horas después ::::");
        
        cineEnCasa.terminarPelicula();
    }
}