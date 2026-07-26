import java.util.Scanner;

public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      int testCases = Integer.parseInt(input.nextLine());

      for (int i= 0; i< testCases; i++) {
        

		int turkNum = input.nextInt();
		int goatNum = input.nextInt();
		int horseNum = input.nextInt();
		int legNum = (turkNum*2) + (goatNum*4) + (horseNum*4);
		System.out.println(legNum);



	


      }
    }
  }
}