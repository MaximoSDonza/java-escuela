public class Hoja implements Componente{
    private String nombre;

    public Hoja(String nombre) {
        this.nombre = nombre;
    }

    public void operacion() {
        System.out.println("Realizando operación en la hoja " + nombre);
    }
}
