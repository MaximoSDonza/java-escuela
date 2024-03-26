public class Detenido implements EstadoReproductor{
    public void reproducir() {
        System.out.println("Iniciando la reproducción de la canción.");
    }

    public void pausar() {
        System.out.println("El reproductor no está reproduciendo ninguna canción.");
    }

    public void detener() {
        System.out.println("El reproductor ya se encuentra detenido.");
    }
}
