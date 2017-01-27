package datastructures_practice;

public class BinaryTreeDriver {
	
	public static void main(String a[])
	{
		BinaryTree tree = new BinaryTree();
		
		int[] toBeAdded = {12, 45, 32, 56, 77, 4, 78, 23, 95, 34, 62, 35 ,31, 96, 86};
		
		BinaryTree tree2 = new BinaryTree();
		
		
		
		
		tree.addAllNodes(toBeAdded);
		
//		System.out.println(tree.root);
//		System.out.println(tree.root.right);
//		System.out.println(tree.root.left);
//		System.out.println("In order traversal (ascending order sort)");
//		tree.inOrderTraverse();
//		System.out.println("\npre order traversal (root first)");
//		tree.preOrderTraverse();
//		System.out.println("\npost order traversal (root last) ");
//		tree.postOrderTraverse();
		tree.levelOrderTraverse();
//		tree.findNode(46);
	}

}
