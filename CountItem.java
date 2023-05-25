package DSA;
import java.util.*;
import java.lang.*;
public class CountItem {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = 0, col=0;
        if(ruleKey.equals("color")) col = 1;
        else if(ruleKey.equals("name"))col = 2;
        for(int row = 0; row<items.size(); row++){
            if(items.get(row).get(col).equals(ruleKey)) n++;
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

        item1.add(0, "phone");
        item1.add(1, "blue");
        item1.add(2, "computer");
        item2.add(0, "pixel");
        item2.add(1, "silver");
        item2.add(2, "lenovo");
        item3.add(0, "phone");
        item3.add(1, "gold");
        item3.add(2, "iphone");

        int r = countMatches(items1, "type", "phone");
        System.out.println(items1);
        System.out.println(r);
    }
}
