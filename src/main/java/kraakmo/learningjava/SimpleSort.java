package kraakmo.learningjava;

public class SimpleSort {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};

        int[] wholeNumbers = new int[24];

        for(int i = 0; i < wholeNumbers.length; i++) {
            if (i < firstHalf.length) {
                wholeNumbers[i] = firstHalf[i];
            } else {
                wholeNumbers[i] = secondHalf[i - firstHalf.length];
            }
        }
        boolean swap = true;
        int temp;
        for (int i = 0; i < wholeNumbers.length; i++){
            swap = false;
            for (int j = 0; j < wholeNumbers.length - 1; j++){
                if (wholeNumbers[j] > wholeNumbers[j + 1]) {
                    temp = wholeNumbers[j];
                    wholeNumbers[j] = wholeNumbers[j + 1];
                    wholeNumbers[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
        System.out.println("Hera ya go - all nice and ordered:");
        for(int i = 0; i < wholeNumbers.length; i++){
            System.out.print(wholeNumbers[i] + " ");
        }
    }
}
