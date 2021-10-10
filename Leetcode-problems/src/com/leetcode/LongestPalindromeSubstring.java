package com.leetcode;

public class LongestPalindromeSubstring {
    int result_start;
    int result_length;

    //s="abcba"
    public String longestPalindrome(String s){
        int s_length = s.length();
        if(s_length < 2) return s;

        for(int i=0; i< s_length -1; i++){
            expandRange(s, i, i);
            expandRange(s, i, i+1);
        }

        return s.substring(result_start, result_start + result_length);
    }

    private void expandRange(String str, int start, int end){
        int count =0;
        //System.out.println("String: "+str+" start: "+start+" end: "+end);
        while(start >=0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            //       b  a  b  a d
            //       0  1  2  3  4
            System.out.println("start: "+start+" end: "+end);
            start--; //2 -> 1 -> 0
            end++;   //2 -> 3 -> 4
            System.out.println("start: "+start+" end: "+end);
        }
        //System.out.println("start: "+start+" end: "+end);
        if(result_length < end - start -1){
            result_start = start+1;
            result_length = end - start -1;
        }
    }
}
