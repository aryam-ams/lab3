public class Sorter {
    public static void main(String[] args) {
        int[] Array = new int[7];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 100);
        }
        System.out.println("before sort");
        for(int x: Array){
            System.out.print(x + " ");
        }
        sort(Array);
        Sort(Array);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("\nafter selection sort");
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    public static void insertionSort(int[] array){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println("\nafter insertion sort");
        for(int i =0; i<n;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void Sort(int[] array) {
        insertionSort(array);
    }

    public static void sort(int[] array){
        selectionSort(array);
    }
}
