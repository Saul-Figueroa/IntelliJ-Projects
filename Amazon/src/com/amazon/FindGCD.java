package com.amazon;

public class FindGCD {

    public static void main(String[] args) {
        int[] nums ={2,5,6,9,10};
        //Iterate through nums to find the smallest and largest number
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num:nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println("MOD: "+10%2);


        while(min >0){
            int tmp = min;
            min = max % min;
            max = tmp;
        }

        System.out.println("GCD: "+max);
    }
}
