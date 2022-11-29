public class SearchInInfiniteArray {
    /*
     public static int [] startAndEnd(int [] array, int number){
        int start =0;
        int end = 1;
        while (true){
            if (array[start] < number && number<=array[end] )
            {
                break;
            }
            start =end;
            end=()*2;
        }
        return new  int []{start,end};
    }
    public static int binarySearch(int [] array , int target, int low , int high){
        while (low<=high){
            int mid = (high+low)/2;
            if (array[mid]==target){
                return mid;
            }
            if (array[mid]>target){
                high = mid-1;
            }
            if (array[mid]<target){
                low = mid+1;
            }
        }

        return -1;
    }

     */
    public static int binarySearch(int [] array , int target, int low , int high){
        while (low<=high){
            int mid = (high+low)/2;
            if (array[mid]==target){
                return mid;
            }
            if (array[mid]>target){
                high = mid-1;
            }
            if (array[mid]<target){
                low = mid+1;
            }
        }

        return -1;
    }
    public static int searchInfiniteArray(int [] array , int number){
       if (array[0] == number){
           return 0;
       }
       int i =1;
       while (array[i]<number)
           i=i*2;
       if (array[i]==number)
           return i;
       return binarySearch(array,number,(i/2)+1,i-1);
    }
    public static void main(String [] args){
        System.out.println(searchInfiniteArray(new int [] {10,20,30,40,50,60},60)); // this will only work in infinite array else it will give the RuntimeException:
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 6
    }
}
