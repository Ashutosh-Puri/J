/*
3) Write a program to sort HashMap by keys and display the details 
before sorting and after sorting 
*/
import java.util.*;
class P3 
{
	static Map<String, Integer> map = new HashMap<>();
	public static void sort()
	{
		TreeMap<String, Integer> sorted = new TreeMap<>();

		sorted.putAll(map);

		for (Map.Entry<String, Integer> entry : sorted.entrySet())
        {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
	}
	public static void main(String args[])
	{
		map.put("Jayant", 80);
		map.put("Abhishek", 90);
		sort();
	}
}

