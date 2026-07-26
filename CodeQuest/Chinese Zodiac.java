import java.util.Scanner;

public class MyProgram{
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            int testCases = Integer.parseInt(input.nextLine());

                for (int i= 0; i< testCases; i++) {
                   
                    double num = input.nextDouble();
                    int numFinal = (int)num;
                    boolean yang = false;
                    if (num % 2 == 0) {
                        yang = true;
                    }
                   
                    double numA = num - 4;
                    double numB = numA % 10;
                    int numC = (int) (numB / 2);
                    String element = "";
                    if (numC == 0) {
                        element = "Wood";
                    }
                    else if (numC == 1) {
                        element = "Fire";
                    }
                    else if (numC == 2) {
                        element = "Earth";
                    }
                    else if (numC == 3) {
                        element = "Metal";
                    }
                    else if (numC == 4) {
                        element = "Water";
                    }
                   
                    double numD = numA % 12;
                    String animal = "";
                    //Rat, Ox, Tiger, Rabbit, Dragon, Snake, Horse, Goat, Monkey, Rooster, Dog, Pig
                    if (numD == 0) {
                        animal = "Rat";
                    }
                    else if (numD == 1) {
                        animal = "Ox";
                    }
                    else if (numD == 2) {
                        animal = "Tiger";
                    }
                    else if (numD == 3) {
                        animal = "Rabbit";
                    }
                    else if (numD == 4) {
                        animal = "Dragon";
                    }
                    else if (numD == 5) {
                        animal = "Snake";
                    }
                    else if (numD == 6) {
                        animal = "Horse";
                    }
                    else if (numD == 7) {
                        animal = "Goat";
                    }
                    else if (numD == 8) {
                        animal = "Monkey";
                    }
                    else if (numD == 9) {
                        animal = "Rooster";
                    }
                    else if (numD == 10) {
                        animal = "Dog";
                    }
                    else if (numD == 11) {
                        animal = "Pig";
                    }
                    System.out.print(numFinal);
                    System.out.print(" ");
                    if (yang) {
                        System.out.print("Yang ");
                    }
                    else {
                        System.out.print("Yin ");
                    }
                    System.out.print(element);
                    System.out.print(" ");
                    System.out.print(animal);
                    System.out.println();

            }
        }
    }
}