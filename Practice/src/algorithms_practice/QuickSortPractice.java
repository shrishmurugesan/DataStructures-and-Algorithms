package algorithms_practice;

import java.util.*;

public class QuickSortPractice {
	public static void main(String[] args) {
		int[] x = {12, 45, 32, 12, 56, 77, 4, 78, 23, 95, 34, 62, 35 ,31, 96, 86, 78,45};
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
		int count = 0;
 
		count = quickSort(x, low, high, count);
		System.out.println(Arrays.toString(x));
		System.out.println("No. of swaps performed: "+count);
	}
 
	public static int quickSort(int[] arr, int low, int high, int count) 
	{
		if(arr.length == 0 )
		{
			return count;
		}
		
		if(low >= high)
		{
			return count;
		}
		
		//initialize i and j pointers
		int i = low;
		int j = high;
		
		//determine the pivot
		int mid = (low + high) / 2;
		int pivot = arr[mid];
//		System.out.println("pivot:"+pivot);
		
		//traverse and swap to ensure left is smaller than pivot and right is larger than pivot
		
		while(i<=j)
		{
			while(arr[i] < pivot)
			{
//				System.out.println("i:"+i);
				i++;
			}
			while(arr[j] > pivot)
			{
//				System.out.println("j:"+j);
				j--;
			}
			
			// at this point, i and j will both be pointing to values greater and lower than pivot respectively. i.e: they should be swapped
			
			if(i<=j) // we check again here because at the LAST iteration before the parent while loop breaks, i and j might have crossed and the values might be in the correct position
			{
			//	System.out.println("swapping at i:"+i+" and j:"+j);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;				//remember to move i and j pointers after swapping. or else the program will simply be looping here
				j--;
				count++;
				
			}
		}
	
		// at this point all elements to the left and right of pivot are smaller and larger than the pivot. However they might not be sorted. recursively call quicksort on these subarrays
		if(i < high)
		count = quickSort(arr,i,high,count);
		if(j > low)
		count =quickSort(arr,low,j,count);
	
		return count;
	}
	
}