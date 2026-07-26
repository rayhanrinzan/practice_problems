import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int n = input.nextInt();
          for(int i = 0; i < n; i++){
             for(int x = 0; x < n; x++){
              if(x == (n-1)) System.out.print("#");
              else System.out.print("# ");
             // System.out.print("# ");
             }
             if(i != (n-1)) System.out.println();
             else System.out.println();
          }
          
          
          
      }
      }
    }
}