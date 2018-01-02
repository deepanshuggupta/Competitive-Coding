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
		lst.display();
		lst.reverse();
		lst.display();
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
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	void reverse(){
		Node temp = head;
		Node prev =null;
		while(temp.next != null){
			head = temp.next;
			temp.next = prev;
			prev = temp;
			temp =head;
		}
		head.next =prev;

		
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