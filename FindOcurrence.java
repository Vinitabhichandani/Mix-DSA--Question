import java.util.*;

class Middle{

    public static int first = -1;
    public static int last = -1;

    public static void FindOcurrence(int idx, String str , char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

         char currchar = str.charAt(idx);

        if(currchar == 'a'){

            if(first == -1){

                first = idx;
            }else{
                last = idx;
            }
        }

        FindOcurrence(idx + 1, str, element);
    }

    public static void main(String args[]){

        String str = "abaacdaefaah";

        FindOcurrence(0, str, 'a');
    }
}

