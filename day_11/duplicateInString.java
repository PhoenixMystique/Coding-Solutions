package day_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Pair{
    int count;
    Character ch;
    Pair(Character ch, int count){
        this.ch=ch;
        this.count=count;
    }
}
public class duplicateInString {
        //O(Nlogn)
        static HashMap<Character,Integer> map;
        public static ArrayList<Pair> duplicate_char(String s, int n) {
            ArrayList<Pair> pair = new ArrayList();
            map = new HashMap();
            for(int i=0;i<s.length();i++){
                map.merge(s.charAt(i), 1, Integer::sum);
            }
            for (Map.Entry<Character,Integer> entry : map.entrySet()) {
                if(entry.getValue()>0){
                    pair.add(new Pair(entry.getKey(),entry.getValue()));
                }

            }
            return pair;
        }

        //In O(N)
            public static ArrayList<Pair> duplicate_char2(String s, int n) {
                ArrayList<Pair> list=new ArrayList<>();
                boolean isUpper=false;

                if(s.charAt(0)>='A' && s.charAt(0)<='Z')isUpper=true;

                int charFreq[]=new int[256];

                for(int i=0;i<s.length();i++){
                    char c=s.charAt(i);
                    if(isUpper)charFreq[c-'A']++;
                    else{charFreq[c-'a']++;}
                }

                for(int i=0;i<charFreq.length;i++){
                    int count=charFreq[i];
                    if(count>1){
                        char c;
                        if(isUpper){ c=(char)(i+'A');}
                        else{c=(char)(i+'a');}
                        list.add(new Pair(c,count));
                    }
                }
                return list;



}}
