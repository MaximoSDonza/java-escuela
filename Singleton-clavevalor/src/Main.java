public class Main {
    public static void main(String[] args) {

        Configuracion config1 = Configuracion.obtenerInstancia();
        Usuario user1 = new Usuario("Juan");
        Usuario user2 = new Usuario("Carlos");

        config1.agregarInfo("Nucleos",8);
        config1.agregarInfo("Hilos",16);
        config1.agregarInfo("Ram",16);
        config1.agregarInfo("Almacenamiento interno",1024);
        config1.agregarObservador(user1);
        config1.agregarObservador(user2);
        config1.notificarObservadores();

    }
}
