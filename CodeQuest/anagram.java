//Code academy template
import java.util.Scanner;
import java.util.Arrays;
public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      int testCases = Integer.parseInt(input.nextLine());

      for (int i= 0; i< testCases; i++) {
		 //Scans next int. May or may not skip to the next line
    String str = input.nextLine();
    String str1 = str.substring(0, str.indexOf("|"));

    String str2 = str.substring(str.indexOf("|") + 1);

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str + " = ANAGRAM");
      }
      else {
        System.out.println(str + " = NOT AN ANAGRAM");
      }
    }
    else {
      System.out.println(str + " = NOT AN ANAGRAM");
    }

		}
		

      }
    }
  }