public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia por primera vez
        DatabaseConnector db1 = DatabaseConnector.getInstance();
        db1.executeQuery("Consulta1");

        // Intentamos obtener otra instancia
        DatabaseConnector db2 = DatabaseConnector.getInstance();
        db2.executeQuery("Consulta2");
        
        // Ahora comparamos si son el mismo objeto en memoria
        if (db1 == db2) {
            System.out.println("Ambas variables apuntan a la misma instancia.");
        }
    }
}