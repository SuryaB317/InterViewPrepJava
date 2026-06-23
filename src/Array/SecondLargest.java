package Array;

public class SecondLargest {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        int largest = 0;
        int secondLargest = 0;

        for(int i=0;i< arr.length;i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest =arr[i];
            }
            else if(i > secondLargest && i != largest){
                secondLargest = arr[i];
            }
        }
        System.out.print(secondLargest);
    }
}
