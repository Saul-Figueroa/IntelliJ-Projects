package com.driver;

import com.leetcode.*;

import java.util.PriorityQueue;

public class Driver {

    public static void main(String[] args) {

       PrisionAfterNDays call = new PrisionAfterNDays();
       int [] cells={0,1,0,1,1,0,0,1};
       int [] result = {0,0,1,1,0,0,0,0};
       int days =7;

       if(call.prisionAfterNDays(cells, days) == result){
           System.out.println("Pass");

       }else{
           System.out.println("Fail");
        }
    }

}
