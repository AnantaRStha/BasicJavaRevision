import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {

//        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
//        MainProgram.sort(numbers);
        int[] t = {2, 1, 3, 0};
        System.out.println(smallest(t));

    }

    public static int smallest(int[] array) {
        int smallest =array[0];
        for (int i = 0; i < array.length; i++) {

                if (smallest > array[i]) {
                    smallest = array[i];
                   }
            }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int index = 0;
        int min = array[index];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int[] newTable = new int[table.length - startIndex];
        for (int i = startIndex; i < table.length; i++)
            if (startIndex > 0) {
                newTable[table.length - (table.length + startIndex - i)] = table[i];
            } else {
                newTable[table.length - (table.length - i)] = table[i];
            }
        return indexOfSmallest(newTable) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int smallestIndex = indexOfSmallest(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, smallestIndex);
            smallestIndex = indexOfSmallestFrom(array, i + 1);
            System.out.println(Arrays.toString(array));

        }
    }


}
