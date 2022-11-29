public class BinarySearchRecursion {
    public static int BinaryMethod(int [] array , int low , int high,int target){
       if (low<=high) {
           int mid = (low + high) / 2;
           if (array[mid] == target)
               return mid;
           if (array[mid] > target)
               return BinaryMethod(array, 0, mid - 1, target);
           else
               return BinaryMethod(array, mid + 1, high, target);
       }
       return -1;
    }
    public static void main(String[] args) {
        int [] array = new int[]{10,20,30,40};
        System.out.println(BinaryMethod(array,0,array.length-1,45));
    }
}
