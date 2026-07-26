import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int num = input.nextInt();
          int s = (int)Math.sqrt(5*num*num+4);
          int s2 = (int)Math.sqrt(5*num*num-4);
          if((s*s == (5*num*num+4))|| (s2*s2 == (5*num*num-4))){
              System.out.println("TRUE");
          
          }
          else System.out.println("FALSE");
          
          
      }
      }
    }
}