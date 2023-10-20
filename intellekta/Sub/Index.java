package com.intellekta.Sub;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Index {

    private List<String> text;

    public Index(List<String> text) {
        this.text = text;
    }

    public Index() {
    }

    public String getWordFrequency(List<String> text) {
        String res = " ";
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : text) {
            s = s.replaceAll("[^A-Za-zА-Яа-я]", "");
            String [] arr = s.split(" ");
            for (String i : arr) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }
        return res;
    }
    public String appendText (String text) {
        return text.toLowerCase();
    }

    public List<String> getFrequencyTable(List<String> text) {
        for (String s : text) {
            s.replaceAll("\\p{Punct}|\\p{Space}", "");
        }
        return text.stream().sorted().toList();
    }
}
