package binarySearch;

public class InfiniteSortedArrayBinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int start= 0;
        int end = 1;
        int result=0;
        while(result!=-1){

            int temp = start;
            start = end + 1;
            end = (end - temp + 1)* 2 + end;
//            System.out.println( + start + " " + end);
            result=binarySearchInfiniteArray(arr, start, end, 6);
            if(result!=-1){
                System.out.println(result);
                break;
            }



        }

    }

    static int binarySearchInfiniteArray(int arr[], int start, int end, int target){
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

        return -1;

    }
}
