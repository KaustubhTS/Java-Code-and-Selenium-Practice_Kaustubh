package Kaustubh_Programming_Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//NOTE : COPIED FROM GITHUB COPILOT

public class SecondMostFrequestCharacter {

    static void secondMostFreq(String s) {
        // Count frequencies
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Build frequency -> characters map to handle ties
        Map<Integer, List<Character>> freqMap = new HashMap<>();
        for (Entry<Character, Integer> e : map.entrySet()) {
            freqMap.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }

        // Get distinct frequencies sorted descending
        List<Integer> freqs = new ArrayList<>(freqMap.keySet());
        freqs.sort(Comparator.reverseOrder());

        if (freqs.size() < 2) {
            System.out.println("No second most frequent character found");
            return;
        }

        int secondFreq = freqs.get(1);
        List<Character> chars = freqMap.get(secondFreq);

        // Print all characters that share the second highest frequency
        System.out.println("Second Most Frequent Count: " + secondFreq);
        System.out.println("Characters: " + chars);
    }

    public static void main(String[] args) {
        secondMostFreq("aaabbccccdddddeeeeeffffffff");
    }

}