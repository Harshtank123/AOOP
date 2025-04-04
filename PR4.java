public class Array_matrix {
    public static void main(String[] args) {
        int[][] array1 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] array2 = {{1, 2, 3}, {4, 5, 5}, {7, 8, 9}};

        int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
