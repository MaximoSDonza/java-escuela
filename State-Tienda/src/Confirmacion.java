public class Confirmacion implements Estado{
    public void confirmacion() {
        System.out.println("El Pedido ya se encuentra en confirmacion.");
    }

    public void preparacion() {
        System.out.println("El pedido todavia no fue confirmado");
    }

    public void enviado() {
        System.out.println("El pedido todavia no fue preparado");
    }

    public void devuelto() {
        System.out.println("El pedido todavia no fue enviado como para reembolsarlo");
    }
}
