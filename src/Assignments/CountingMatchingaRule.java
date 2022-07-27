package Assignments;

import java.util.*;

public class CountingMatchingaRule {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       List<List<String>> aw = new ArrayList<List<String>>(3);

        for (int i = 0; i < 3; i++) {
            aw.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aw.get(i).add(in.next());
            }
        }
        String rulekey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(aw, rulekey, ruleValue));
    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        for (int i = 0; i < 3; i++) {
                if (ruleKey.equals("type")) {
                    if (items.get(i).get(0).equals(ruleValue)) {
                        c++;
                    }
                }
                if (ruleKey.equals("color")) {
                    if (items.get(i).get(1).equals(ruleValue)) {
                        c++;
                    }
                }
                if (ruleKey.equals("name")) {
                    if (items.get(i).get(2).equals(ruleValue)) {
                        c++;
                    }
                }


        }
        return c;
    }
}
