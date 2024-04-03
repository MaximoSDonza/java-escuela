import java.util.ArrayList;
import java.util.List;
public class Termostato {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(int temperatura) {
        System.out.println("La temperatura actual es: "+ temperatura);
        for (Observador observador : observadores) {
            observador.actualizar(temperatura);
        }
    }
}
