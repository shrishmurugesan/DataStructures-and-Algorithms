package datastructures_practice;

public class Node {
	
	int data;
	Node left;
	Node right;
	
	Node()
	{
		this.data = 0;
		this.left = null;
		this.right = null;
		
	}
	
	Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public String toString()
	{
		return  "The value of this node is: "+data;
	}

}
