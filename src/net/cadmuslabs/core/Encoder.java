package net.cadmuslabs.core;

public class Encoder {

    private static final double version = 1.0;

    public static String Encode(String message) {
        StringBuilder code = new StringBuilder();

        for (char c : message.toCharArray()) {

            // if alphabet and uppercase...
            if (c > 64 && c < 91) {
                c += 13;
                if (c > 90) c -= 26;
            }

            // if alphabet and lowercase...
            if (c > 96 && c < 123) {
                c += 13;
                if (c > 122) c -= 26;
            }

            code.append(c);
        }

        return code.toString();
    }
}