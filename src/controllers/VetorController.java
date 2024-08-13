package controllers;

public class VetorController {
    public VetorController() {
        super();
    }

    public int[] inverteVetor(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inverteVetor(vetor, inicio + 1, fim - 1);
        }

        return vetor;
    }
}
