public class MajorityElement {
    public static int majorityElement(int [] array ){
        int result =0,count=1;
        for (int i =1 ;i<array.length;i++){
            if (array[result] == array[i]){
                count++;
            }else {
                count--;
            }
            if (count==0){
                result=i;
                count=1;
            }
        }
        count=0;
        for (int i =0 ;i<array.length;i++){
            if (array[result] ==array[i]){
                count++;
            }
        }
        if (count<=array.length/2){
            return -1;
        }
        return result;
    }
    public static void main(String [] args){
        int [] array = new int [] {8,7,6,8,6,6,6,6};
        System.out.println(majorityElement(array));

    }
}
