package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFormbyCharacters {

    public int countCharacters(String[] words, String chars) {

        int result =0;
        int[] char_counts = new int[26];

        //get the number of letter that we have
        for(char c: chars.toCharArray()){
            char_counts[c-'a']++;
        }

        //Iterate through the words
        for(String word:words){
            //Make a copy of char_counts
            int [] temp_char_counts = Arrays.copyOf(char_counts, char_counts.length);
            int valid =0;

            //Iterate through each individual character
            for(char c: word.toCharArray()){
                if(temp_char_counts[c-'a'] > 0){
                    valid++;
                    temp_char_counts[c-'a']--;//Decrement so we don't use the same word again
                }
            }

            if(valid == word.length()){//This means that we found all the characters on chars for this word
                result += word.length();
            }
        }

        return result;
    }

}
