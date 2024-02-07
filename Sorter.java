public class Sorter {
    public static void main(String[] args) {
        int[] Array = new int[7];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 100);
        }
        for(int x: Array){
            System.out.print(x + " ");
        }
        selectionSort(Array);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println("\nafter sort");
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}
