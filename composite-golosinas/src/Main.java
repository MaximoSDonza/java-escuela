public class Main {
    public static void main(String[] args) {
        Paquete paquete1 = new Paquete();
        Caramelo caramelo1= new Caramelo("palito de la selva");
        Chocolate chocolate1= new Chocolate("milka");
        Gomita gomita1 = new Gomita("Arcor");

        paquete1.agregar(caramelo1);
        paquete1.agregar(chocolate1);
        paquete1.agregar(gomita1);

        paquete1.operacion();
    }
}