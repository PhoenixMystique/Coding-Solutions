package day7;

public class checkStringRotation {
    public static void main(String[] args) {
        System.out.println(isCyclicRotation("abac", "baca"));
    }
    public static int isCyclicRotation(String p, String q)  {
        int last = p.length()-1;
        for(int i=0; i<p.length(); i++){
           p = p.charAt(last) + p.substring(0,last);
            if(p.equals(q)){
                return 1;
            }
        }
        return 0;
}

}

