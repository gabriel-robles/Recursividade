package views;

import controllers.FatorialController;

public class App {
    public static void main(String[] args) throws Exception {
        var fat = new FatorialController();

        var valor = fat.fatorialDuplo(7);

        System.out.println(valor);
    }
}
