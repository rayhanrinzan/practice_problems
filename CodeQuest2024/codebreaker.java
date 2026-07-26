import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
       
       
        int num = Integer.parseInt(input.nextLine());
        String str = "";
        for(int i = 0; i< num; i++){
            str += input.nextLine();
        }
        str = str.replaceAll("[^a-zA-Z]", "");
        str = str.toLowerCase();
        //System.out.println(str);
        int[] letterCount = new int[26];
        for (int i = 0; i < str.length(); i++){
            char character = str.charAt(i);
            if (character >= 'a' && character <= 'z'){
             letterCount[character - 'a']++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.00%");

        for(int i = 0; i < letterCount.length; i++){
            if(i == 0){
                System.out.print("A: ");
            }
            if(i == 1){
                System.out.print("B: ");
            }
            if(i == 2){
                System.out.print("C: ");
            }
            if(i == 3){
                System.out.print("D: ");
            }
            if(i == 4){
                System.out.print("E: ");
            }
            if(i == 5){
                System.out.print("F: ");
            }
            if(i == 6){
                System.out.print("G: ");
            }
            if(i == 7){
                System.out.print("H: ");
            }
            if(i == 8){
                System.out.print("I: ");
            }
            if(i == 9){
                System.out.print("J: ");
            }
            if(i == 10){
                System.out.print("K: ");
            }
            if(i == 11){
                System.out.print("L: ");
            }
            if(i == 12){
                System.out.print("M: ");
            }
            if(i == 13){
                System.out.print("N: ");
            }
            if(i == 14){
                System.out.print("O: ");
            }
            if(i == 15){
                System.out.print("P: ");
            }
            if(i == 16){
                System.out.print("Q: ");
            }
            if(i == 17){
                System.out.print("R: ");
            }
            if(i == 18){
                System.out.print("S: ");
            }
            if(i == 19){
                System.out.print("T: ");
            }
            if(i == 20){
                System.out.print("U: ");
            }
            if(i == 21){
                System.out.print("V: ");
            }
            if(i == 22){
                System.out.print("W: ");
            }
            if(i == 23){
                System.out.print("X: ");
            }
            if(i == 24){
                System.out.print("Y: ");
            }
            if(i == 25){
                System.out.print("Z: ");
            }
            System.out.println(df.format(((1.0)*letterCount[i])/str.length()));
        }
      }
      }
    }
}