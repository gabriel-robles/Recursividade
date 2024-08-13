package views;

import controllers.MdcController;

public class App {
    public static void main(String[] args) throws Exception {
        var mdc = new MdcController();

        var valor = mdc.calculaMdc(24, 16);

        System.out.println(valor);
    }
}
