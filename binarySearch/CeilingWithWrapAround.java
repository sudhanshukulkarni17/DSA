package binarySearch;

public class CeilingWithWrapAround {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e', 'g', 'h', 'i'};
        System.out.println(arr[ceiling(arr, 'f' )]);
    }
    static int ceiling(char arr[], char target){

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

        return start%arr.length;
}
}
