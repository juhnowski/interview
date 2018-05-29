package com.juhnowski.q3;

import java.util.*;
import java.io.*;

public class CheckPermutations {
    public static boolean isPermutationArray(String s1, String s2)
    {
        char[] a = s1.toCharArray();
        char[] b =
                s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (a.length != b.length)  return false;

        for (int i = 0; i < a.length;
             i++)
        {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPermutationArrayList(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        ArrayList<Character> a = new ArrayList<Character>();
        ArrayList<Character> b = new ArrayList<Character>();
        for (char c : s1.toCharArray()) {
            a.add(c);
        }
        for (char c : s2.toCharArray()) {
            b.add(c);
        }
        Collections.sort(a);
        Collections.sort(b);
        return a.equals(b);
    }

    public static boolean isPermutationContains(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        String s3 = s1 + s1;
        return s3.contains(s2);
    }

    public static void main(String[] args)
    {
        System.out.println("Вариант №1");
        System.out.println(isPermutationArray("test", "estt"));
        System.out.println(isPermutationArray("testt", "estt"));
        System.out.println("Вариант №2");
        System.out.println(isPermutationArrayList("test", "estt"));
        System.out.println(isPermutationArrayList("testt", "estt"));
        System.out.println("Вариант №3");
        System.out.println(isPermutationContains("test", "estt"));
        System.out.println(isPermutationContains("testt", "estt"));
    }
}

