import java.util.*;

public class KeyPad {

    public static String[] keypad = { ". ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    public static void printcombination(int idx, String str, String combina) {  // new functions

        if( idx == str.length()){ // base case
            System.out.println(combina);
                return;
            }
    
            char currchar = str.charAt(idx);
            String mapping = keypad[currchar - '0'];
    
                for (int i = 0; i < mapping.length(); i++) {
                    printcombination(idx + 1, str, combina + mapping.charAt(i));
                }
            }
    
            public static void main(String args[]){ // main functions
            String str = "32";
              printcombination(0, str, "");

            }
            
}








