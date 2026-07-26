import java.util.Scanner;
import java.util.ArrayList;


public class MyProgram{
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      int testCases = Integer.parseInt(input.nextLine());

      for (int i= 0; i< testCases; i++) {
          
          int a1 = input.nextInt();
          double aVal = a1/100.00;
          int numWords = input.nextInt() + 1;
          double[] arr = new double[26];
          String[] arr2= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
          
          arr[0] = aVal;
        double temp = aVal;
        
          for(int x = 1; x < arr.length; x++){
              if(temp > .26){
                  temp = .01;
                  arr[x] = temp;
              }
              else{
              temp += .01;
              arr[x] = temp;
              }
              
          }
        //   for(int v = 0; v < arr.length; v++){
        //       System.out.print(arr[v]);
        //   }
         ArrayList<String> arrList = new ArrayList<String>();

         for(int z = 0; z < numWords; z++){
              String tempWord = input.nextLine();
              double total = 0.00;
              for(int g = 0; g < tempWord.length(); g++){
                  
                  for(int u = 0; u < arr2.length; u++){
                      if(arr2[u].equals(tempWord.substring(g, g+1))){
                          //System.out.println(arr[u]);
                          total += arr[u];
                          break;
                      }
                  }
              }
              //System.out.println(total);
              if((total > .9999999999999999) && (total < 1.000000000000001)){
                  arrList.add("WINNER " + a1 + ": " + tempWord);
              }
              total = 0.00;
              
          }
          for(int p = 0; p < arrList.size(); p++){
              System.out.println(arrList.get(p));
          }
          
          
          
          
          
          
          
          
          
          
      }
    }
  }
}