public class Gomita implements Complemento,Golosina{
    private String nombre;
    public Gomita(String nombre) {
        this.nombre = nombre;
    }
    public void operacion() {
        System.out.println("Realizando operación en la gomita " + nombre);
    }
}
