import java.util.*;
import java.util.stream.*;

public class WordFrequencyDemo {
    public static void main(String[] args) {
        String paragraph = "hello world hello java world streams java java";
        List<String> words = Arrays.asList(paragraph.split(" "));

        Map<String, Long> frequency = words.stream()
            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        frequency.forEach((word, count) ->
            System.out.println(word + " -> " + count)
        );
    }
}
