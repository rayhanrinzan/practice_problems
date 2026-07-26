import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String line = input.nextLine();
          String[] words = line.split(" ");
          for(int i = 0; i < words.length; i++){
              if(words[i].equals("Nimo")){
                  System.out.println(i+1);
              }
          }
          
          
          
      }
      }
    }
}