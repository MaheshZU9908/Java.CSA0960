public class TwoDimensionalArray {
    public static void main(String[] args) {
        float[][] price = new float[10][3];
        // Optionally print or use the array to verify it's working
        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price[i].length; j++) {
                System.out.print(price[i][j] + " ");
            }
            System.out.println();
        }
    }
}
