package views;

import controllers.VetorController;

public class App {
    public static void main(String[] args) throws Exception {
        var vet = new VetorController();

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int[] valor = vet.inverteVetor(vetor, 0, 10);
        
        for (int i : valor) {
            System.out.println(i);
        }
    }
}
