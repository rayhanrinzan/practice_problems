import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        String line = input.nextLine();
        line = line.replaceAll("and", ",");
        String[] arr = line.split(",| |  | , |, | ,|   ");
        ArrayList<String> time = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("h")){
                String temp = arr[i].replaceAll("[a-zA-Z]", "");
                if(Integer.valueOf(temp) < 10){
                    temp = "0" + temp;
                }
                time.add(temp);
            }
        }
        if(time.size() == 0){
            time.add("00");
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("m")){
                String temp = arr[i].replaceAll("[a-zA-Z]", "");
                if(Integer.valueOf(temp) < 10){
                    temp = "0" + temp;
                }
                time.add(temp);
            }
        }
        if(time.size() == 1){
            time.add("00");
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("s")){
                String temp = arr[i].replaceAll("[a-zA-Z]", "");
                if(Integer.valueOf(temp) < 10){
                    temp = "0" + temp;
                }
                time.add(temp);
            }
        }
        if(time.size() == 2){
            time.add("00");
        }
        for(int i = 0; i < time.size(); i++){
            String temp = time.get(i);
            if(i != time.size()-1) System.out.print(temp + ":");
            else System.out.print(temp);
        }
        System.out.println();
          
      }
      }
    }
}