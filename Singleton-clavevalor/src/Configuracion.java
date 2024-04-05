import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class Configuracion {
    private List<Observer> observadores = new ArrayList<>();

    private HashMap info= new HashMap<String,Integer>();
    public static Configuracion config;
    private Configuracion(){}

    public static Configuracion obtenerInstancia(){
        if(config == null){
            config= new Configuracion();
        }
        return config;
    }

    public void agregarInfo(String clave, Integer valor){
        info.put(clave, valor);
    }

    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            String msg = "" + info;
            observador.actualizar(msg);
        }
    }
}
