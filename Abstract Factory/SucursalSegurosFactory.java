/**
 * * Caso: Registro de Clientes por Sucursal (Jalisco vs Texas).
 * * Justificación del Patrón:
 * Se utiliza Abstract Factory para asegurar que los planes y pólizas sean 
 * consistentes con la región del cliente. Cada sucursal tiene reglas de 
 * costos y coberturas distintas que no deben mezclarse.
 */


// Definen los tipos de servicios que ofrece cualquier sucursal.
interface PlanSalud {
    void mostrarCobertura();
    double calcularCosto();
}

interface PolizaVida {
    void definirBeneficiarios();
    String obtenerTerminosLegales();
}

// --- PRODUCTOS CONCRETOS: SUCURSAL JALISCO ---
class PlanSaludJalisco implements PlanSalud {
    @Override
    public void mostrarCobertura() {
        System.out.println("[Jalisco] Cobertura: Red de hospitales privados y atención primaria.");
    }
    @Override
    public double calcularCosto() {
        return 1500.00; // Pesos Mexicanos
    }
}

class PolizaVidaJalisco implements PolizaVida {
    @Override
    public void definirBeneficiarios() {
        System.out.println("[Jalisco] Registro de beneficiarios bajo leyes mexicanas.");
    }
    @Override
    public String obtenerTerminosLegales() {
        return "Términos conforme a la legislación de seguros en México.";
    }
}

// --- PRODUCTOS CONCRETOS: SUCURSAL TEXAS ---

class PlanSaludTexas implements PlanSalud {
    @Override
    public void mostrarCobertura() {
        System.out.println("[Texas] Cobertura: Red PPO nacional en EE.UU. y especialistas.");
    }
    @Override
    public double calcularCosto() {
        return 450.00; // Dólares Estadounidenses
    }
}

class PolizaVidaTexas implements PolizaVida {
    @Override
    public void definirBeneficiarios() {
        System.out.println("[Texas] Registro de beneficiarios con cláusulas de herencia de Texas.");
    }
    @Override
    public String obtenerTerminosLegales() {
        return "Terms according to Texas Department of Insurance regulations.";
    }
}

// INTERFAZ DE LA SUCURSAL
interface SucursalSegurosFactory {
    PlanSalud crearPlanSalud();
    PolizaVida crearPolizaVida();
}

// Definimos Sucursales Específicas
class SucursalJaliscoFactory implements SucursalSegurosFactory {
    @Override
    public PlanSalud crearPlanSalud() {
        return new PlanSaludJalisco();
    }
    @Override
    public PolizaVida crearPolizaVida() {
        return new PolizaVidaJalisco();
    }
}

class SucursalTexasFactory implements SucursalSegurosFactory {
    @Override
    public PlanSalud crearPlanSalud() {
        return new PlanSaludTexas();
    }
    @Override
    public PolizaVida crearPolizaVida() {
        return new PolizaVidaTexas();
    }
}

// Sistema de Alta de Clientes

class SistemaAltaClientes {
    private PlanSalud plan;
    private PolizaVida poliza;

    public SistemaAltaClientes(SucursalSegurosFactory sucursal) {
        // El sistema no sabe de qué sucursal es el cliente, solo recibe la fábrica correcta
        this.plan = sucursal.crearPlanSalud();
        this.poliza = sucursal.crearPolizaVida();
    }

    public void registrarNuevoCliente(String nombre) {
        System.out.println("Registrando cliente: " + nombre);
        plan.mostrarCobertura();
        System.out.println("Costo mensual: " + plan.calcularCosto());
        poliza.definirBeneficiarios();
        System.out.println("Estado legal: " + poliza.obtenerTerminosLegales());
        System.out.println("Alta completada exitosamente.\n");
    }
}