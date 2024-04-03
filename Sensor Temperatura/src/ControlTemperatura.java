public class ControlTemperatura implements Observador{
    private int valor;

    public ControlTemperatura(int valor) {
        this.valor = valor;
    }
    public void actualizar(int temperatura) {
        if(temperatura < valor){
            System.out.println(" La temperatura es menor que el valor asignado");
        }
    }
}
