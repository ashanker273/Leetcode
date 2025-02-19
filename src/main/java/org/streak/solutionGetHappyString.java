package org.streak;

import java.util.ArrayList;
import java.util.List;

class solutionGetHappyString {
    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        generateHappyStrings(n, "", happyStrings);

        return happyStrings.size() >= k ? happyStrings.get(k - 1) : "";
    }

    private void generateHappyStrings(int n, String current, List<String> happyStrings) {
        if (current.length() == n) {
            happyStrings.add(current);
            return;
        }

        for (char c : new char[]{'a', 'b', 'c'}) {
            if (current.isEmpty() || current.charAt(current.length() - 1) != c) {
                generateHappyStrings(n, current + c, happyStrings);
            }
        }
    }
}

