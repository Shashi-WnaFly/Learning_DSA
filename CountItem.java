package DSA;
import java.util.*;
import java.lang.*;
public class CountItem {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = 0, col=0;
        if(ruleKey.equals("color")) col = 1;
        else if(ruleKey.equals("name"))col = 2;
        for (List<String> item : items) {
            if (item.get(col).equals(ruleValue)) n++;
        }
        return n;
        }
    public static void main(String[] args) {
        List<List<String>> items1 = new ArrayList<>();
        List<String> item1 = new ArrayList<>();
        List<String> item2 = new ArrayList<>();
        List<String> item3  = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        items1.add(item3);

        item1.add("phone");
        item1.add("blue");
        item1.add("computer");
        item2.add("pixel");
        item2.add("silver");
        item2.add("lenovo");
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        int r = countMatches(items1, "type", "phone");
        System.out.println(items1);
        System.out.println(r);
    }
}
