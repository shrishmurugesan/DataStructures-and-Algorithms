package algorithms_practice;

import java.util.*;

public class SortingPractice
{
	public static void main(String a[])
	{
		int[] arr = {12, 45, 32, 12, 56, 77, 4, 78, 23, 95, 34, 62, 35 ,31, 96, 86, 78,45};
		System.out.println("Unsorted Array");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		int[] bubbleSorted = bubbleSort(arr);
		int[] selectionSorted = selectionSort(arr);
		int[] insertionSorted = insertionSort(arr);
		int[] mergeSorted = mergeSort(arr);
		
	}
	
	public static int[] bubbleSort(int[] in)
	{
		for(int i = in.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(in[j] > in[j+1])
				{
					int temp = in[j];
					in[j] = in[j+1];
					in[j+1] = temp;
				}
			}
		}
		System.out.println("\nBubbleSorted array");
		for (int i : in) {
			System.out.print(i+" ");
		}
		
		return in;
	}
	
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			int minimum = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minimum])
				{
					minimum = j;
				}
			}
			
			int temp = arr[minimum];
			arr[minimum]=arr[i];
			arr[i] = temp;
		}
		
		System.out.println("\nSelection Sorted Array");
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		return arr;
	}
	
	public static int[] insertionSort(int[] arr)
	{
		
		for(int i=1;i<arr.length;i++)
		{
			int temp = arr[i];
			int j;
			for( j=i-1; j>=0 && temp<arr[j];j--)
			{
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
		
		System.out.println("\nInsertion Sorted Array");
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		return arr;
	}
	
	public static int[] mergeSort(int arr[])
	{
		int[] result = mergeSort( arr, 0 , arr.length-1);
		System.out.println("\nMerge Sorted Array");
		for (int i : result) {
			System.out.print(i+" ");
		}
		return result;
	}

	static int[] mergeSort(int[] arr, int low, int high) 
	{
		if(low == high)
		{
			int[] result = new int[1];
			result[0] = arr[low];
			return result;
		}
		else
		{
		int mid = (low+high)/2;
		
		int[] firstHalf = mergeSort(arr,low,mid);
		int[] secondHalf = mergeSort(arr,mid+1,high);
		return merge(firstHalf,secondHalf);
		}
		
	}

	static int[] merge(int[] firstHalf, int[] secondHalf) {
		
		int[] result = new int[firstHalf.length+secondHalf.length];
		//creating indexers for the arrays
		int f = 0;
		int s = 0;
		int res =0;
		
		//merging logic
		
		//while either arrays havent been emptied
		
		while(f<firstHalf.length && s<secondHalf.length)
		{
			if(firstHalf[f]<=secondHalf[s])
			{
				result[res] = firstHalf[f];
				res++;
				f++;
			}
			else if(secondHalf[s]<=firstHalf[f])
			{
				result[res] = secondHalf[s];
				res++;
				s++;
			}
			
		}
		
		while(f<firstHalf.length)
		{
			result[res] = firstHalf[f];
			res++;
			f++;
		}
		
		while(s<secondHalf.length)
		{
			result[res] = secondHalf[s];
			res++;
			s++;
		}
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}