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
		lst.search(2);
		lst.search(4);
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
			System.out.println("value is: " + temp.data);
			temp = temp.next;
		}
	}
	void count(){
		int count =0;
		Node temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		System.out.println(count);
	}
	void search(int key){
		Node temp =head;
		while(temp!=null){
			if(temp.data == key){
				System.out.println(key + ":is found");
				break;
			}
			temp =temp.next;
		}
		if(temp==null) System.out.println(key + ":is not found");
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