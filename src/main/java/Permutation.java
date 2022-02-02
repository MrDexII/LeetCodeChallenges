import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Permutation {
    static List<List<Integer>> out = new ArrayList<>();

    static void permK(List<Integer> p, int i, int k) {
        if (i == k) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                temp.add(p.get(j));
            }
            out.add(temp);
            return;
        }

        for (int j = i; j < p.size(); j++) {
            Collections.swap(p, i, j);
            permK(p, i + 1, k);
            Collections.swap(p, i, j);
        }
    }

    public static void main(String args[]) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);
        permK(ints, 0, 3);
        out.stream()
                .peek(list -> list.sort(Integer::compareTo))
                .map(Object::toString)
                .distinct()
                .forEach(System.out::println);
    }
}
//https://www.dcode.fr/partial-k-permutations