/*
4)Write a program to create link list of integer objects. Do the following:
i.  add element at first position
ii. delete last element
iii. display the size of link list
*/
public class P4 
{       
    class Node
    {    
        int data;    
        Node next;    
        public Node(int data) 
        {    
            this.data = data;    
            this.next = null;    
        }    
    }      
    public Node head = null;    
    public Node tail = null;    
    
    public void addNode(int data) 
    {      
        Node newNode = new Node(data);      
        if(head == null) 
        {     
            head = newNode;    
            tail = newNode;    
        }    
        else 
        {      
            tail.next = newNode;      
            tail = newNode;    
        }    
    }    
           
    public void display() 
    {      
        System.out.println("Nodes of singly linked list: "); 

        for(Node temp=head ; temp != null ;temp = temp.next) 
        {     
            System.out.print(temp.data + " ");    
               
        }    
    }    
        
    public static void main(String[] args) 
    {    
        P4 sList = new P4();    
           
        sList.addNode(1);    
       
        sList.display();    
    }    
}    
