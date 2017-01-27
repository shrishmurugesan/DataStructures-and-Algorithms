package collections_practice;


import java.util.*;


public class HashMapPractice {
	
	public static void main(String a[])
	{
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
		Hashtable<String,Integer> ht = new Hashtable<>();
		
		
		
		hm.put("Shrish", 25);
		hm.put("Sharmi", 23);
		hm.put("Harrish", 19);
		hm.put("Nagarathinam", 45);
		hm.put("Murugesan", 50);
		
//		ht.put("Shrish", 25);
//		ht.put("Sharmi", 23);
//		ht.put("Harrish", 19);
//		ht.put("Nagarathinam", 45);
//		ht.put("Murugesan", 50);
//		
		Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("key: "+entry.getKey() + " Value: "+entry.getValue());
		}
		
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println("key: "+entry.getKey() + " Value: "+entry.getValue());
		}
		
		Set<String> hmenum = hm.keySet();
		
		Enumeration<String> htenum = ht.keys();
		System.out.println("enumeration iteration of hashtable");
		
		Iterator<Map.Entry<String, Integer>> itrr = ht.entrySet().iterator();
		while(itrr.hasNext())
		{
			Map.Entry<String, Integer> entry= itrr.next();
			System.out.println("key: "+entry.getKey() + " Value: "+entry.getValue());
		}
	}

}
