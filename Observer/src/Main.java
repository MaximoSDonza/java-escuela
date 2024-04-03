public class Main {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        // Crear usuarios
        Usuario usuario1 = new Usuario("Usuario 1");
        Usuario usuario2 = new Usuario("Usuario 2");

        // Agregar usuarios al notificador
        notificador.agregarObservador(usuario1);
        notificador.agregarObservador(usuario2);

        // Enviar notificaciones
        notificador.notificarObservadores("¡Nueva promoción disponible!");
        notificador.notificarObservadores("Recordatorio: Reunión a las 3 PM");
    }
}