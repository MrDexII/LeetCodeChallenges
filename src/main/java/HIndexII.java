public class HIndexII {

    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;

        int n = citations.length;
        int low = 0, high = n - 1, mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (citations[mid] == (n - mid))
                return citations[mid];
            else if (citations[mid] > (n - mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return n - low;
    }

    public static void main(String[] args) {
        HIndexII hIndexII = new HIndexII();

        //int[] citations = {0, 1, 3, 5, 6};
        //int[] citations = {1, 2, 6, 7, 8, 9};

        int[] citations = {1, 5, 6, 7, 8};

        System.out.println(hIndexII.hIndex(citations));


    }
}
