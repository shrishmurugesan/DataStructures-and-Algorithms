package datastructures_practice;
import java.util.*;
public class ArrayPracticeTwo {
	
	public static void main(String a[])
	{
		int[] arr = generateRandomArray(10);
		
		printArray(arr);
		
		//insertAtIndex(20, 3 , arr);
		
		deleteAtIndex(3,arr);
		
		
		
	}
	
	private static int[] generateRandomArray(int length) {
		int[] arr = new int[length];
		
		Random generator = new Random();
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = generator.nextInt(99) + 1;
		}
		
		
		return arr;
	}

	static void printArray(int[] arr)
	{
		for(int i=0; i < arr.length ; i++)
		{
			
			System.out.println(i+" : "+arr[i]);
			
		}
	}
	
	
	static void insertAtIndex(int data, int i , int[] arr)
	{
		for(int j = arr.length-1;j>i;j--)
		{
			arr[j] = arr[j-1];
		}
		System.out.println("data value "+data+" inserted at "+i);
		arr[i] = data;
		printArray(arr);
		
	}
	
	static void deleteAtIndex(int i, int[] arr)
	{
		int size = arr.length;
		
		for(int j = i; j<arr.length-1;j++)
		{
			arr[j] = arr[j+1];
		}
		
		size--;
		System.out.println("Deleted value at index "+i);
		for(int j=0;j<size;j++)
		{
			System.out.println(j+" : "+arr[j]);
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
