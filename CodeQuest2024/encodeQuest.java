import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        ArrayList<String> alphabet = new ArrayList<String>();
        for(char letter = 'A'; letter <= 'Z'; letter++){
            alphabet.add(String.valueOf(letter));
        }
        String str = input.nextLine();
        String key = input.nextLine();
        char[][] grid = new char[key.length()][26];
        for(int i = )
      }
      }
    }
}