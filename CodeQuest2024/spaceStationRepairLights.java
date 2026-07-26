import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        String[] arr = input.nextLine().split(" ");
        int sum = 0; 
        if(arr[0].equals("BROKEN")){
            sum+= 8;
        }
        if(arr[1].equals("BROKEN")){
            sum+= 4;
        }
        if(arr[2].equals("BROKEN")){
            sum+= 2;
        }
        if(arr[3].equals("BROKEN")){
            sum+= 1;
        }  
        int light1 = sum/4;
        int light2 = sum%4;
        if(light1 == 0) System.out.print("off ");
        else if(light1 == 1) System.out.print("red ");
        else if(light1 == 2) System.out.print("green ");
        else if(light1 == 3) System.out.print("blue ");
        if(light2 == 0) System.out.println("off");
        else if(light2 == 1) System.out.println("red");
        else if(light2 == 2) System.out.println("green");
        else if(light2 == 3) System.out.println("blue");
          
      }
      }
    }
}