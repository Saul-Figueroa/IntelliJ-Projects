package com.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class PrisionAfterNDaysII {

    public static void main(String[] args) {

        int [] cells ={1, 0, 0, 0, 0, 1, 1, 1};
        //            [0, 1, 0, 0, 1, 1, 0, 0]
        //            [0, 0, 1, 1, 1, 1, 1, 0]
        //            [0, 1, 1, 0, 0, 0, 1, 0]
        int days =3;

        System.out.println(cellCompete(cells, days));

    }
    public static List<Integer> cellCompete(int [] cells, int days){
        List<Integer> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        boolean hasCycle = false;
        int num_days=0; //num of days to determine if there's a cycle
        for(int i=0; i< days; i++){
            int [] day = getNext(cells);
            String str = Arrays.toString(day);
            if(!set.contains(str)){
                set.add(str);
                num_days++;
            }else{
                hasCycle = true;
                break;
            }
            cells = day;
        }

        if(hasCycle){
            days %= num_days;
            for (int i=0; i< days; i++){
                cells = getNext(cells);
            }
        }

        result = Arrays.stream(cells)
                .boxed()
                .collect(Collectors.toList());


        return result;
    }

    private static int[] getNext(int[] cells){
        int [] day = new int[cells.length];
        for(int i =0; i< cells.length; i++){
            if(i == 0 || i == cells.length-1){
                day[i]=0;
            }else{
                day[i] = cells[i -1] == cells[i+1] ? 0:1;
            }
        }

        return day;
    }
}
