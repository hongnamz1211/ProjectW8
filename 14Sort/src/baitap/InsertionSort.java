package baitap;

public class InsertionSort {
    public void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
    
    public static void displayList(int[] list) {
        int n = list.length;
        for (int l :
                list) {
            System.out.print(l + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] list = {12, 11, 13, 5, 6};
        System.out.println("Mảng đầu");
        displayList(list);
        InsertionSort is = new InsertionSort();
        is.insertionSort(list);
        System.out.println("Mảng sau");
        displayList(list);
    }


}
