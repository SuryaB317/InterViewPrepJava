package Array;

public class MoveZeros {

    public static  void main(String[] args){

        int[] arr = {1,0,2,0,3,0,4,5};

        int right = 0;
        int target = 0;
//        for (int left=0; left< arr.length; left++) {
//           if(arr[left] != target){
//               int temp = arr[left];
//               arr[left] = arr[right];
//               arr[right] = temp;
//               right++;
//           }
//        }

        int nonZeroIndex = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0 ){
                arr[nonZeroIndex++] = arr[i];
            }
        }

        while(nonZeroIndex < arr.length){
            arr[nonZeroIndex++] = 0;
        }

        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
