import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int tLegs = input.nextInt() * 2;
          int dLegs = input.nextInt() * 4;
          int hLegs = input.nextInt() * 4;
          int total = 0;
          total += (tLegs + dLegs + hLegs);
          System.out.println(total);
      }
      }
    }
}