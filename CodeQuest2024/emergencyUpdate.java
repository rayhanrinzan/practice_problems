import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int ogNum = input.nextInt();
        int newNum = input.nextInt();
        input.nextLine();
        HashMap<String, String> phone = new HashMap<String, String>();
        HashMap<String, String> address = new HashMap<String, String>();
        HashMap<String, String> newPhone = new HashMap<String, String>();
        HashMap<String, String> newAddress = new HashMap<String, String>();
        ArrayList<String> allPeople = new ArrayList<String>(); 
        ArrayList<String> oldPeople = new ArrayList<String>(); 
        ArrayList<String> newPeople = new ArrayList<String>(); 
        String line;
        String[] arr;
        for(int i = 0; i < ogNum; i++){
            line = input.nextLine();
            arr = line.split(",");
            phone.put(arr[0], arr[1]);
            address.put(arr[0], arr[2]);
            allPeople.add(arr[0]);
            oldPeople.add(arr[0]);
        }
        for(int i = 0; i < newNum; i++){
            line = input.nextLine();
            arr = line.split(",");
            newPhone.put(arr[0], arr[1]);
            newAddress.put(arr[0], arr[2]);
            if(!(allPeople.contains(arr[0]))){
                allPeople.add(arr[0]);
                newPeople.add(arr[0]);
            }
            else{
                newPeople.add(arr[0]);
            }
        }
        Collections.sort(allPeople);
        String temp;
        for(int i =0; i < allPeople.size(); i++){
            temp = allPeople.get(i);
            if(!(newPeople.contains(temp))){
                System.out.println(temp + " DELETED");
            }
            if(!(oldPeople.contains(temp))){
                System.out.println(temp + " CREATED");
            }
            if(newPeople.contains(temp) && oldPeople.contains(temp)){
                if(!(phone.get(temp).equals(newPhone.get(temp))) && !(address.get(temp).equals(newAddress.get(temp)))){
                System.out.println(temp + " UPDATED BOTH");    
                continue;
                }
                else{
                    if(!(phone.get(temp).equals(newPhone.get(temp)))){
                        System.out.println(temp + " UPDATED PHONE NUMBER");
                    }
                    if(!(address.get(temp).equals(newAddress.get(temp)))){
                        System.out.println(temp + " UPDATED ADDRESS");
                    }
                }
            }
        }
          
          
      }
      }
    }
}