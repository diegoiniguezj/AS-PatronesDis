public class DatabaseConnector {
    // 1. Variable estática privada que almacenará la instancia única
    private static DatabaseConnector instance;
    private String connectionString;

    // 2. Constructor privado para evitar instanciación externa
    private DatabaseConnector() {
        this.connectionString = "MI_App";
        System.out.println("Conexión a base de datos establecida.");
    }

    // 3. Método estático público para obtener la instancia
    public static DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    // Método de ejemplo de la clase
    public void executeQuery(String query) {
        System.out.println("Ejecutando en " + connectionString + ": " + query);
    }
}