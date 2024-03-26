public class Main {
    public static void main(String[] args) {

        ReproductorMusica reproductor = new ReproductorMusica();

        // Cambiar al estado de reproducción y reproducir una canción
        reproductor.setEstado(new Reproduciendo());
        reproductor.reproducir();

        // Pausar la reproducción de la canción
        reproductor.pausar();

        // Cambiar al estado detenido y detener la reproducción
        reproductor.setEstado(new Detenido());
        reproductor.detener();
    }
}