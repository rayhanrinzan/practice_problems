import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String num = input.next();
          String type = input.next();
          if(type.equals("PARENTHESES")){
              String ans = "(" + num.substring(0,3) + ") " + num.substring(3,6) + "-" + num.substring(6);
              System.out.println(ans);
          }
          else if(type.equals("DASHES")){
              String ans = num.substring(0,3) + "-" + num.substring(3,6) + "-" + num.substring(6);
            System.out.println(ans);
          }
          else if(type.equals("PERIODS")){
              String ans = num.substring(0,3) + "." + num.substring(3,6) + "." + num.substring(6);
            System.out.println(ans);
          }
          
          
      }
      }
    }
}