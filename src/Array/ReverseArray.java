package Array;

public class ReverseArray {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int right = arr.length-1;


        for (int left = 0; left < arr.length; left++) {

            if(left < right){
                int temp  = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }

        }


        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
