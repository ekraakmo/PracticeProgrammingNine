package kraakmo.learningjava;

import java.util.Random;

public class HiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];     //creates an array of 100 spaces
        Random squirrel = new Random();     //random num generator called squirrel
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";      //initializes "Nut" into array[squirrel]
        System.out.println("The nut has been hidden ...");
                                                                        //(hidingSpots.length) makes sure the range of
                                                                        //squirrel is within the array length
        for(int i = 0; i < hidingSpots.length; i++) {
            if (hidingSpots[i] == null){
                hidingSpots[i] = "";
            } else if (hidingSpots[i].equals("Nut")) {
                System.out.println("Found it! It's in spot# " + i);
                break;
            }
        }
    }
}
