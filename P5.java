/*
5)Program to define a thread for print ing text on output screen for ‘n’ number of times.
Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor.
Example:   
i.  First thread prints “COVID19” 10 times. 
ii. Second thread prints “LOCKDOWN2020” 20 times 
iii. Third thread prints “VACCINATED2021” 30 times   
*/
import java.util.*;

class A extends Thread
{
    String msg="";
    int  n;
    A(String msg,int n)
    {
        this.msg=msg;
        this.n=n;
    }

    public void run()
    {
            for(int i=1;i<=n;i++)
            {
                System.out.println(msg+" "+i+" times");
            }
            System.out.println("\n ");
    }
}
class P5
{
    public static void main(String a[])
    {   
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Threads:");
        int n=sc.nextInt();

        A t1=new A("COVID19",n);
        t1.start();

        A t2=new A("LOCKDOWN2020",n+10);
        t2.start();
        
        A t3=new A("VACCINATED2021",n+20);
        t3.start();
    }
}
