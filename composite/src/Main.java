//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Compuesto compuesto1 = new Compuesto();
        Compuesto compuesto2 = new Compuesto();
        Compuesto compuesto3 = new Compuesto();
        Hoja hoja1 = new Hoja("Hoja 1");
        Hoja hoja2 = new Hoja("Hoja 2");
        Hoja hoja3 = new Hoja("Hoja 3");
        Hoja hoja4 = new Hoja("Hoja 4");

        compuesto1.agregar(hoja1);
        compuesto1.agregar(hoja2);
        compuesto2.agregar(hoja3);
        compuesto3.agregar(hoja4);
        compuesto2.agregar(compuesto3);

        Compuesto compuestoPrincipal = new Compuesto();
        compuestoPrincipal.agregar(compuesto1);
        compuestoPrincipal.agregar(compuesto2);

        compuestoPrincipal.operacion();


    }
}