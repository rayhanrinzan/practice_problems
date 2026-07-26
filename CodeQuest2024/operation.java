import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int num = input.nextInt();
          int num2 = input.nextInt();
          int num3 = input.nextInt();
          if(num + num2 == num3) System.out.println("Addition");
          else if(num - num2 == num3) System.out.println("Subtraction");
          else if(num*num2 == num3) System.out.println("Multiplication");
          else if(num/num2 == num3) System.out.println("Division");
          else System.out.println("Modulo");
          
          
      }
      }
    }
}