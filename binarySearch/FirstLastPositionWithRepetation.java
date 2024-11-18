package binarySearch;

public class FirstLastPositionWithRepetation {
    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7, 7, 7, 7, 7, 7};
        System.out.println(binarySearch(arr, 7, true));
        System.out.println(binarySearch(arr, 7, false));
    }

//    static int[] findingStartEndIndex(int arr[], int target){
//
//    }

    public static int binarySearch(int arr[], int target, boolean findStartIndex){

        int start = 0;
        int end = arr.length -1 ;
        int ans = -1;

        while(start <= end){
            int mid = (start + end) / 2;
            System.out.println(mid + " " + start + " " + end);

            if(target < arr[mid]){
                end = mid - 1 ;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            if(target==arr[mid]) {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return ans;

    }
}
