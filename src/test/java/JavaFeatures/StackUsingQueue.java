package JavaFeatures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StackUsingQueue 
{
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	int top;		
			
	void push(int i)
	{
		q1.add(i);
		top ++;	
	}
	
	int pop()
	{
		while(q1.size()>1)
		{
			top = q1.remove();
			q2.add(top);
		}
		
		top = q1.remove();
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		
		return top;
		
	}
	
	void display() 
	{
		
		q1.forEach((element) -> System.out.println("Stack Elements are:  " + element));
		
	}
	
	 public static void main(String[] args) {
		
		 StackUsingQueue stack = new StackUsingQueue();

		 stack.push(2);
		 stack.push(5);
		 stack.push(10);
		 stack.push(8);
		 stack.push(6);
		 
		 stack.display();
		 System.out.println();
		 System.out.println("Removing element: " + stack.pop());
		 System.out.println("Removing element: " + stack.pop());
		 System.out.println("Removing element: " + stack.pop());
		 System.out.println("Removing element: " + stack.pop());
		 System.out.println("Removing element: " + stack.pop()); 
		 
	}
  
  
}
