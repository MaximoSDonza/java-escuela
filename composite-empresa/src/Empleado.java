public class Empleado implements Complemento{
    private String nombre;
    private String cargo;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void operacion() {
        System.out.println("Realizando operación en el empleado " + nombre);
    }

}
