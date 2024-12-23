package com.raz;

public class Perimeter {
    public static int perimeter(Object length, Object breadth) throws Exception {
        if (length == null || breadth == null) {
            throw new Exception("Undefined");
        }

        if (!(length instanceof Number)) {
            throw new Exception("Not a number");
        }

        if (!(breadth instanceof Number)) {
            throw new Exception("Not a number");
        }

        int len = ((Number) length).intValue();
        int brd = ((Number) breadth).intValue();

        if (len < 0 || brd < 0) {
            throw new Exception("Dimension cannot be negative");
        }

        return 2 * (len + brd);
    }
}
