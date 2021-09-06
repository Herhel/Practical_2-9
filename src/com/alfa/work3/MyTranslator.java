package com.alfa.work3;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {
    Map<String, String> map = new HashMap<>();

    public void addWord(String key, String value) {
        map.put(key.toLowerCase(), value.toLowerCase());
    }

    public String translate(String text) {
        StringBuilder fraze = new StringBuilder();
        String[] words = text.split(" ");
        for (String elem : words) {
            String token = map.get(elem.toLowerCase());
            if (token != null) {
                fraze.append(token);
            } else {
                fraze.append(elem);
            }
            fraze.append(" ");
        }
        return fraze.toString().trim();
    }
}
