public class SquareRoot {
    public static int findSquareRoot(int number){
        int low =1,high = number,ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            int midSq =mid*mid;
            if (midSq==number){
                return mid;
            }
            if (midSq>number){
                high=mid-1;
            }
            if (midSq<number){
                low=mid+1;
                ans =mid;
            }

        }
        return ans;
    }
    public static void main(String [] args){
     int number =24;
        System.out.println(findSquareRoot(number));
    }
}
