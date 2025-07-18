
import java.util.*;

class Middle{

    public static boolean [] map = new boolean [25];

    public static void D(String str, int idx, String newstr){


        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }


        char currchar = str.charAt(idx);

        if(map[currchar - 'a']){ // = true // true match is remove them

          D(str, idx + 1, newstr);

        }else{

            newstr += currchar;
            map[currchar - 'a'] = true;
            D(str, idx + 1, newstr);
        }
    }

    public static void main(String args[]){

        String str = "abbccda";
        D(str, 0, "");
    }
}
