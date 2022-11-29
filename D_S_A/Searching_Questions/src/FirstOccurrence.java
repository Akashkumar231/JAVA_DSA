public class FirstOccurrence {
    public static int firstOccurrence(int [] array , int low , int high ,int target){
      if (low>high){
          return -1;
      }
      int mid = (low+high)/2;
      if (array[mid]>target)
          return firstOccurrence(array,low, mid-1,target);
      else if (array[mid]<target){
          return firstOccurrence(array,mid+1,high,target);
      }else {
          if (mid==0 || array[mid-1]!=target){
              return mid;
          }
          else {
              return firstOccurrence(array,low, mid-1,target);
          }
      }
    }
    public static void main(String[] args){
        int [] array = new int[]{10,10,10,20,20,40,50,60};
        System.out.println(firstOccurrence(array,0,array.length-1,10
        ));

    }
}
