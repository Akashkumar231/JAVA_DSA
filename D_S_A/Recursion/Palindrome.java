import java.util.Scanner;
public class Palindrome{
public static boolean isPalindrome(String letter, int start , int end){
if(start>=end){
return true;
}
return  (letter.charAt(start) == letter.charAt(end)) &&  isPalindrome(letter, start+1, end-1);
}
public static void main(String [] args){
Scanner input = new Scanner(System.in);
String letter= input.next();
System.out.println(isPalindrome(letter, 0, letter.length()-1));
}

}
