/*	
2) Accept “n” integers from the user and store them into the collection. Display them in the sorted order. 
The collection should not accept duplicate elements (Use suitable collection).
Search for the particular element using predefined search method in the collection framework.
*/
import java.util.*;
class P2
{
    public static void main(String[] args) throws Exception
    {
        int n,ele,i;
        Scanner sc = new Scanner(System.in);
        TreeSet ts = new TreeSet();
        System.out.println("Enter The No. Of Elements :");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the elements : ");
            ele=sc.nextInt();
            ts.add(ele);
        }
                       
        System.out.println("The elements in sorted order :"+ts);       
        System.out.println("Enter element to be serach : ");
        ele = sc.nextInt();
        if(ts.contains(ele))
        {
           System.out.println("Element is found.");
        }
        else
        {
            System.out.println("Element is NOT  found.");
        }
                                    
    }
}

