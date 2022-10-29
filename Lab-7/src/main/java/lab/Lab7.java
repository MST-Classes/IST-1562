package lab;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Lab7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("james");
        list.add("james");
        list.add("bill");
        list.add("mary");
        list.add("mike");
        list.add("mary");
        System.out.println(list);

        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
