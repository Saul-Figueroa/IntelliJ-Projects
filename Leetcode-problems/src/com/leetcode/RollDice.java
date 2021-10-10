package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RollDice {
    final int MOD = 1000000007;
    public int rollsToTarget(int d, int f, int target){

        //Use memorization in order to avoid the same type of calculation again and again
        Map<String, Integer> map = new HashMap<>();
       if(target < d || target > d*f)
           return 0;
       if(d == 1)
           return (target <= f) ?1:0;

       final String key =""+d+f+target;


       if(!map.containsKey(key)){
           int sum =0;
           for(int i=1; i<=f; i++){//recursive call with all the posible combinations
               sum += rollsToTarget(d-1, f, target -i);
               sum %= MOD;
           }
           map.put(key, sum);

       }

        return map.get(key);
    }
}
