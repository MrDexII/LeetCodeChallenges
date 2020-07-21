package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

    // O(n)
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        int[] differences = new int[costs.length];
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i][0];
            differences[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(differences);
        for (int i = 0; i < differences.length / 2; i++) {
            sum += differences[i];
        }
        return sum;
    }

    // O(nlogn)
    public int twoCitySchedCost2(int[][] costs) {
        //Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));
        //Arrays.sort(costs, (a, b) -> Integer.compare(a[0] - a[1], b[0] - b[1]));
        Arrays.sort(costs, Comparator.comparingInt(a -> a[0] - a[1]));
        int minCost = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            minCost += costs[i][0];
            minCost += costs[costs.length / 2 + i][1];
        }
        return minCost;
    }

    public static void main(String[] args) {
        TwoCityScheduling toTwoCityScheduling = new TwoCityScheduling();

        //int[][] cost = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        //int[][] cost = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        int[][] cost = {{518, 518}, {71, 971}, {121, 862}, {967, 607}, {138, 754}, {513, 337}, {499, 873}, {337, 387}, {647, 917}, {76, 417}};

        System.out.println(toTwoCityScheduling.twoCitySchedCost2(cost));
    }
}
