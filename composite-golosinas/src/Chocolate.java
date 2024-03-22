public class Chocolate implements Complemento,Golosina{
    private String nombre;
    public Chocolate(String nombre) {
        this.nombre = nombre;
    }
    public void operacion() {
        System.out.println("Realizando operación en el chocolate " + nombre);
    }
}
