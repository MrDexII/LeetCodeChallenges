import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Andrzej", 28);
        map.put("Pawel", 29);
        map.put("Karyna", 18);
        map.put("Jan", 82);

        System.out.println("linkedHashMap = " + sortMapByValueFunctional(map));
    }

    private static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        //Descending order
        entryList.sort((item1, item2) -> item2.getValue() - item1.getValue());
        //Ascending order
        //entryList.sort(Comparator.comparingInt(Entry::getValue));
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : entryList) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    private static Map<String, Integer> sortMapByValueFunctional(Map<String, Integer> map) {
        return map
                .entrySet()
                .stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                //.sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));
    }
}
