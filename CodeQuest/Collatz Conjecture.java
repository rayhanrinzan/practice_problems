import java.util.Scanner;

public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      int testCases = Integer.parseInt(input.nextLine());//5
     
      int count;

      for (int i= 0; i< testCases; i++) {
       
//Scans next int
int num = input.nextInt(); //12
int numBU = num;

count = 1;

        while(num != 1){
           
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = (num*3) + 1;
            }
           
            count++;
        }
        System.out.println(numBU + ":" + count);
       

//Scans next line
input.nextLine();
       

      }
    }
  }
}