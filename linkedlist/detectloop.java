/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList lst = new LinkedList();
		lst.push(1);
		lst.push(2);
		lst.push(8);
		lst.push(4);
	//	lst.head.next.next.next.next = lst.head;
		lst.detectLoop();
	}
}
class LinkedList{
	Node head =null;
	void push(int data){
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		
	}
	
	void detectLoop(){
		Node temp1 = head;
		Node temp2 = head;
		while(temp1!=null && temp2 != null){
			temp1= temp1.next;
			temp2 = temp2.next.next;
			if(temp1 == temp2){
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
	}
	
} 
class Node{
	int data;
	Node next;
	Node(int d){
		data= d;
		next=null;
	}
}