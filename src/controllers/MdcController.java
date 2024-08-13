package controllers;

public class MdcController {
    public MdcController() {
        super();
    }

    public int calculaMdc(int x, int y) {
        if (x > y) {
            return calculaMdc( x - y, y);
        } else if (x == y) {
            return x;
        }

        return calculaMdc(y, x);

    }
}
