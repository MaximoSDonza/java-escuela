public class Main {
    public static void main(String[] args) {

        Pedido paquete = new Pedido();
        paquete.devuelto();

        paquete.setEstado(new Confirmacion());
        paquete.confirmacion();


        paquete.preparacion();
        paquete.setEstado(new Preparacion());
        paquete.preparacion();

        paquete.enviado();
        paquete.setEstado(new Enviado());
        paquete.enviado();

        paquete.devuelto();
        paquete.setEstado(new Devuelto());
        paquete.devuelto();
    }
}