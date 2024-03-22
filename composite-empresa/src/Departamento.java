import java.util.ArrayList;
import java.util.List;
public class Departamento implements Complemento {
    private List<Complemento> hijos = new ArrayList<>();

    public void agregar(Complemento complemento) {
        hijos.add(complemento);
    }

    public void eliminar(Complemento complemento) {
        hijos.remove(complemento);
    }

    public void operacion() {
        for (Complemento complemento : hijos) {
            complemento.operacion();
        }
    }
}
