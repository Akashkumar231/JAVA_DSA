public class PeakElementInArray {
    public static int getPeakElement(int [] array ){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (start+end )/2;
            if (( mid == 0 || array[mid-1] <= array[mid] ) && ( mid == array.length-1 || array[mid+1]<=array[mid]  )){
                return mid;
            }
            if(mid>0 && array[mid-1]>array[mid]){
                end =mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
     int [] array = new int[]{5,20,40,30,20,50,60};
        System.out.println(getPeakElement(array));

    }
}
