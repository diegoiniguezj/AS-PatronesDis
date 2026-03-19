// --- PUNTO DE ENTRADA ---

public class RegistroSeguros {
    public static void main(String[] args) {
        // Escenario 1: Cliente con domicilio en Jalisco
        System.out.println("=== PROCESANDO ALTA: SUCURSAL GUADALAJARA ===");
        SucursalSegurosFactory fabricaJal = new SucursalJaliscoFactory();
        SistemaAltaClientes registroJal = new SistemaAltaClientes(fabricaJal);
        registroJal.registrarNuevoCliente("Juan Pérez");

        // Escenario 2: Cliente con domicilio en Texas
        System.out.println("=== PROCESANDO ALTA: SUCURSAL AUSTIN ===");
        SucursalSegurosFactory fabricaTex = new SucursalTexasFactory();
        SistemaAltaClientes registroTex = new SistemaAltaClientes(fabricaTex);
        registroTex.registrarNuevoCliente("John Doe");
    }
}