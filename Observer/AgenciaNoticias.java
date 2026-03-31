import java.util.ArrayList;
import java.util.List;

public class AgenciaNoticias {
    private List<Observador> suscriptores = new ArrayList<>();
    private String ultimaNoticia;

    public void suscribir(Observador obs) {
        suscriptores.add(obs);
    }

    public void desuscribir(Observador obs) {
        suscriptores.remove(obs);
    }

    public void setNoticia(String noticia) {
        this.ultimaNoticia = noticia;
        notificarATodos();
    }

    private void notificarATodos() {
        for (Observador s : suscriptores) {
            s.actualizar(ultimaNoticia);
        }
    }
}