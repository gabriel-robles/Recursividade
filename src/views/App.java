package views;

import controllers.DivisaoController;

public class App {
    public static void main(String[] args) throws Exception {
        var div = new DivisaoController();

        var valor = div.restoDivisao(239, 30);

        System.out.println(valor);
    }
}
