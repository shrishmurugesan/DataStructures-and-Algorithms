package collections_practice;

import java.util.*;

public class Iterators {
	
	public static void main(String a[])
	{
		ArrayList<String> collectionList = new ArrayList<>();
		String[] arrayList = new String[20];
		
		for(int i=0;i<20;i++)
		{
			collectionList.add(""+(i+1));
			arrayList[i] = ""+(i+1);
		}
		
		Iterator<String> itr = collectionList.iterator();
		System.out.println("Simple Iterator");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		
		ListIterator<String> litr = collectionList.listIterator();
		System.out.println("\nListIterator Forward Direction");
		while(litr.hasNext())
		{
			
			System.out.print(litr.next()+" ");
		}
		System.out.println("\nListIterator Reverse Direction");
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");
		}
		
		System.out.println("\nIterating ArrayList using a foreach loop");
		for (String string : collectionList) {
			System.out.print(string+" ");
		}
		
		System.out.println("\nIterating Arrya using foreach Loop");
		for (String string : arrayList) {
			System.out.print(string+" ");
		}
		
		System.out.println("\nIterating using Enumeration");
		Enumeration<String> arrayListEnum = Collections.enumeration(collectionList);
		
		while(arrayListEnum.hasMoreElements())
		{
			System.out.print(arrayListEnum.nextElement()+" ");
		}
	}

}
