public class LastOccurrence {
    public static int lastOccurrence(int [] array , int low , int high ,int target){
        if (low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if (array[mid]>target)
            return lastOccurrence(array,low, mid-1,target);
        else if (array[mid]<target){
            return lastOccurrence(array,mid+1,high,target);
        }else {
            if (mid==array.length-1 || array[mid+1]!=target){
                return mid;
            }
            else {
                return lastOccurrence(array,mid+1, high,target);
            }
        }
    }
    public static void main(String[] args){
        int [] array = new int[]{10,10,10,20,20,40,50,60};
        System.out.println(lastOccurrence(array,0,array.length-1,10));

    }
}
