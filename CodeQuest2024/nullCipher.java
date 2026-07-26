import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          String str = "";
          for(int i = 0; i < line.length(); i++){
              if((line.substring(i, i+1).equals("a") || line.substring(i, i+1).equals("e") || line.substring(i, i+1).equals("i") || line.substring(i, i+1).equals("o") || line.substring(i, i+1).equals("u")) && (i != line.length()-1)){
              str += line.substring(i+1, i+2);
                 i++; 
              }
          }
          System.out.println(str);
      }
      }
    }
}