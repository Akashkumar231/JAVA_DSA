import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static float medianOfTwoSortedArray(int [] array1 , int [] array2){
        int [] result = new int[array1.length+array2.length];
        int i =0,j=0,k=0;
       while (i<array1.length && j<array2.length){
           if (array1[i] <array1[j]){
               result[k]=array1[i];
               i++;
               k++;
           }else {
               result[k]=array2[j];
               k++;
               j++;
           }

       }
       while (i<array1.length){
           result[k]=array1[i];
           i++;
           k++;
       }
       while (j<array2.length){
           result[k]=array2[j];
           i++;
           k++;
       }
        System.out.println(Arrays.toString(result));
        int start =0;
        int end = result.length-1;
        int mid = (start+end)/2;
        if (result.length%2==0){

            float median = (result[mid] +result[mid+1])/2;
            return median;
        }
        return result[ (result[mid] +result[mid+1])/2];
    }
    public static void main(String [] args){

        int [] array1  = new int[]{10,20,30,40,50};
        int [] array2  = new int[]{5,15,25,35,45};
        System.out.println(  medianOfTwoSortedArray(array1,array2));;

    }
}
