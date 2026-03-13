public class Main {
    public static void main(String[] args) {
        Logistica miLogistica;

        // Variable de decisión basada en la configuración o contexto
        boolean esMaritimo = true; 
        
        // Se verifica la entrega
        if (esMaritimo) {
            miLogistica = new LogisticaMaritima();
        } else {
            miLogistica = new LogisticaTerrestre();
        }

        // El cliente usa la logística sin saber si es barco o camión
        miLogistica.planificarEntrega();
    }
}
//El cliente decide qué tipo de logística usar, 
//pero el resto del sistema trata a todos los transportes por igual.