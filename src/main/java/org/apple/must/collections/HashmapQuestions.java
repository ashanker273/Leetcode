package org.apple.must.collections;

import java.util.*;

public class HashmapQuestions {

    public char firstNonRepeatingChar(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char c : input.toCharArray()) {
            if (map.get(c) == 1) return c;
        }
        return '-';
    }

    public String sortLetters(String input) {
        char[] sortString = input.toCharArray();
        Arrays.sort(sortString);
        return new String(sortString);
    }

    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        LinkedHashSet<Integer> orderedSet = new LinkedHashSet<>();
        for (int each : list) {
            orderedSet.add(each);
        }
        return new ArrayList<>(orderedSet);
    }


    public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
        Stack<Integer> stack = new Stack<>();

        for(int each : list){
            stack.push(each);
        }

        list.clear();

        while(!stack.empty()){
            list.add(stack.pop());
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println("HashmapFirstNonRepeatingCharacter");

        //Find the First Non-Repeated Character in a String
        HashmapQuestions hashmapQuestions = new HashmapQuestions();
        System.out.println(hashmapQuestions.firstNonRepeatingChar("aapp"));
        System.out.println(hashmapQuestions.sortLetters("zxasd"));


        //Remove Duplicates from an ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
        System.out.println(hashmapQuestions.removeDuplicates(list));

    }

}
