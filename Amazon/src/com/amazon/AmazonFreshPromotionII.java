package com.amazon;

import java.util.List;

public class AmazonFreshPromotionII {

    public int amazonPromotion(List<String> shoppingCart, List<List<String>> listCode){
        int cart_index=0;
        int code_index = 0;

        while(cart_index < shoppingCart.size() && code_index < listCode.size()){
            String str = shoppingCart.get(cart_index);

                int index=0;
               List<String> codes = listCode.get(code_index);
               System.out.println("Codes from getCodes: "+codes);

               if((codes.get(code_index).equals("anything") || codes.get(code_index).equals(str)) && hasOrder(shoppingCart,cart_index, codes)){
                System.out.println("I'm inside this conditional");

                   cart_index += codes.size();
                   code_index++;

               }else{
                   cart_index++;
                   //System.out.println("cart index : "+cart_index);
               }

        }
        //System.out.println("Code index: "+code_index);
        return code_index == listCode.size() ? 1 : 0;
    }

    private boolean hasOrder(List<String> shoppingCart, int cart_index, List<String> listCode){
//          System.out.println("List code: "+listCode);
//        System.out.println("cart index: "+shoppingCart.get(cart_index));
//        System.out.println("cart index: "+shoppingCart.get(cart_index++));

        for(String str: listCode){
            System.out.println("str: "+str);
            if(cart_index < shoppingCart.size() && (str.equals("anything") || shoppingCart.get(cart_index).equals(str))){
                cart_index++;
                //System.out.println("cart index : "+cart_index);
            }else{
                return false;
            }
        }
        return true;
    }

    public List<String> getCodes(List<List<String>> listCodes, int index){

        while(index-- <=0){
            for (List<String> codes : listCodes){
                return codes;
            }
        }

        return null;
    }


}
