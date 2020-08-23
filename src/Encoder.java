import java.util.Scanner;

public class Encoder {

    private static final double version = 0.2;

    public static void main(String[] args) {

        System.out.println("ROT-13 Encoder v" + version);

        StringBuilder code = new StringBuilder();
        String message;

        if (args.length > 0) {
            message = String.join(" ", args);
            System.out.println("Text from command line: " + message);
        } else {
            System.out.print("Enter plain text: ");
            Scanner s = new Scanner(System.in);
            message = s.nextLine();
        }

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