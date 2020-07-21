package Arrays;

import java.util.*;

public class IntersectionofTwoArraysII {

    static public int[] intersect1(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length)
            intersect1(nums2, nums1);

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++)
            for (int j = 0; j < nums1.length; j++)
                if (nums2[i] == nums1[j]) {
                    temp.add(nums2[i]);
                    break;
                }
        return temp.stream().mapToInt(i -> i).toArray();
    }

    static public int[] intersect2(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length)
            intersect2(nums2, nums1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums2)
            map.put(number, map.getOrDefault(number, 0) + 1);

        List<Integer> list = new ArrayList<>();

        for (int number : nums1) {
            if (map.containsKey(number)) {
                if (map.get(number) > 0) {
                    map.put(number, map.get(number) - 1);
                    list.add(number);
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    static public int[] intersect3(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else
                i++;
        }
        return list.stream().mapToInt(k -> k).toArray();
    }

    public static void main(String[] args) {
        //int[] nums1 = {1, 2, 2, 1};
        //int[] nums2 = {2, 2};
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect3(nums1, nums2)));

    }
}
