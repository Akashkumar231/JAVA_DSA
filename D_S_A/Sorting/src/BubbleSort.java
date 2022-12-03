import java.util.Arrays;

public class BubbleSort {
    public static void swap(int [] array , int first , int second){
        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;
    }
    public static void bubbleSort(int [] array ){
//        The time complexity of the bubble sort is O(n2)
        if (array.length==0) {
            // This condition will check if the length of the array is 0 , then it will simply returns to the main function
            return;
        }
        boolean isSorted = true;
        for (int i =0;i<array.length;i++){
            for (int j =1 ; j<array.length - i;j++){
                if (array[j]<array[j-1]) {
                    swap(array, j, j - 1);
                    isSorted =false;
                }
            }
            if (isSorted==true)
                return;
        }
    }
    public static void main(String [] args ){
        int [] array = new int [] {20,200,62,42,10,95};
        bubbleSort(array);
        System.out.println(
                Arrays.toString(array)
        );
    }
}
