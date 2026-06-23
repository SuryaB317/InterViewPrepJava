package String;

public class AreRotations {

    public static void main(String[] args){
        String str1 = "abcd";
        String str2 = "cdba";

        System.out.print(areRoations(str1, str2));
    }


    public static boolean areRoations(String str1,String str2){
        String concatOfBothStrings = str1 + str1;

        if(str1.length() != str2.length()){
            return  false;
        }

        if(concatOfBothStrings.contains(str2)){
            return true;
        }
        return false;
    }


}
