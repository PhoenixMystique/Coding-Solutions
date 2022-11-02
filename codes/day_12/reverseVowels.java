package day_12;

import java.util.* ;
import java.io.*;

public class reverseVowels {
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }

    public static String reverseVowels(String s){
        String result="";
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                list.add(i);
            }
        }
        int j=list.size()-1;
        int k=0;
        for(int i=0;i<s.length();i++){
            if( k <list.size() && i==list.get(k) && j>-1  ){
                result +=s.charAt(list.get(j));
                j--;
                k++;
            }
            else{
                result +=s.charAt(i);
            }
        }
        return result;
    }
}