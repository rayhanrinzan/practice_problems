import java.util.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          int dNum = input.nextInt();
          int wNum = input.nextInt();
          String[] dicArr = new String[dNum];
          String temp;
          input.nextLine();
          for(int i = 0; i < dicArr.length; i++){
              temp = input.nextLine();
              dicArr[i] = temp;
          }
          String closest = "";
          ArrayList<String> testList = new ArrayList<String>();
          for(int i = 0; i < wNum; i++){
              temp = input.nextLine();
              for(int x = 0; x < dicArr.length; x++){
                  if(dicArr[x].length() == temp.length()){
                      testList.add(dicArr[x]);
                  }
              }
              int count = 0;
              int count2 = 0;
              for(int s = 0; s < testList.size(); s++){
                    for(int g = 0; g < temp.length(); g++){
                        if(!(temp.substring(g,g+1).equals(testList.get(s).substring(g, g+1)))){
                            count++;
                         }
                    }
                    if(s == 0 || count < count2){
                        closest = testList.get(s);
                        count2 = count;
                        count = 0;
                    }
                    
            }
            testList.clear();
            System.out.println(closest);
          }
          
          
          
      }
      }
    }
}