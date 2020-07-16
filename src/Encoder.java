import java.util.Scanner;

public class Encoder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String message = s.nextLine();
        String code = "";
        for (char c : message.toCharArray()) {
            code += (char) (c + 13);
        }
        System.out.println(code);
    }
}