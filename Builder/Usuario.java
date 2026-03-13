public class Usuario {
    // Atributos obligatorios
    private final String nombre;
    private final String apellido;
    
    // Atributos opcionales
    private final int edad;
    private final String telefono;
    private final String direccion;

    // El constructor es privado: solo el Builder puede usarlo
    private Usuario(UsuarioBuilder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.edad = builder.edad;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " " + apellido + " (Edad: " + edad + ")";
    }

    // CLASE BUILDER ANIDADA
    public static class UsuarioBuilder {
        private String nombre;
        private String apellido;
        private int edad = 0; // Valor por defecto
        private String telefono = ""; 
        private String direccion = "";

        public UsuarioBuilder(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public UsuarioBuilder conEdad(int edad) {
            this.edad = edad;
            return this; // Retornamos el builder para encadenar métodos
        }

        public UsuarioBuilder conTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public UsuarioBuilder conDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        // El método final que construye el objeto real
        public Usuario build() {
            return new Usuario(this);
        }
    }
}