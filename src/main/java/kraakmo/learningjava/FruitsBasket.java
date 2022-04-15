package kraakmo.learningjava;

public class FruitsBasket {
    public static void main(String[] args) {
        int orangeCounter = 0;
        int appleCounter = 0;
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};

        for(int i = 0; i < fruit.length; i++) {

            if (fruit[i].equals("Orange")) {
                orangeCounter++;
            } else {
                appleCounter++;
            }
        }

        String[] oranges = new String[orangeCounter];
        for(int i = 0; i < oranges.length; i++) {
            oranges[i] = "Oranges";
        }

        String[] apples = new String[appleCounter];
        for(int i = 0; i < oranges.length; i++) {
            oranges[i] = "Apples";
        }

        System.out.println("The total number of fruits in Basket: " + (orangeCounter + appleCounter));
        System.out.println("Number of oranges: " + oranges.length);
        System.out.println("Number of apples: " + apples.length);
    }
}
