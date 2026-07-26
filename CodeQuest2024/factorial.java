import java.util.*;

public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int num = input.nextInt();
          if(num == 0){
              System.out.println(0);
          }
          else{
          long fac = 1;
          for(int i = 1; i <= num; i++){
              fac*=i;
          }
          System.out.println(fac);
          }
          
          
      }
      }
    }
}