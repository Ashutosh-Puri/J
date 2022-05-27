/*  
Write a Java program to create a new tree set,
add some colors (string) and print out the tree set. 
*/
import java.util.*;
public class P1
{
  public static void main(String[] args) 
  {
    TreeSet<String> ts = new TreeSet<String>();

    ts.add("Red");
    ts.add("Green");
    ts.add("Orange");

    System.out.println("Tree set: ");
    System.out.println(ts);
 }
}


