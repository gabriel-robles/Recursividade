package controllers;

public class FatorialController {
    public FatorialController() {
        super();
    }

    public int fatorialDuplo(int n) {
        if (n == 1) {
            return 1;
        }
        
        if (n % 2 != 0) {
            return n * fatorialDuplo(n - 1);
        }


        return fatorialDuplo(n - 1);
    }
}
