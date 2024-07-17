public class Knappsack {

    static int knapSack(int weightCap, int weights[], int values[], int n) {
        int matrix[][] = new int[n + 1][weightCap + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= weightCap; w++) {
                if (i == 0 || w == 0) {
                    matrix[i][w] = 0;
                } else if (weights[i - 1] <= w) {
                    matrix[i][w] = Math.max(values[i - 1] + matrix[i - 1][w - weights[i - 1]], matrix[i - 1][w]);
                } else {
                    matrix[i][w] = matrix[i - 1][w];
                }
            }
        }

        return matrix[n][weightCap];
    }

    public static void main(String[] args) {
        int values[] = new int[]{70, 20, 39, 37, 7, 5, 10};
        int weights[] = new int[]{31, 10, 20, 19, 4, 3, 6};
        int weightCap = 50;
        int n = values.length;
        System.out.println(knapSack(weightCap, weights, values, n));
    }
}
