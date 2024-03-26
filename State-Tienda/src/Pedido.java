public class Pedido {
    private Estado estadoActual;

    public Pedido() {
        estadoActual = new Confirmacion();
    }

    public void setEstado(Estado estado) {
        estadoActual = estado;
    }

    public void preparacion() {
        estadoActual.preparacion();
    }

    public void confirmacion() {
        estadoActual.confirmacion();
    }

    public void enviado() {
        estadoActual.enviado();
    }

    public void devuelto(){
        estadoActual.devuelto();
    }
}
