package binarySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9,10};
        System.out.println(arr[ceiling(arr, 7)]);
    }

    static int ceiling(int arr[], int target){

        int start = 0;
        int end = arr.length -1 ;

        while(start <= end){
            int mid = (start + end) / 2;
//            System.out.println(mid + " " + start + " " + end);

            if(target < arr[mid]){
                end = mid - 1 ;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            if(target==arr[mid])
                return mid;
        }

        return start;
    }
}
