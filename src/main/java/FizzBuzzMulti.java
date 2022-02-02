import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzMulti {

    public List<String> fizzBuzzIterable(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int i1 = Integer.parseInt(list.get(i));
            if (i1 % 3 == 0 && i1 % 5 == 0) {
                list.set(i, "FizzBuzz");
            } else if (i1 % 3 == 0) {
                list.set(i, "Fizz");
            } else if (i1 % 5 == 0) {
                list.set(i, "Buzz");
            }
        }
        return list;
    }

    public List<String> fizzBuzzMulti(List<String> list) throws InterruptedException {
        Runnable runnableFizzBuzz = () -> {
            for (int i = 0; i < list.size(); i++) {
                try {
                    int i1 = Integer.parseInt(list.get(i));
                    if (i1 % 3 == 0 && i1 % 5 == 0) {
                        list.set(i, "FizzBuzz");
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        };

        Runnable runnableFizz = () -> {
            for (int i = 0; i < list.size(); i++) {
                try {
                    int i1 = Integer.parseInt(list.get(i));
                    if (i1 % 3 == 0) {
                        list.set(i, "Fizz");
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        };

        Runnable runnableBuzz = () -> {
            for (int i = 0; i < list.size(); i++) {
                try {
                    int i1 = Integer.parseInt(list.get(i));
                    if (i1 % 5 == 0) {
                        list.set(i, "Buzz");
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        };

        Thread thread1 = new Thread(runnableFizzBuzz);
        Thread thread2 = new Thread(runnableFizz);
        Thread thread3 = new Thread(runnableBuzz);

        thread1.start();
        thread2.start();
        thread3.start();
        thread3.join();

        return list;
    }

    public static void main(String[] args) throws InterruptedException {
        FizzBuzzMulti fizzBuzzMulti = new FizzBuzzMulti();

        List<String> list = Stream.iterate(0, i -> i + 1).limit(101).map(String::valueOf).collect(Collectors.toList());

        //list.forEach(System.out::println);
        fizzBuzzMulti.fizzBuzzIterable(list).forEach(System.out::println);

    }
}
