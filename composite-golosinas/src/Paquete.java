import java.util.ArrayList;
import java.util.List;
public class Paquete implements Complemento,Golosina {
    private List<Golosina> hijos = new ArrayList<>();

    public void agregar(Golosina golosina) {
        hijos.add(golosina);
    }

    public void eliminar(Golosina golosina) {
        hijos.remove(golosina);
    }

    public void operacion() {
        for (Golosina gol : hijos) {
            gol.operacion();
        }
    }
}
