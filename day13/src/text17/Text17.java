package text17;

import java.util.HashSet;

public class Text17 {

    public static void main(String[] args) {
        String [] array1 = {"a","b","a","c","d"};
        String [] array2 = { "e","f","a","d","g"};
        HashSet<String> hst = new HashSet<>();
        for ( String str :array1 ){
            hst.add(str);
        }
        for ( String str2 :array2 ){
            hst.add(str2);
        }
        System.out.println(hst);
    }


}
