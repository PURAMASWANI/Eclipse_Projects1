package sessions;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Renu");
        names.add("Sai");
        names.add("Renu");
        System.out.println("Names: " + names);

        names.add(3, "Ashu");
        System.out.println("adding elements " + names);

        System.out.println("getting element " + names.get(2));

        names.remove("Renu");
        System.out.println("remove one element " + names);

        System.out.println(" size of the list " + names.size());

        System.out.println("the name is present in the list or not " + names.contains("Sai"));

        System.out.println(" finding index " + names.indexOf("Sai"));

        // Additional methods
        names.set(1, "Sai Kumar");
        System.out.println("set element: " + names);

        names.addAll(List.of("John", "Doe"));
        System.out.println("addAll: " + names);

        names.removeAll(List.of("John"));
        System.out.println("removeAll: " + names);

        names.retainAll(List.of("Sai Kumar", "Ashu"));
        System.out.println("retainAll: " + names);

        System.out.println("subList: " + names.subList(0, 1));

        names.sort((a, b) -> a.compareTo(b));
        System.out.println("sort: " + names);

        names.replaceAll(String::toUpperCase);
        System.out.println("replaceAll: " + names);

        names.removeIf(s -> s.equals("ASHU"));
        System.out.println("removeIf: " + names);

        names.forEach(System.out::println);

        System.out.println("isEmpty: " + names.isEmpty());
    }
}