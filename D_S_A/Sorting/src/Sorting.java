import java.util.Arrays;
public class  Sorting{
    public static void main(String[] args) {
       int [] array1 = new int[]{56,68,69,70,39};
       char [] array2  = new char[]{'d','e','f','g'};
       Arrays.sort(array1); // These Arrays.sort method is already define in the Arrays class.
       Arrays.sort(array2);// It is used to sort the primitive type of the array
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}