//Note : In Binary Search the  array should be in sorting order .
public class BinarySearch {
    public static int binarySearch(int [] array , int target){
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int mid = (high+low)/2;
            if (array[mid]==target){
                return mid;
            }
            if (array[mid]>target){
                high = mid-1;
            }
            if (array[mid]<target){
                low = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] array = new int[]{10,20,30,40,50,60,75};
        System.out.println(binarySearch(array,75));

    }
}