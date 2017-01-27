package datastructures_practice;
import java.util.Random;

public class ArrayPractice {
	
	

	public static void main(String a[])
	{
		ArrayStructure arr = new ArrayStructure();
//		System.out.println(arr.size);
		
		arr.generateArray();
//		System.out.println(arr.arr.length);
		arr.deleteAtIndex(5);
		System.out.println(arr.arr.length);
		arr.insertAtIndex(99, 4);
		arr.findValue(5);
	}
}

class ArrayStructure{
	int size = 10;
	int[] arr = new int[size];
	
	ArrayStructure()
	{
	}
	
	public void generateArray()
	{
		Random rand = new Random();
		
		for (int i = 0; i < size; i++) {
			arr[i]= rand.nextInt(50)+1;
			
		}
		printArray();
	}
	// Prints the Array on the screen in a grid
//	
//		public void printArray(){
//			
//			System.out.println("----------");
//			
//			for(int i = 0; i < size; i++){
//				
//				System.out.print("| " + i + " | ");
//				
//				System.out.println(arr[i] + " |");
//				
//				System.out.println("----------");
//				
//			}
//			
//		}
	public void printArray()
	{
		System.out.print("Index: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.print("Value: ");
		for (int j = 0; j <size; j++) {
			System.out.print(+arr[j] +" ");
		
		}
		System.out.println();
		}
	public void deleteAtIndex(int i)
	{
		if(i<arr.length)
		{
			for (int j = i; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
		}
		size--;
		printArray();

	}
	
	public void insertAtIndex(int data, int i)
	{
		if(size < arr.length)
		{
			size++;
			for(int j=size-1;j>i;j--)
			{
			    arr[j]=arr[j-1];
			}
			arr[i] = data;
		}
		printArray();
	}
	
	public int findValue(int data)
	{
		int index = -1;
		for(int i=0; i<size;i++)
		{
			if(data == arr[i])
			{
				index = i;
			}
			
		}
		if(index == -1)
		{
			System.out.println("Element was not found. Index returned as -1");
		}
		return index;
		
	}
}
