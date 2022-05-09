package kraakmo.learningjava;

public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
        int fruitCounter = 0;
        int berryCounter = 0;
        int appleCounter = 0;
        int orangeCounter = 0;

        for (int i=0; i< fruit.length; i++) {
            if (fruitCounter < 12) {
                if (fruit[i].contains("berry")) {
                    fruitSalad[fruitCounter] = fruit[i];
                    berryCounter++;
                    fruitCounter++;
                } else if (fruit[i].contains("Apple")) {
                    if(appleCounter < 3) {
                        fruitSalad[fruitCounter] = fruit[i];
                        appleCounter++;
                        fruitCounter++;
                    }else {
                        continue;
                    }
                } else if (fruit[i].contains("Orange")) {
                    if (orangeCounter < 2) {
                        fruitSalad[fruitCounter] = fruit[i];
                        orangeCounter++;
                        fruitCounter++;
                    } else {
                        continue;
                    }
                } else if (fruit[i].contains("Tomato")) {
                    continue;
                } else {
                    fruitSalad[fruitCounter] = fruit[i];
                    fruitCounter++;
                }
            }
        }
        for(int i = 0; i < fruitSalad.length; i++) {
            System.out.print(fruitSalad[i] + ", ");
        }
    }
}
