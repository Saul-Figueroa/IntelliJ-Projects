package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String [] banned){
        Set<String> banned_word = new HashSet<>();
        Map<String, Integer> valid_words = new HashMap<>();

        for(String word : banned){
            banned_word.add(word);
        }

        String [] words = paragraph.toLowerCase().split("\\W+");
        for(String word:words){
            if(!banned_word.contains(word)){
                valid_words.put(word, valid_words.getOrDefault(word, 0)+1);
            }
        }

        int max =0;
        String result ="";

        for(String word : valid_words.keySet()){
            if(valid_words.get(word) > max){
                max = valid_words.get(word);
                result = word;
            }
        }

        return result;
    }

}
