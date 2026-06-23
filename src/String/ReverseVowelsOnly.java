package String;

public class ReverseVowelsOnly {
    public static void main(String[] args) {
        String word = "";
        System.out.println("Before: " + word);
        System.out.println("After: " + reverseVowels(word));
    }

    public static String reverseVowels(String str) {
        String vowels = "aeiouAEIOU";
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            while (vowels.indexOf(chars[left]) == -1) {
                left++;
            }

            while (vowels.indexOf(chars[right]) == -1) {
                right--;
            }


            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
