package blog1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class ListSorter {

    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("Sorting with natural order");
        List<String> list1 = createList();
        list1.sort(null);
        list1.forEach(System.out::println);

        System.out.println("=================");
        System.out.println("Sorting with a lamda expression for the comparison");
        List<String> list2 = createList();
        list2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        list2.forEach(System.out::println);

        System.out.println("=================");
        System.out.println("Sorting with a method references");
        List<String> list3 = createList();
        list3.sort(String::compareToIgnoreCase);
        list3.forEach(System.out::println);

    }

    private static List<String> createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }

}
