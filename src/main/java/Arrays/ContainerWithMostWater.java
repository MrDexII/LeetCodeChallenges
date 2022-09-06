package Arrays;

public class ContainerWithMostWater {
    //time complexity O(n^2)
    //spase complexity O(1)
    public static int maxArea1(int[] height) {
        int maxA = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                int distance = j - i;
                int area = distance * Math.min(height[i], height[j]);
                if (area > maxA) {
                    maxA = area;
                }
            }
        }
        return maxA;
    }

    public static int maxArea2(int[] height) {
        int maxArea = 0;
        int pointerL = 0;
        int pointerP = height.length - 1;
        while (pointerP > pointerL) {
            int distance = pointerP - pointerL;
            int area = distance * Math.min(height[pointerL], height[pointerP]);
            if (height[pointerL] < height[pointerP])
                pointerL++;
            else
                pointerP--;
            if (area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea2(height));
    }
}
