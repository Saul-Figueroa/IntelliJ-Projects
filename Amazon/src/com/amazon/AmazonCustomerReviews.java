package com.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonCustomerReviews {

    public static void main(String[] args) {
        String [] repo = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String customerQuery="mouse";
        List<String> repository= new ArrayList<>();

        repository = Arrays.asList(repo);
        System.out.println(reviews(repository, customerQuery));
    }

    //repository = ["mobile", "mouse", "moneypot", "monitor", mousepad]
    //customerQuery = "mouse"
    //output
    //["mobile", "moneypot", "monitor"] -> mo
    //["mouse", "mousepad"]             -> mou
    //["mouse", "mousepad"]             -> mous
    //["mouse", "mousepad"]             -> mouse

    public static List<List<String>> customerReviews(List<String> repository, String customerQuery){
        List<List<String>> result = new ArrayList<>();
        //Create a sorted repository
        List<String> sortedRepository = new ArrayList<>();
        for(String word: repository){
            sortedRepository.add(word.toLowerCase());
        }
        Collections.sort(sortedRepository);

        //type at least 2 characters i=2
        for(int i=2; i<= customerQuery.length(); i++){
            String tmp_query = customerQuery.substring(0, i).toLowerCase();
            List<String> tmp_result = new ArrayList<>();
            for(String word : sortedRepository){
                if(word.startsWith(tmp_query) && tmp_result.size() <3){
                    tmp_result.add(word);
                }
            }

            result.add(tmp_result);
        }

        return result;

    }

    //Using stream
    public static List<List<String>> reviews(List<String> repository, String customerQuery){
        List<List<String>> result = new ArrayList<>();

        for(int i =2; i<= customerQuery.length(); i++){
            String str = customerQuery.substring(0, i).toLowerCase();
            List<String> wordsList = repository.stream()
                    .map(String :: toLowerCase)
                    .filter(word -> word.startsWith(str))
                    .sorted()
                    .limit(3)
                    .collect(Collectors.toList());

                    result.add(wordsList);
        }

        return result;
    }



}
