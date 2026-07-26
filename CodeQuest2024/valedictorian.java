import java.util.*;
import java.lang.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
          String school = input.nextLine();
          int num  = input.nextInt();
          input.nextLine();
          HashMap<String, Integer> hoursList = new HashMap<String, Integer>();
          HashMap<Double, String> candidates = new HashMap<Double, String>();
          ArrayList<Double> gpas = new ArrayList<Double>();          
          for(int i = 0; i < num; i++){
          String str = input.nextLine();
          String name = str.substring(0, str.indexOf(":"));
          String[] arr = str.substring(str.indexOf(":") + 1).split(",");
          int points = 0;
          int hours = 0;
          HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
          phonebook.put("A", 4);
          phonebook.put("B", 3);
          phonebook.put("C", 2);
          phonebook.put("D", 1);
          for(int x = 0; x < arr.length; x++){
              points += (phonebook.get(arr[x].substring(0,1))*Integer.valueOf(arr[x].substring(1,2)));
              hours += Integer.valueOf(arr[x].substring(1,2));
          }
          double gpa = (1.0)*(points)/hours;
          if((candidates.containsKey(gpa)))
          {
              if(hoursList.get(candidates.get(gpa)) > hours){
              }
              else {
                    candidates.put(gpa, name);
                     hoursList.put(name, hours);
                      }
                }
         else{
            candidates.put(gpa, name);
            hoursList.put(name, hours);
         }
          gpas.add(gpa);
          }
          ArrayList<Double> highestList = new ArrayList<Double>();
          double highest = gpas.get(0);
          for(int b=1; b<gpas.size(); b++){
              if(gpas.get(b) > highest){
                  highest = gpas.get(b);
              }
          }
          System.out.println(school + " = " + candidates.get(highest));
      }
      }
    }
}