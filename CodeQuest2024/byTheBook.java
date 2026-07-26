import java.util.*;
public class MyProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = Integer.parseInt(input.nextLine());
        for (int i = 0; i < testCases; i++) {
            String isbn = input.nextLine();
            if (isbn.length() != 10) {
                System.out.println("INVALID");
            } 
            else {
                int sum = 0;
                boolean valid = true;

                for (int j = 0; j < 10; j++) {
                    char ch = isbn.charAt(j);

                    if (ch == 'X') {
                        sum += 10 * (10 - j);
                    } else if (Character.isDigit(ch)) {
                        int digit = Integer.valueOf(String.valueOf(ch));
                        sum += digit * (10 - j);
                    } else {
                        valid = false;
                        break;
                    }
                }

                if (valid && sum % 11 == 0) {
                    System.out.println("VALID");
                } else {
                    System.out.println("INVALID");
                }
            }
        }

    }
}