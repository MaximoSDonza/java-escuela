import java.util.ArrayList;
import java.util.List;
public class Compuesto implements Componente{
    private List<Componente> hijos = new ArrayList<>();

    public void agregar(Componente componente) {
        hijos.add(componente);
    }

    public void eliminar(Componente componente) {
        hijos.remove(componente);
    }

    public void operacion() {
        for (Componente componente : hijos) {
            componente.operacion();
        }
    }
}
