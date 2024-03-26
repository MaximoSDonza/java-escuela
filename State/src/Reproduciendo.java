public class Reproduciendo implements EstadoReproductor{
    public void reproducir() {
        System.out.println("El reproductor ya se encuentra reproduciendo una canción.");
    }

    public void pausar() {
        System.out.println("Pausando la reproducción de la canción.");
    }

    public void detener() {
        System.out.println("Deteniendo la reproducción de la canción.");
    }
}
