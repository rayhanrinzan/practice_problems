import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int num = Integer.parseInt(input.nextLine());
        HashMap<String, Integer> day = new HashMap<String, Integer>();
        HashMap<String, Integer> night = new HashMap<String, Integer>();
        ArrayList<String> events = new ArrayList<String>();
        for(int i = 0; i < num; i++){
            String line = input.nextLine();
            String[] arr = line.split(",");
            //check if arraylist contains event before adding new one
            if((events.contains(arr[3]) == false) && (arr[4].equals("true"))){
                events.add(arr[3]);
                //if day then add new 1 in day
                if(arr[2].equals("Day")){
                    day.put(arr[3], 1);
                }
                //if night then add new 1 in night
                if(arr[2].equals("Night")){
                    night.put(arr[3], 1);
                }
                
            }
            //else add new to day or night
            else if((events.contains(arr[3]) == true) && (arr[4].equals("true"))){
                if(arr[2].equals("Day")){
                    if(day.containsKey(arr[3]) == true){
                        day.put(arr[3], day.get(arr[3]) + 1);
                    }
                    else{
                        day.put(arr[3], 1);
                    }
                }
                if(arr[2].equals("Night")){
                    if(night.containsKey(arr[3]) == true){
                        night.put(arr[3], night.get(arr[3]) + 1);
                    }
                    else{
                        night.put(arr[3], 1);
                    }
                }
            }
            else{
                continue;
            }
        }
        Collections.sort(events);
        for(int i = 0; i < events.size(); i++){
            System.out.print(events.get(i));
           
            System.out.print(",");
           
            if(day.containsKey(events.get(i))){
                System.out.print(day.get(events.get(i)));
            }
            else{
                System.out.print("0");
            }
            
            System.out.print(",");
            
            if(night.containsKey(events.get(i))){
                System.out.print(night.get(events.get(i)));
            }
            else{
                System.out.print("0");
            }
            
            System.out.println();
            
        }
          
          
      }
      }
    }
}