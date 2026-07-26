import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String pass = input.nextLine();
          boolean ans = true;
          if(pass.length() < 8) ans = false;
          int count = 0;
          int countLower = 0;
          int countUpper = 0;
          int countDigit = 0;
          int countNon = 0;
          for(int i = 0; i < pass.length(); i++){
              if(Character.isLowerCase(pass.charAt(i))){
                  countLower++;
              }
              else if(Character.isUpperCase(pass.charAt(i))){
                  countUpper++;
              }
              else if(Character.isDigit(pass.charAt(i))){
                  countDigit++;
              }
              else{
                  countNon++;
              }
          }
          if(countLower > 0){
              count++;
          }
          if(countUpper > 0){
              count++;
          }
          if(countDigit > 0){
              count++;
          }
          if(countNon > 0){
              count++;
          }
          if(count < 3){
              //System.out.println(count);
              ans = false;
          }
          for(int i  = 0; i < pass.length()-2; i++){
              String one = pass.substring(i, i+1);
              String two = pass.substring(i+1, i+2);
              String three = pass.substring(i+2, i+3);
              if(one.equals(two) && two.equals(three)){
                  //System.out.println(one);
                  //System.out.println(two);
                  ans = false;
              }
              
          }
          if(ans == false) System.out.println("INVALID");
          else System.out.println("VALID");
           
          
          
      }
      }
    }
}