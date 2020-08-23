import java.util.Scanner;

public class Encoder {

    private static final double version = 0.2;

    public static void main(String[] args) {

        System.out.println("ROT-13 Encoder v" + version);

        System.out.print("Enter plain text: ");
        Scanner s = new Scanner(System.in);
        String message = s.nextLine();

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
        System.out.println("Encoded text: " + code);
    }
}