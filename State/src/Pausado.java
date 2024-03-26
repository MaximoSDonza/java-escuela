public class Pausado implements EstadoReproductor{
    public void reproducir() {
        System.out.println("Reanudando la reproducción de la canción.");
    }

    public void pausar() {
        System.out.println("El reproductor ya se encuentra en pausa.");
    }

    public void detener() {
        System.out.println("Deteniendo la reproducción de la canción.");
    }
}
