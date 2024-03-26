public class Preparacion implements Estado{
    public void confirmacion() {
        System.out.println("El Pedido ya fue confirmado.");
    }

    public void preparacion() {
        System.out.println("El pedido esta siendo preparado");
    }

    public void enviado() {
        System.out.println("El pedido todavia no esta preparado");
    }

    public void devuelto() {
        System.out.println("El pedido no llego como para reembolsarlo");
    }
}
