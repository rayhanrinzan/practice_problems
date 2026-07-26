import java.util.Scanner;
public class MyProgram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int c = 0; c < testCases; c++) {
                int l = input.nextInt();
                int w = input.nextInt();
                input.nextLine();
                String line = input.nextLine();
                if (line.length() > l * w) {
                    System.out.println("WILL NOT FIT");
                    continue;
                } else {
                    String[] words = line.split(" ");
                    int count = 0;
                    for (int i = 0; i < words.length; i++) {
                        if (count + words[i].length() <= l) {
                            if (count > 0) {
                                System.out.print(" ");
                                count++;
                            }
                            System.out.print(words[i]);
                            count += words[i].length();
                        } else {
                            System.out.println();
                            count = words[i].length();
                            System.out.print(words[i]);
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}