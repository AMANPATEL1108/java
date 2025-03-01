public class Searchinsortedmatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 100;
        System.out.print(staircasesearch(matrix, key));
    }

    public static boolean staircasesearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key(" + row + "," + col + ")");
                return true;

            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Not found key");
        return false;

    }
}
