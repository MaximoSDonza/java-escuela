public class ReproductorMusica {
    private EstadoReproductor EstadoReproductor;

    public ReproductorMusica() {
        EstadoReproductor = new Detenido();
    }

    public void setEstado(EstadoReproductor estado) {
        EstadoReproductor = estado;
    }

    public void reproducir() {
        EstadoReproductor.reproducir();
    }

    public void pausar() {
        EstadoReproductor.pausar();
    }

    public void detener() {
        EstadoReproductor.detener();
    }
}
