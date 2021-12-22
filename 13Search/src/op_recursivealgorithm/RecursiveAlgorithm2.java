package op_recursivealgorithm;

public class RecursiveAlgorithm2 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 10;
        int length = ints.length;
        int first = 0;
        System.out.println(searchBinary(ints, number, first, length));
    }

    public static int searchBinary(int[] ints, int number, int first, int last) {
        int mid = (first + last) / 2;
        if (first < last) {
            if (number == ints[mid]) {
                return mid;
            } else if (number > ints[mid]) {
                first = mid + 1;
                return searchBinary(ints, number, first, last);
            } else if (number < ints[mid]) {
                last = mid - 1;
                return searchBinary(ints, number, first, last);
            }
        }
        return -1;
    }
}
