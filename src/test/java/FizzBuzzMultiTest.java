import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzMultiTest {
    private FizzBuzzMulti fizzBuzzMulti;
    private List<String> list;

    @Before
    public void init() {
        fizzBuzzMulti = new FizzBuzzMulti();
        list = Stream.iterate(0, i -> i + 1).limit(101).map(String::valueOf).collect(Collectors.toList());
    }

    @Test
    public void fizzBuzzMulti() throws InterruptedException {
        List<String> temp = fizzBuzzMulti.fizzBuzzIterable(new ArrayList<>(list));
        List<String> temp2 = fizzBuzzMulti.fizzBuzzMulti(new ArrayList<>(list));
        assertEquals(temp, temp2);
    }

    @Test
    public void fizzBuzzIter() throws InterruptedException {
        List<String> temp = fizzBuzzMulti.fizzBuzzIterable(list);
    }

    @Test
    public void fizzBuzzMultiPer() throws InterruptedException {
        List<String> temp2 = fizzBuzzMulti.fizzBuzzMulti(list);
    }

}