import java.util.Arrays;

public class RandomPickWithWeight {
    //    private int[] w;
//    private Random random;
//    private int sum;
//
//    public RandomPickWithWeight(int[] w) {
//        this.w = w;
//        this.random = new Random();
//        for (int i = 0; i < w.length; i++) {
//            sum += w[i];
//        }
//    }
//
//    public int pickIndex() {
//        int randomValue = random.nextInt(sum);
//        for (int i = 0; i < w.length; i++) {
//            if (randomValue < w[i])
//                return i;
//            randomValue -= w[i];
//        }
//        return 0;
//    }
    private int[] prefixSum;
    private int totalSum;

    public RandomPickWithWeight(int[] w) {
        prefixSum = new int[w.length];
        totalSum = 0;
        for (int i = 0; i < w.length; i++) {
            totalSum += w[i];
            prefixSum[i] = totalSum;
        }
    }

    public int pickIndex() {
        double target = this.totalSum * Math.random();

        int start = 0;
        int end = prefixSum.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target > prefixSum[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        //weights for indexes 0,1,2
        int[] weights = {3, 2, 1};
        int[] results = new int[10];
        RandomPickWithWeight randomPickWithWeight = new RandomPickWithWeight(weights);
        for (int i = 0; i < results.length; i++) {
            results[i] = randomPickWithWeight.pickIndex();
        }
        System.out.println("results = " + Arrays.toString(results));
    }
}
