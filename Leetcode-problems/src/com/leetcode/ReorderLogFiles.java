package com.leetcode;

import java.util.Arrays;

public class ReorderLogFiles {

    public String[] reorderLogFiles(String [] logs){

        Arrays.sort(logs, (log1, log2) ->{
            //log1 > log2  -> -1
            //log1 == log2 -> 0
            //log1 < log2  -> 1
            int index1 = log1.indexOf(" ");
            String id1 = log1.substring(0,index1);
            String main1= log1.substring(index1 +1);

            int index2 = log2.indexOf("");
            String id2 = log2.substring(0, index2);
            String main2 = log2.substring(index2 +1);

            //Determine if the logs are letter logs
            boolean isDigit1 = Character.isDigit(main1.charAt(0));
            boolean isDigit2 = Character.isDigit(main2.charAt(0));

            //Case 1: both logs are letter-logs
            if(!isDigit1 && !isDigit2){
                int value = main1.compareTo(main2);
                return value == 0 ? id1.compareTo(id2): value;
            }

            //Case 2: one log is digit-log
            if(!isDigit1 && isDigit2)
                //the letter-log comes before digit-log
                return -1;
            else if(isDigit1 && !isDigit2)
                return 1;
            else
                //Case 3: both logs are digit logs
                return 0;
        });

        return logs;
    }
}
