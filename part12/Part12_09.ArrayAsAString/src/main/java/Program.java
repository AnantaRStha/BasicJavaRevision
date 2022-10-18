import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
                {3, 2, 7},
                {2, 4, 1},
                {3, 2, 1}
        };

//        System.out.println(sumsOfRows(matrix).toString());
//        System.out.println(sumsOfColumns(matrix).toString());
        System.out.println(sumsOfDiagonals(matrix).toString());
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder numbers = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                numbers.append(value);
            }
            numbers.append("\n");
        }
        return numbers.toString();
    }
    public static ArrayList<Integer> sumsOfRows( int[][] square) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            int sum=0;
            for (int column = 0; column < square[row].length; column++) {
                int value = square[row][column];
                sum = sum +value;
            }
            result.add(sum);
        }
        return result;
    }

    public static ArrayList<Integer> sumsOfColumns(int[][] square) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int column = 0; column < square[0].length; column++) {
            int sum=0;
            for (int row = 0; row < square.length; row++) {
                int value = square[row][column];
                sum = sum +value;
            }
            result.add(sum);
        }
        return result;
    }

    public static ArrayList<Integer> sumsOfDiagonals(int[][]square) {
        ArrayList<Integer> result = new ArrayList<>();
        int firstSum=0;
        int secondSum =0;
        for (int row = 0; row < square.length; row++) {
                int value = square[row][row];
                firstSum = firstSum +value;
        }
        result.add(firstSum);

        for (int row = square.length-1 ; row>=0; row--) {
            int value = square[row][square.length-1-row];
            secondSum = secondSum +value;
        }
        result.add(secondSum);
        return result;
    }

}
