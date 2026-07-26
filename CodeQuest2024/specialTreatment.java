import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String text = input.nextLine();
          String line = "";
          for (int i = 0; i < text.length(); i++){
              char chr = text.charAt(i);
                if(chr == 32 || (chr >= 48 && chr <= 57) || (chr >= 65 && chr <= 90) || (chr >= 97 && chr <= 122)) {
                    line += chr;
                }

          }
          System.out.println(line);
          
          
      }
      }
    }
}