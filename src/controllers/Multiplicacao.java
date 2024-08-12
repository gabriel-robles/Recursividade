package controllers;

public class Multiplicacao {
    public Multiplicacao() {
        super();
    }

    public int multiplica(int a, int b) {
        if (b > 1) {
            b -= 1;

            return a + multiplica(a, b);
        } else if (b == 0) {
            return 0;
        }

        return a;
    }
}