package basic.arrayss;

public class SortArrays {
    public static void main(String[] args) {
        int[] array = {-3, 0, -100, 5, 2, 87654, -67, -101, 65, 1, -100};
        int[] sortedArray = bubbleSort(array);

        for (int element : sortedArray) {
            System.out.println(element);
        }
    }

    public static int[] bubbleSort(int[] array) {
          for (int j = 0; j < array.length-1; j++) {
            for (int i = 0; i < array.length - 1-j; i++) {
                int a;
                if (array[i] > array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }

            }
        }
        return array;
    }
}



