public class SearchInRotatedArray {
   /*
   ## NOTE = THIS IS THE NAIVE APPROACH TO SOLVE  THIS PROBLEM WITH TIME COMPLEXITY OF (n +log n).
   This approach first will find the max element int the array and it will search in two half of the array one is the ascending part and the next
   in the descending part

    public static int max(int [] array){
        int max =Integer.MIN_VALUE;
        int index=0;

        for (int i =0 ;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
                index=i;
            }
        }
        return index;
    }
    public static int binarySearch(int [] array , int target, int low , int high){
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

    */
    public static int searchInRotatedArray(int [] array , int target){
//    THIS IS THE EFFICIENT WAY OF SOLVING THIS PROBLEM WITH
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (array[mid]==target)
                return mid;
            if (array[start]<array[mid]){
                if (target>=array[start] && target<array[mid]){
                      end=mid-1;
                }else {
                    start=mid+1;
                }

            }
            else {
                if (target>=array[mid] && target<array[end]){
                    start=mid+1;
                }else {
                    end =mid-1;
                }
            }

        }
        return -1;

    }
    public static void main(String [] args){
     int [] array = new int[]{10,20,30,40,50,8,9};
        System.out.println(searchInRotatedArray(array,8));
    }
}
