package binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int arr1[] = {10,9,8,7,6,5,4,3,2,1};

        System.out.println(orderAgnosticBinarySearch(arr1, 1));
    }

    static int orderAgnosticBinarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length -1 ;
        boolean isAsc = true;
        if(arr[0] > arr[arr.length -1])
            isAsc = false;


        while(start <= end){
            int mid = ( start + end )/ 2;
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1 ;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
                if(target==arr[mid])
                    return mid;
            }else{
                if(target > arr[mid]){
                    end = mid - 1 ;
                }else if(target < arr[mid]){
                    start = mid + 1;
                }
                if(target==arr[mid])
                    return mid;
            }
        }
        return -1 ;
    }
}
