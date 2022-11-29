public class NumberOfOccurrence {
    public static int numberOfOccurrence(int [] array , int start , int end , int target){
        int lastOccurrence = LastOccurrence.lastOccurrence(array,0,array.length-1,target);
        int firstOccurrence = FirstOccurrence.firstOccurrence(array,0,array.length-1,target);
        int sum =lastOccurrence-firstOccurrence;
        if (sum==0)
            return 0;
        return (lastOccurrence-firstOccurrence)+1;
    }
    public static void main(String[] args){
        int [] array = new int[]{10,20,20,20,30,30};
        System.out.println(""+(numberOfOccurrence(array,0, array.length-1,2  )));
    }
}
