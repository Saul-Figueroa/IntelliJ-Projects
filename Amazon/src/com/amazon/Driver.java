package com.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        AmazonFreshPromotion check = new AmazonFreshPromotion();


     String [][] codeList= {{"apple","apple"}, {"banana","anything","banana"}};
     String [] shoppingCart ={"orange", "apple", "apple", "banana", "orange", "banana"};


     //System.out.println(check.amazonPromotion(shoppingCart, codeList));

     //__________________________________________________________________________
    AmazonFreshPromotionII call = new AmazonFreshPromotionII();
    List<String> cart = Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana");
    List<List<String>> code = new ArrayList<>();
        List<String> l1 = Arrays.asList("apple", "apple","mango");
        List<String> l2 = Arrays.asList("banana", "anything", "banana");
        code.add(l1);
        code.add(l2);

        System.out.println("List Code size: "+code.size());
        System.out.println(call.amazonPromotion(cart, code));



    }
}
