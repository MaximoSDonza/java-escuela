public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton obtenerInstancia() {
        if (instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }

    public void saludar() {
        System.out.println("¡Hola! Soy una instancia única de Singleton.");
    }
}
