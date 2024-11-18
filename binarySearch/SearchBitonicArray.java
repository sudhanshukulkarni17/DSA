package binarySearch;

public class SearchBitonicArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,3,1};
        System.out.println(orderAgnosticBinarySearch(arr, 0, peakIndex(arr), 4));;
        System.out.println(orderAgnosticBinarySearch(arr, peakIndex(arr), arr.length -1, 4));

    }
    static int peakIndex(int arr[]){
        int start = 0;
        int end = arr.length -1 ;

        while(start <= end){
            int mid = (start + end) / 2;
            System.out.println(mid + " " + start + " " + end);

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1 ;
            }else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            if(start==end)
                return start;
        }

        return -1;

    }

    static int orderAgnosticBinarySearch(int arr[], int start, int end, int target)
    {
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

