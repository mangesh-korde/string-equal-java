/* Q. check both string equal or not.. if it is euals return true
  otherwise false
*/
import java.util.*;
class demo
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter First string:");
  String s1=sc.next();
  System.out.println("Enter second string:");
  String s2=sc.next();
  System.out.println("check="+(s1.equals(s2)));
 }
}