import java.util.Scanner;
public class MyProgram{
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int i= 0; i< testCases; i++) {
          String wrong = input.next();
          String right = input.next();
          String one = wrong.substring(0,1); 
          String two = right.substring(0,1);
          String three = wrong.substring(wrong.length()-1);
          String four = right.substring(right.length()-1);
          boolean bookends = (one.equals(two) && three.equals(four));
          boolean similar = true;
          for(int z = 0; z < right.length(); z++){
              if(!(wrong.contains(right.substring(z,z+1)))) similar = false;
          }
          if(bookends && similar) System.out.println(right);
          else System.out.println(wrong);
          
      }
    }
  }
}