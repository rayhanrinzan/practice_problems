import java.util.Scanner;

public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      int testCases = Integer.parseInt(input.nextLine());

      for (int i= 0; i< testCases; i++) {
        
		//Scans next int
		String line = input.nextLine();
		double v = Double.parseDouble(line.substring(0, line.indexOf(":")));
		double x = Double.parseDouble(line.substring(line.indexOf(":")+1));
		
		if(x == 0){
		    System.out.println("SWERVE");
		}
		else if(v == 0){
		    System.out.println("SAFE");
		}
		else if((x/v) <= 1){
		    System.out.println("SWERVE");
		}
		else if((x/v) <= 5){
		    System.out.println("BRAKE");
		}
		else{
		    System.out.println("SAFE");
		}



		//Scans next line


      }
    }
  }
}