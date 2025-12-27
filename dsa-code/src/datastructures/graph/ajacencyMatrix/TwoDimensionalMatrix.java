package datastructures.graph.ajacencyMatrix;

public class TwoDimensionalMatrix {
    public static void main(String[] args) {


        char[][] strings = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println(strings.length);
        System.out.println(strings[0].length);



//        String[][] stringValues = {
//                {'working", "with"},
//                {"2D", "arrays"},
//                {"is", "fun"}};

        int[][] numbers = {
                {1,  2, 3},
                {4,  5, 6},
                {7,  8, 9},
                {10, 11, 12}
        };

        /**Enhanced for loop*/
//        for (String[] stringValue : stringValues) {
//            for (String string : stringValue) {
//                System.out.print(string + " ");
//            }
//        }

        /**Normal for loop Row Major*/
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//        }

        /**Column Major*/
        for(int i = 0; i < numbers[0].length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                System.out.println("Column Major" + numbers[j][i]);
            }
        }
    }
}
