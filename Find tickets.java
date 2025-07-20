

import java.util.*;


class Hash{


    public static String getstart(HashMap<String, String> map){

        HashMap<String, String> revmap = new HashMap<>();

        for(String key : map.keySet()){
           revmap.put(map.get(key), key);
        }

       for(String key : map.keySet()){
        if(!revmap.containsKey(key)){
            return key;
        }

       }
       return null;
    }

    public static void main(String args[]){


        HashMap<String, String> tickets = new HashMap<>();

    

             tickets.put("Chennai", "Bengaluru");
             tickets.put("Mumbai", "Delhi");
             tickets.put("Goa", "Chennai");
             tickets.put("Delhi", "Goa");


             String start = getstart(tickets);


             while(tickets.containsKey(start)){
                System.out.println(start);
                start = tickets.get(start);
             }
             System.out.println(start);
    }
}
