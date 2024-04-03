public class Usuario implements Observador{
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(int temperatura) {
        if(temperatura>25){
            System.out.println(nombre + ": Hace calor");
        } else if (temperatura<15) {
            System.out.println(nombre + ": Hace frio");
        }else{
            System.out.println(nombre + ": Esta templado");
        }
    }
}
