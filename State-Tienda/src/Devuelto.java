public class Devuelto implements Estado {
    public void confirmacion() {
        System.out.println("El Pedido ya fue confirmado.");
    }

    public void preparacion() {
        System.out.println("El pedido ya fue preparado");
    }

    public void enviado() {
        System.out.println("El pedido ya fue enviado");
    }

    public void devuelto() {
        System.out.println("El pedido regresa a ser reembolsado");
    }
}
