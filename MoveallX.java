import java.util.*;

class Middle{

    public static void MoveallX(String str, int idx, int count, String moveallx){

        if(idx == str.length()){

            for(int i=0; i<count; i++){
                moveallx += 'x';
            }
            System.out.println(moveallx);
            return;
        }


        char currchar = str.charAt(idx);

        if(currchar == 'x'){
            count++;
            MoveallX(str, idx +1 , count, moveallx);
        }else{

            moveallx += currchar;
            MoveallX(str, idx + 1, count, moveallx);
        }
    }

    public static void main(String args[]){

        String str = "axbcxxd";
        MoveallX(str, 0, 0, "");
    }
}

