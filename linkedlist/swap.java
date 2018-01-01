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
		lst.push(3);
		lst.push(4);
		lst.display();
		//lst.swap(2,4);
		//lst.display();
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
	void swap(int key1, int key2){
		if(key1 ==key2) return;
		Node temp = head;
		Node temp1 = null;
		Node temp2 = null;
		while(temp != null ){
			if(temp.data==key1){
				temp1 = temp;
			}
			else if(temp.data==key2){
				temp2 = temp;
			}
			temp = temp.next;
		}
		if(temp1 == null || temp2 == null){
			System.out.println("Not found");
			return;
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