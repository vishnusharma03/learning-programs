package alpha;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Leetcode1773 {
    public static void main(String[] args) {

    }



        // items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"



    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (Objects.equals(ruleKey, "type")) {
                if (Objects.equals(items.get(i).get(0), ruleValue)){
                    count++;
                }
            }
            if (Objects.equals(ruleKey, "color")) {
                if (Objects.equals(items.get(i).get(1), ruleValue)) {
                    count++;
                }
            }
            if (Objects.equals(ruleKey, "name")) {
                if (Objects.equals(items.get(i).get(2), ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}
