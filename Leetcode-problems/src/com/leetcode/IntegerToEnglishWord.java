package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglishWord {

    Map<Integer, String> map;
    public String numberToWords(int num){
        if(num == 0) return "Zero";
        map = new HashMap<>();
        fillMap();

        //System.out.println(map);

        return helper(num);
    }

    private String helper(int num){
        String result="";
        if(num < 20) result = (map.get(num));
        else if(num < 100) result = (map.get(num/10*10)+" "+helper(num%10));
        else if(num < 1000) result = (helper(num/100)+" Hundred "+helper(num%100));
        else if(num < 1000000) result = (helper(num/1000)+" Thousand "+helper(num%1000));
        else if(num < 1000000000) result = (helper(num/1000000)+" Million "+helper(num%1000000));
        else result = (helper(num/1000000000)+" Billion "+helper(num%1000000000));

        return result.toString();
    }


    public void fillMap(){
        map.put(0,"");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        map.put(10,"Ten");
        map.put(11,"Eleven");
        map.put(12,"Twelve");
        map.put(13,"Thirteen");
        map.put(14,"Fourteen");
        map.put(15,"Fifteen");
        map.put(16,"Sixteen");
        map.put(17,"Seventeen");
        map.put(18,"Eighteen");
        map.put(19,"Nineteen");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Forty");
        map.put(50,"Fifty");
        map.put(60,"Sixty");
        map.put(70,"Seventy");
        map.put(80,"Eighty");
        map.put(90,"Ninety");
    }



}
