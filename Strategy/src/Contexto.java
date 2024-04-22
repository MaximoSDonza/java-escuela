public class Contexto {
    private Estrategia estrategia;

    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public int ejecutarEstrategia(int num1, int num2) {
        return estrategia.ejecutarOperacion(num1, num2);
    }
}

