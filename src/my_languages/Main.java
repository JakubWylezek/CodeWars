package my_languages;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

class MyLanguages {

    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<String> languages = new LinkedList<>();

        Map<String, Integer> sortedResult =
                results.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));


        for(Map.Entry<String, Integer> entry : sortedResult.entrySet())
            if(entry.getValue()  >= 60)
                languages.add(entry.getKey().toString());

        return languages;
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
