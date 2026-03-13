public class Main {
    public static void main(String[] args) {
        // Creamos el usuario con sólo lo necesario
        Usuario user1 = new Usuario.UsuarioBuilder("Juan", "Pérez")
                            .conEdad(25)
                            .conTelefono("555-1234")
                            .build();

        // Creamos otro usuario con dirección pero sin teléfono
        Usuario user2 = new Usuario.UsuarioBuilder("Ana", "García")
                            .conDireccion("Calle Falsa 123")
                            .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}