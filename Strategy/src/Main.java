public class Main {
    public static void main(String[] args) {
        Contexto contextoSuma = new Contexto(new Suma());
        System.out.println("10 + 5 = " + contextoSuma.ejecutarEstrategia(10, 5));

        Contexto contextoResta = new Contexto(new Resta());
        System.out.println("10 - 5 = " + contextoResta.ejecutarEstrategia(10, 5));
    }

}