package day1;

import java.util.HashSet;

class eliminating_all_the_repeated_characters {
    public static void main(String[] args) {

      checkRepSeq2("abbbc");
      checkRepSeq("aaabbcc");
    }

    static void checkRepSeq(String s){
        HashSet<Character> map = new HashSet<>();
        map.add(s.charAt(0));
        System.out.print(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(!map.contains(s.charAt(i))){
                System.out.print(s.charAt(i));
                map.clear();
                map.add(s.charAt(i));
            }
        }
        }


    static void checkRepSeq2(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.print(s.charAt(i));
            }
        }
        if(s.charAt(s.length()-1)!=s.charAt(s.length()-2)){
            System.out.print(s.charAt(s.length()-1));
        }
    }
    }



