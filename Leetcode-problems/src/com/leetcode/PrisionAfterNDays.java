package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrisionAfterNDays {

    public int[] prisionAfterNDays(int[] cells, int n){
        Set<String> set = new HashSet<>();
        boolean hasCycle = false;
        int days=0;

        for (int i =0; i< n; i++){
            int [] next = getNext(cells);
            String str = Arrays.toString(next);
            if(!set.contains(str)){
                set.add(str);
                days++;


            }else {
                hasCycle= true;
                break;
            }
            cells = next;

        }

        if(hasCycle){
            n %= days;
            for(int i=0; i< n; i++){
                cells = getNext(cells);
            }
        }

        return cells;
    }

    private int[] getNext(int [] cells){
        int [] next = new int[cells.length];
        for(int i=0; i< cells.length; i++){
            if(i == 0 || i== cells.length-1){
                next[i] =0;
            }else{
              next[i] = next[i-1] == next[i+1] ? 1:0;
            }

        }

        return next;
    }

}
