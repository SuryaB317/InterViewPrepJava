package String;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {

    public static int getCharCount(String str, char ch){
    int count = 0;

    for(int i=0; i< str.length(); i++){
        if(str.charAt(i) == ch){
            count++;
        }
    }
    return  count;
    }

    public static void main(String args[]){

        String str = "Surya";

        Map<Character, Integer> occurence =  new HashMap<>();

        for(char ch:str.toCharArray()){
            occurence.put(ch, occurence.getOrDefault(ch, 0)+1 );
        }
        System.out.println(occurence);

        System.out.println("Using Custom function: " + getCharCount("manusha", 'a'));



    }
}
