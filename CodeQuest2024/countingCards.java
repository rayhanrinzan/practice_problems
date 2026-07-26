import java.util.*;
import java.lang.*;
import java.text.*;
public class MyProgram{
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      int testCases = Integer.parseInt(input.nextLine());
      for (int c= 0; c< testCases; c++) {
        String line1 = input.nextLine();
        String line2 = input.nextLine();
        String[] playerArr = line1.split(" ");
        String[] dealerArr = line2.split(" ");
        int playerSum = 0;
        int playerAces = 0;
        int dealerSum = 0;
        int dealerAces = 0;
        for(int i = 0; i < playerArr.length; i++){
            String temp = playerArr[i].substring(0, playerArr[i].indexOf("_"));
            if(temp.equals("ACE")){
                playerAces++;
            }
            else if(temp.equals("KING") || temp.equals("QUEEN") || temp.equals("JACK")){
                playerSum += 10;
            }
            else{
                playerSum += Integer.valueOf(temp);
            }
        }
        for(int i = 0; i < dealerArr.length; i++){
            String temp = dealerArr[i].substring(0, dealerArr[i].indexOf("_"));
            if(temp.equals("ACE")){
                dealerAces++;
            }
            else if(temp.equals("KING") || temp.equals("QUEEN") || temp.equals("JACK")){
                dealerSum += 10;
            }
            else{
                dealerSum += Integer.valueOf(temp);
            }
        }
        //2 for loops determining if adding aces will bust or not,
        //and adding aces to score appropriately(if it will bust, 1)
        for(int i = 0; i < playerAces; i++){
            if(playerSum + 11 > 21){
                playerSum += 1;
            }
            else{
                playerSum += 11;
            }
        }
        for(int i = 0; i < dealerAces; i++){
            if(dealerSum + 11 > 21){
                dealerSum += 1;
            }
            else{
                dealerSum += 11;
            }
        }
        //then logic to see who wins  
        if((dealerSum == playerSum) || (dealerSum > 21 && playerSum > 21)){
            System.out.println("Player Score: " + playerSum + " Dealer Score: " + dealerSum +  " Tie!");
            continue;
        }
        if(dealerSum > 21){
            System.out.println("Player Score: " + playerSum + " Dealer Score: " + dealerSum +  " Player Wins!");
        }
        else if(playerSum > 21){
            System.out.println("Player Score: " + playerSum + " Dealer Score: " + dealerSum +  " Dealer Wins!");
        }
        else{
            if((21 - dealerSum) > (21 - playerSum)){
                System.out.println("Player Score: " + playerSum + " Dealer Score: " + dealerSum +  " Player Wins!");
            }
            else{
                System.out.println("Player Score: " + playerSum + " Dealer Score: " + dealerSum +  " Dealer Wins!");
            }
        }
      }
      }
    }
}