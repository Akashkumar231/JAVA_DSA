import java.util.Arrays;

public class SelectionSort {
    public static void swap(int [] array , int first , int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }
    public static void selectionSort(int [] array){
        if (array.length == 0){
            
            return;  //Condition Check if array length is 0 then it will simply returns.
        }
        int minValue ;
        int minIndex=0;
        for (int i =0 ;i<array.length;i++){
            minValue = Integer.MAX_VALUE;
            for (int j = i;j<array.length;j++){
                if (minValue>array[j]){
                    minValue =array[j];
                    minIndex=j;
                }
            }
            swap(array,minIndex,i);
        }
    }
    public static void main(String [] args)
    {
        int [] array = new int [] {20,200,62,42,10,95};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
