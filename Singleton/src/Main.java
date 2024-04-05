public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.obtenerInstancia();
        Singleton singleton2 = Singleton.obtenerInstancia();

        if (singleton1 == singleton2) {
            System.out.println("Ambos objetos son la misma instancia de Singleton.");
        } else {
            System.out.println("Error: Se han creado múltiples instancias de Singleton.");
        }

        singleton1.saludar();
    }
}
