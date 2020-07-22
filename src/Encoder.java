import java.util.Scanner;

public class Encoder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String message = s.nextLine();
        String code = "";
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

            code += (char) c;
        }
        System.out.println(code);
    }
}