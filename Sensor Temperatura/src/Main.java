public class Main {
    public static void main(String[] args) {

        Termostato termostato = new Termostato();

        // Crear usuarios
        Usuario usuario1 = new Usuario("Usuario 1");
        ControlHumedad controlHumedad = new ControlHumedad(13);
        ControlTemperatura controlTemperatura = new ControlTemperatura(13);

        // Agregar usuarios al notificador
        termostato.agregarObservador(usuario1);
        termostato.agregarObservador(controlTemperatura);
        termostato.agregarObservador(controlHumedad);

        // Enviar notificaciones
        termostato.notificarObservadores(10);
        termostato.notificarObservadores(20);
        termostato.notificarObservadores(32);
    }
}