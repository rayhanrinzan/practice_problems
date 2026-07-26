import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int x= 0; x< testCases; x++) {
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++){
            String line = input.nextLine();
            String[] arr = line.split(" ");
            if(arr[1].equals("C")){
                double c = Double.valueOf(arr[0]);
                c = (c*9/5) + 32;
                System.out.print(line + " = ");
                System.out.printf("%.1f", c);
                System.out.print(" F");
                System.out.println();
                
            }
            else{
                double f = Double.valueOf(arr[0]);
                f-= 32;
                f= f*5/9;
                System.out.print(line + " = ");
                System.out.printf("%.1f", f);
                System.out.print(" C");
                System.out.println();
                
                
                
            }
        }

          
          
      }
      }
    }
}