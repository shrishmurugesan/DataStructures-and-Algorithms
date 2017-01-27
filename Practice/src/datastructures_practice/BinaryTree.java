package datastructures_practice;

public class BinaryTree {
	
	Node root;
	
	BinaryTree()
	{
		root = null;
	}
	
	BinaryTree(int data)
	{
		root = new Node(data);
	}
	
	//first algorithm => addNode(int data)
	//creates a new node with data value specified, and adds it into the tree appropriately
	
	public void addNode(int data)
	{
		if(root == null)
		{
			root = new Node(data);
			System.out.println("New Node has been added as root with value "+data);
			return;
		}
		
		Node parent;
		Node focus = root;
		
		while(true)
		{
			parent = focus;
			if(data < focus.data)
			{
				focus = focus.left;
				if(focus == null)
				{
					parent.left = new Node(data);
					System.out.println("new Node has been added as left leaf with value "+data);
					return;
						
				}
			}
			else if(data > focus.data)
			{
				focus = focus.right;
				if(focus == null)
				{
					parent.right = new Node(data);
					System.out.println("new Node has been added as right leaf with value "+data);
					return;
				}
			}
			else
			{
				//this means focus is  equal to the data member to be added
				if(focus.right == null)
				{
					focus.right = new Node(data);
				}
				else if(focus.left == null)
				{
					focus.right = new Node(data);
				}
				else
				{
					// focus is equal to data but both children are occupied by nodes
					focus = focus.left;
					parent.left = new Node(data);
					parent.left.left = focus;
				}
			}
		}
		
		//focus = new Node(data);
		
	}
	
	public void addAllNodes(int[] arr)
	{
		for (int i : arr) {
			addNode(i);
		}
	}
	
	// In Order traversal should return values in ascending order
	public void inOrderTraverse()
	{
		
		inOrderTraverse(root);
		
		
		
	}
	public void inOrderTraverse(Node root)
	{
		if (root==null)
		{
			//System.out.println("no nodes to traverse in BinaryTree");
			return;
		}
		
		if(root != null)
		{
			
			//Node focus = root;
			inOrderTraverse(root.left);
			System.out.print(root.data+", ");
			inOrderTraverse(root.right);
		}
		
	}
	
	public void preOrderTraverse()
	{
		preOrderTraverse(root);
	}
	
	public void preOrderTraverse(Node root)
	{
		if(root == null)
		{
			//System.out.println("root is null");
			return;
		}
		else
		{
			Node focus = root;
			
			System.out.print(focus.data+", ");
			preOrderTraverse(focus.left);
			preOrderTraverse(focus.right);
		}
		
	}
	
	public void postOrderTraverse()
	{
		postOrderTraverse(root);
	}
	
	public void postOrderTraverse(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			Node focus = root;
			
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.print(focus.data+", ");
		}
	}
		
		
	public void findNode(int key)
	{
		Node focus = root;
		
		while(focus != null)
		{
			if(focus.data == key)
			{
				System.out.println("They key "+key+" is present in the tree");
				return;
			}
			else if(key < focus.data)
			{
				focus = focus.left;
				continue;
			}
			else
			{
				focus = focus.right;
				continue;
			}
		}
		System.out.println("They key "+key+" is not present in the tree");
	}
	
	public int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}
		
		else
		{
			return 1 + Math.max(height(root.left),height(root.right));
		}
	}
	
	public void levelOrderTraverse()
	{
		levelOrderTraverse(root);
	}
	
	public void levelOrderTraverse(Node root)
	{
		int height = height(root);
		
		for(int i = 1; i<= height; i++)
		{
			printGivenLevel(root,i);
			System.out.println();
		}
		
	}

	public void printGivenLevel(Node root, int i) {
		
		
		if(root == null)
		{
			return;
		}
		
		if(i == 1)
		{
			System.out.print(root.data+" ");
		}
		
		else
		{
			printGivenLevel(root.left, i-1);
			printGivenLevel(root.right, i -1);
		}
		
	}
	

}
