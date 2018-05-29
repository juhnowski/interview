package com.juhnowski.q10;

import java.util.HashMap;

public class RepeatCounter {

    HashMap<String, Integer> calculate(String str){
        HashMap<String, Integer> result = new HashMap<>();
        String[] res = str.split("[\\p{Punct}\\s]+");
        for (String s1:res){
            String s = s1.toLowerCase();
            Integer i = result.get(s);
            if (i==null){
                result.put(s,1);
            } else {
                result.put(s,++i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String test = "Учиться, учиться, учиться и еще раз учиться.";
        RepeatCounter repeatCounter = new RepeatCounter();
        HashMap<String, Integer> result = repeatCounter.calculate(test);
        result.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
