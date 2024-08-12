package views;

import controllers.Multiplicacao;

public class App {
    public static void main(String[] args) throws Exception {
        var mult = new Multiplicacao();

        var valor = mult.multiplica(3, 30);

        System.out.println(valor);
    }
}
