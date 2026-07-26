import java.util.Scanner;

public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      int testCases = Integer.parseInt(input.nextLine());

      for (int i= 0; i< testCases; i++) {
        

		//Scans next line
      String line = input.nextLine();
      int lineLength;
      int count = 0;
      for(lineLength = line.length(); lineLength >0; lineLength--){
          if(line.substring(lineLength - 1, lineLength).contains("a") || line.substring(lineLength - 1, lineLength).contains("e") || line.substring(lineLength - 1, lineLength).contains("i") || line.substring(lineLength - 1, lineLength).contains("o") || line.substring(lineLength - 1, lineLength).contains("u")) count++;
          
      }
      

      System.out.println(count);
      
      


      }
    }
  }
}