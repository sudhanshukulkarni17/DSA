package binarySearch;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,3,1};
        System.out.println(arr[peakIndex(arr)]);
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
}
