class CanalTV implements Observador {
    @Override
    public void actualizar(String noticia) {
        System.out.println("[TV] Transmitiendo noticia de última hora: " + noticia);
    }
}

class AppMovil implements Observador {
    @Override
    public void actualizar(String noticia) {
        System.out.println("[App] Notificación Push: " + noticia);
    }
}