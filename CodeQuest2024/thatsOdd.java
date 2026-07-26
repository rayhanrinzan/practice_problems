import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int n = input.nextInt();
          if(n % 2 == 0) System.out.println("EVEN");
          else System.out.println("ODD");
      }
      }
    }
}