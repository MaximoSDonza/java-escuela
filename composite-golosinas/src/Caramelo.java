public class Caramelo implements Complemento,Golosina{
    private String nombre;
    public Caramelo(String nombre) {
        this.nombre = nombre;
    }
    public void operacion() {
        System.out.println("Realizando operación en el caramelo " + nombre);
    }
}
