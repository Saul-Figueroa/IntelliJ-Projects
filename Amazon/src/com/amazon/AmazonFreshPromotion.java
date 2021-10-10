package com.amazon;

import java.util.List;

public class AmazonFreshPromotion {
    public int amazonPromotion(String [] shoppingCart, String [][] codeList){

        //Check edege cases
        //if codeList is empty the customer is winner, return 1
        if(codeList == null || codeList.length == 0) return 1;
        // if shopping cart is empty the custumer is not a winner
        if(shoppingCart == null || shoppingCart.length == 0) return 0;

         //use two pinter
        int code_index=0;
        int cart_index=0;

        while(cart_index < shoppingCart.length && code_index < codeList.length){

            String str = shoppingCart[cart_index];
            System.out.println(str);
        //if the first fruit on the code list is anything or if it matches the current fruit at the cart
            if((codeList[code_index][0].equals("anything") || codeList[code_index][0] .equals(str)) && hasOrden(shoppingCart,codeList[code_index], cart_index)){


                cart_index += codeList[code_index++].length;
                //System.out.println("cart index : "+cart_index);
            }else{
                cart_index++;
                //System.out.println("cart index : "+cart_index);
            }
        }


        //if all the code list is present return 1, else return 0
        return code_index == codeList.length ?1:0;
    }

    private boolean hasOrden(String [] shoppingCart, String [] order, int cart_index){
        //Loop through the code list to check if the fruits are in order
        System.out.println("corder : "+order[0]);
        System.out.println("corder : "+order[1]);

        for(String str: order){
            if(cart_index < shoppingCart.length && (str.equals("anything") || shoppingCart[cart_index].equals(str))){
                cart_index++;
                //System.out.println("cart index : "+cart_index);
            }else{
                return false;
            }
        }
        return true;
    }
}
