public class Usuario implements Observer{
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String mensaje) {
        System.out.println(nombre + ": Se ha recibido el mensaje -> " + mensaje);
    }
}
