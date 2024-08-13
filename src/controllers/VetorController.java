package controllers;

public class VetorController {
    public VetorController() {
        super();
    }
 
    public int paresVetor(int[] vetor, int tamanho) {
        if (tamanho == 0) {
            return 0;
        }

        if (vetor[tamanho - 1] % 2 == 0) {
            return 1 + paresVetor(vetor, tamanho - 1);
        }

        return paresVetor(vetor, tamanho - 1);
    }
}
