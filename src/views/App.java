package views;

import controllers.VetorController;;

public class App {
    public static void main(String[] args) throws Exception {
        var vet = new VetorController();

        int[] vetor = { 2, 7, 3, 10, 5};

        var valor = vet.paresVetor(vetor, 5);

        System.out.println(valor);
    }
}
