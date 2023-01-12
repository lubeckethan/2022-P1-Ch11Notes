public class BinarySearch {
    static int numList[] = {7, 15, 20, 23, 24, 51, 65, 65, 74, 81};

    public static void main(String args[]) {
        System.out.println("Running");
        System.out.println(binarySearch(23));
        System.out.println("Finished");
    }

    public static int binarySearch(int lookup) {
        int low = 0;
        int high = numList.length;


        while (low<high) {
            int middle = ((high - low) / 2) + low;
            if (numList[middle] > lookup) {
                high = middle - 1;
            }
            if (numList[middle] < lookup) {
                low = middle + 1;
            }
            if (numList[middle] == lookup) {
                return middle;
            }

        }

        return -1;
    }
}