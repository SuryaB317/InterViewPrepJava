package Array;

public class FindMissingNumber {

    public static  void  main(String[] args){

        int[] arr = {1,2,3,4,5};
        int result = -1;



        if (arr[0] != 1) {
            result = 1;
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] + 1 != arr[i + 1]) {
                    result = arr[i] + 1;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
