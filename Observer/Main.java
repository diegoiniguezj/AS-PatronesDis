public class Main {
    public static void main(String[] args) {
        AgenciaNoticias agencia = new AgenciaNoticias();

        // Creamos los observadores
        CanalTV cnn = new CanalTV();
        AppMovil twitter = new AppMovil();

        // Los registramos en el sujeto
        agencia.suscribir(cnn);
        agencia.suscribir(twitter);

        // Al cambiar el estado, todos se enteran automáticamente
        agencia.setNoticia("¡Descubren vida en Marte!");
        
        // Podemos quitar uno en cualquier momento
        agencia.desuscribir(cnn);
        
        System.out.println("--- Segunda noticia ---");
        agencia.setNoticia("El precio del Bitcoin sube un 20%.");
    }
}