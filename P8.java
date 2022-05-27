/*
8) Write a program to calculate the sum and the average of an array of 1000 integers (generate randomly) 
using 10 threads. Each thread calculates the sum of 100 integers. Use these values to calculate average.
 [use join method]
*/
import java.util.*;
class Temp implements Runnable
{
    Thread t;
    int i,no,sum;
    int a[]=new int[1000];
    Temp(String s,int n)
    {
        Random rs = new Random();
        t=new Thread(this,s);
        no=n;
        int j=0;
        for(i=1;i<=1000;i++)
        {
            a[j]=rs.nextInt()%100;;
            j++;
        }
        t.start();
    }

    public void run() 
    {
        for(i=0;i<100;i++)
        {
            sum=sum+a[no];
            no++;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Avg ="+sum/100);
    }
           
}

public class P8
{
    public static void main(String[] arg) throws InterruptedException
    {
        Temp t1=new Temp("g",1);
        t1.t.join();

        Temp t2=new Temp("r",100);
        t2.t.join();

        Temp t3=new Temp("s",200);
        t3.t.join();

        Temp t4=new Temp("t",300);
        t4.t.join();

        Temp t5=new Temp("p",400);
        t5.t.join();

        Temp t6=new Temp("p",500);
        t5.t.join();

        Temp t7=new Temp("p",600);
        t5.t.join();

        Temp t8=new Temp("p",700);
        t5.t.join();

        Temp t9=new Temp("p",800);
        t5.t.join();

        Temp t10=new Temp("p",900);
        t5.t.join();
    }
}
