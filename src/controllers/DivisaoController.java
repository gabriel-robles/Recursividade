package controllers;

public class DivisaoController {
    public DivisaoController() {
        super();
    }

    public int restoDivisao(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("O divisor não pode ser zero.");
        }

        if (dividendo < divisor) {
            return dividendo;
        }

        return restoDivisao(dividendo - divisor, divisor);
    }
}
