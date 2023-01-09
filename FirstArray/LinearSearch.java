import java.util.Random;

public class LinearSearch {
    static int numList[] = new int[1000];

    public static void main(String args[]) {
        int numList[] = new int[1000];
        Random rand = new Random(1234);
        for (int k = 0; k < numList.length; k++) {
            numList[k] = rand.nextInt(1000);
        }
        for (int k = 0; k < numList.length; k++) {
            System.out.print(numList[k] + " ");
        }
        linearSearch(974);

    }

    public static int linearSearch(int lookup) {
        for (int w = 0; w < numList.length; w++){

        }


    }



}