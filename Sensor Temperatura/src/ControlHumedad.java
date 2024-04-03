public class ControlHumedad implements Observador{
    private int valor;
    public ControlHumedad(int valor) {
        this.valor = valor;
    }
    public void actualizar(int temperatura) {
        if(temperatura > valor){
            System.out.println(" La temperatura es mayor que el valor asignado");
        }
    }
}
