import java.util.ArrayList;

// Question.1) Given a Sorted array and a sum , find if there is a pair with given sum

public class TwoPointerApproach {
    public static ArrayList<Integer> getPairs(int [] array , int target){
        ArrayList<Integer>  al = new ArrayList<>();
        int start = 0;
        int end = array.length-1;
        while (start<end){
            if (array[start] + array[end] > target){
                end--;
            } else {
                start++;
            }
            if (array[start] + array[end] == target){
                al.add(start);
                al.add(end);
                return al;
            }
        }
        return al;
    }
    public static ArrayList<Integer> getTriplets(int [] array , int target){
        ArrayList<Integer>  al = new ArrayList<>();
        int start = 0;
        int end = array.length-1;
        int mid = (start+end)/2;
        while (start<end){
            if (array[start] + array[end] +array[mid] > target){
                end--;
            }
            if (start == mid || mid == end){
                mid =(start+end)/2;

            }
            if (array[start]+array[end]+array[mid]<100){
                start++;
            }
            if ( start!=end){
                if(array[start] +array[mid] +array[end] ==target) {
                    al.add(start);
                    al.add(end);
                    al.add(mid);
                    return al;
                }
            }
        }
        return al;
    }

    public static void main(String [] args){
        System.out.println(getTriplets(new int [] {2,3,4,8,9,20,40},32));
    }
}
