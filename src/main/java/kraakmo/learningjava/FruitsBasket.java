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
        System.out.println("The total number of fruits in Basket: " + (orangeCounter + appleCounter));

        int howManyOranges = 0;
        int howManyApples = 0;

        for(int i =0; i < fruit.length; i++) {
            if(fruit[i].equals("Orange")){
                howManyOranges++;
            }
        }
        String[] oranges = new String[howManyOranges];
        for(int i = 0; i < oranges.length; i++) {
            oranges[i] = "Oranges";
        }
        System.out.println("Number of oranges: " + oranges.length);

        for(int i =0; i < fruit.length; i++) {
            if(fruit[i].equals("Apple")){
                howManyApples++;
            }
        }
        String[] apples = new String[howManyApples];
        for(int i = 0; i < oranges.length; i++) {
            oranges[i] = "Apples";
        }
        System.out.println("Number of apples: " + apples.length);
    }
}
