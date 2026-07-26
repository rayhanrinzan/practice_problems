import java.util.Scanner;

public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      int testCases = Integer.parseInt(input.nextLine());

      for (int i= 0; i< testCases; i++) {
        
		//Scans next int
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(num1 + num2 + " " + num1*num2);




      }
    }
  }
}