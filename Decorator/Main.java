//Clase principal desde donde se llama al objeto principal
public class Main {
    public static void main(String[] args) {
        // Pedimos un café simple -- Objeto simple
        Bebida miCafe = new CafeSimple();
        
        //Llamamos a las decoraciones
        // Lo decoramos con leche
        miCafe = new Leche(miCafe);
        // Con jarabe
        miCafe = new Jarabemiel(miCafe);

        System.out.println("Pedido: " + miCafe.getDescripcion());
        System.out.println("Total a pagar: $" + miCafe.costo() + " pesos");
    }
}