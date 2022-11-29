
import java.util.Scanner;

public class  Array_Dsa{
public static int searchTarget(int [] array , int target){
for(int i=0;i<array.length;i++){
if(array[i]==target){
return i;
}
}
return -1;
}
public static void main(String [] args){
int [] array = new int []{45,62,78,23,22};
Scanner input = new Scanner(System.in);
System.out.println("Enter the target =>");
int target = input.nextInt();
int position =searchTarget(array , target);
System.out.println("The index of the target i => " + position);
}
}
