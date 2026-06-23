package String;

public class RemoveVowels {

    public static void main(String[] args){

        String vowels = "aeiouAEIOU";

        String word = "SuryaA";

        String answer = "";

        for (int i = 0; i < word.length(); i++) {

            char currentIndex = word.charAt(i);

            if(vowels.indexOf(currentIndex) == -1){
                answer += currentIndex;
            }
        }
        System.out.print(answer);

    }
}

