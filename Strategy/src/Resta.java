public class Resta implements Estrategia {
    @Override
    public int ejecutarOperacion(int num1, int num2) {
        return num1 - num2;
    }
}
