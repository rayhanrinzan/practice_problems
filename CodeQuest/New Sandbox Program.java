

import java.util.Scanner;

public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {


		//Scans next line
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        if(word1.length() == word2.length()){
            if(word1.indexOf(word2)== 0){
                System.out.println("anagram");
            }
            else{
                System.out.println("not and anagram");
            }
        }
        System.out.println("not and anagram");
        
      }
    }
  }
}
}