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
		lst.nth(5);
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
	void nth(int key){
		int count = key;
		if(key<1) return;
		Node  temp = head;
		while(temp!= null){
			if(count==1){
				System.out.println("value is" + temp.data);
				return;
			}
			count--;
			temp = temp.next;
		}
		System.out.println("not found");
		
		
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