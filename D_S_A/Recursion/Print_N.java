//This program will perform or illustrate the example of RECURSION
public class Print_N{
public static void print1(int n ){
if(n==0){
return;
}
print1(n-1);
System.out.println(n);
}
public static void print2(int n ){
if(n==0){
return;
}

System.out.println(n);
print2(n-1);
}
public static void main(String [] args){
print1(10);
print2(10);
}
}
