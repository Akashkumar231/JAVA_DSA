public class CountOnes {
        public static int CountOnes(int [] array , int start , int end ,int target){
          while (start<=end){
            int mid =(start+end)/2;
            if (array[mid]==0){
                start=mid+1;
            }
            else {
                if (mid ==0 || array[mid-1]!=array[mid]){
                    return array.length-mid;
                }
                else {
                    end =mid-1;
                }
            }

          }
          return 0;
        }
    public static void main(String[] args){
        int [] array = new int[]{0,0,1,1,1,1};
        System.out.println( CountOnes(array,0,array.length-1,1));
    }
}
