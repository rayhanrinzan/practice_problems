import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int CR = input.nextInt();
        int CG = input.nextInt();
        int CB = input.nextInt();
        
        int T = input.nextInt();
        
        int FR = input.nextInt();
        int FG = input.nextInt();
        int FB = input.nextInt();  
        
        int BR = input.nextInt();
        int BG = input.nextInt();
        int BB = input.nextInt();
        //distance to f and c
        //if thats greater than tolerance keep the same, else make it bg
        double distance = Math.sqrt(Math.pow((FR-CR),2)  + Math.pow((FG-CG),2) + Math.pow((FB-CB),2));
        if(distance > T){
            System.out.println(FR + " " + FG + " " +FB);
        }
        else{
            System.out.println(BR + " " + BG + " " + BB);
        }
      }
      }
    }
    
}