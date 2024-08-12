package views;

import controllers.Divisao;

public class App {
    public static void main(String[] args) throws Exception {
        var div = new Divisao();

        var valor = div.restoDivisao(139, 30);

        System.out.println(valor);
    }
}
