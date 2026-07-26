import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int x= 0; x< testCases; x++) {
        String a = input.next();
        String b = input.next();
        input.nextLine();
        double cVal = Double.valueOf(a) + Double.valueOf(b)*Math.sqrt(-1);
        double zVal = 0; 
        int div = mandelbrot(0, zVal,cVal);
          
          
      }
      }
    }
    public static int mandelbrot(int n, double z, double c){
        double newZ =  Math.pow(z, 2) + c;
        if()
        
    }
}