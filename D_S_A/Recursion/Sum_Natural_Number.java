import java.util.Scanner;
public class Sum_Natural_Number{

public static int  method1(int n){
if(n==0){
return 0;
}
return n + method1(n-1);
}
public static void main(String[] args){
Scanner input = new  Scanner(System.in);
System.out.print("Enter the value of n :-> ");
int n = input.nextInt();
System.out.println(method1(n));
}
}
