package com.abstraction;

public class Driver {
    public static void main(String[] args) {
        for(int i =1; i < 101; i++){
            String result = "";
            result += (i % 3) == 0? "Fizz":"";
            result += (i % 5) ==0?"Buzz":"";
            System.out.println(!result.isEmpty()?result:i);
        }
    }
}
