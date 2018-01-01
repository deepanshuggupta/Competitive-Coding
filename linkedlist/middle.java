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
		lst.push(10);
		lst.middle();
	}
}
class LinkedList{
	Node head =null;
	void push(int data){
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		
	}
	
	void display(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp + "value is: " + temp.data);
			temp = temp.next;
		}
	}
	void middle(){
		int length=0;
		Node  temp = head;
		while(temp!= null){
			length++;
			temp = temp.next;
		}
		int mid = length%2==1?(int) Math.ceil(length/2):(length/2)+1;
		System.out.println(mid);
		temp = head;
		while(temp!= null){
			if(mid==1){
				System.out.println("value is" + temp.data);
				return;
			}
			mid--;
			temp = temp.next;
		}
		
		
		
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