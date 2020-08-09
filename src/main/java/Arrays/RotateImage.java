package Arrays;

public class RotateImage {
    //Time complexity O(n^2)
    //Space complexity O(1)
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // take transpose of matrix
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        //Reverse rows of the matrix
        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }

    }

    //Time complexity O(n^2)
    //Space complexity O(1)
    public void rotate2(int[][] matrix) {
        int len = matrix.length;
        for (int l = len; l > 1; l -= 2) {
            int lo = (len - l) / 2;
            int hi = lo + l - 1;
            for (int i = 0; i < l - 1; i++) {
                int temp = matrix[hi - i][lo];
                matrix[hi - i][lo] = matrix[hi][hi - i];
                matrix[hi][hi - i] = matrix[lo + i][hi];
                matrix[lo + i][hi] = matrix[lo][lo + i];
                matrix[lo][lo + i] = temp;
            }
        }
    }

    public void rotate3(int[][] matrix) {
        int n = matrix.length;

        int[][] matrix2 = new int[n][n];


    }

    public static void main(String[] args) {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //      [7,4,1],
        //      [8,5,2],
        //      [9,6,3]
//        int[][] matrix = {
//                {5, 1, 9, 11},
//                {2, 4, 8, 10},
//                {13, 3, 6, 7},
//                {15, 14, 12, 16}
//        };
        //      [15,13, 2, 5],
        //      [14, 3, 4, 1],
        //      [12, 6, 8, 9],
        //      [16, 7,10,11]
        rotateImage.rotate3(matrix);
    }
}
