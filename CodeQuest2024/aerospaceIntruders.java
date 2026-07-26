import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        int num = Integer.parseInt(input.nextLine());
        //hashmaps and arraylist storing everything in relation to ship
        HashMap<String, String> types = new HashMap<String, String>();
        HashMap<String, Integer> xMap = new HashMap<String, Integer>();
        HashMap<String, Integer> yMap = new HashMap<String, Integer>();
        ArrayList<String> ships = new ArrayList<String>();
        
        for(int i = 0; i < num; i++){
            String line = input.nextLine();
            String name = line.substring(0, line.indexOf("_"));
            String type = line.substring(line.indexOf("_") + 1, line.indexOf("_") + 2);
            String[] coords = line.substring(line.indexOf(":") + 1).split(",");
            types.put(name, type);
            xMap.put(name, Integer.valueOf(coords[0]));
            yMap.put(name, Integer.valueOf(coords[1]));
            ships.add(name);
        }
        //!!!!!create bigger for loop that loops through SET size value of list to destroy all ships
        int n = ships.size();
        for(int z = 0; z < n; z++){
            //second for loop looping through ships and finding lowest, destroying it and finding next
            String lowest = ships.get(0);
            for(int i = 1; i < ships.size(); i++){
                String ship = ships.get(i);
                String type = types.get(ship);
                int x = xMap.get(ship);
                int y = yMap.get(ship);
                int xLowest = xMap.get(lowest);
                int yLowest = yMap.get(lowest);
                if(x < xLowest){
                    lowest = ship;
                }
                else if(x == xLowest){
                    if(y > yLowest){
                        lowest = ship;
                    }
                    else{
                        lowest = lowest;
                    }
                }
                else{
                    lowest = lowest;
                }
            }
            //print out destroyed ship and eliminate it from all data
            System.out.println("Destroyed Ship: " + lowest + " xLoc: " + xMap.get(lowest));
            ships.remove(ships.indexOf(lowest));
            types.remove(lowest);
            xMap.remove(lowest);
            yMap.remove(lowest);
            //loop through data lowering x values by class
            for(int i = 0; i < ships.size(); i++){
                String ship = ships.get(i);
                String type = types.get(ship);
                if(type.equals("A")){
                    xMap.put(ship, xMap.get(ship)-10);
                }
                else if(type.equals("B")){
                    xMap.put(ship, xMap.get(ship)-20);
                }
                else{
                    xMap.put(ship, xMap.get(ship)-30);
                }
            }
        }
      }
      }
    }
}