import java.util.List;

public class OddNumbers {

    public boolean isOddFunctional(List<Integer> listOfOddNumbers) {
        if (listOfOddNumbers.isEmpty()) return false;
        return listOfOddNumbers
                .stream()
                .allMatch(OddNumbers::isOdd);
    }

    public boolean isOddImperative(List<Integer> listOfOddNumbers) {
        if (listOfOddNumbers.size() == 0) return false;
        for (Integer number : listOfOddNumbers) {
            if (!isOdd(number)) return false;
        }
        return true;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        OddNumbers oddNumbers = new OddNumbers();
        List<Integer> listOfOddNumbers = List.of(1, 4, 5, 12, 4, 2, 5, 23, 2, 3);
        List<Integer> listOfOddNumbers2 = List.of(1, 5, 7, 9);
        List<Integer> listOfOddNumbers3 = List.of();

        final boolean odd = oddNumbers.isOddFunctional(listOfOddNumbers3);
        System.out.println("odd = " + odd);
    }
}
