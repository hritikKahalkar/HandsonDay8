/*1)Create a Collection called HashMap which is capable of storing String objects.

 The program should have the following abilities

a) Check if a particular key exists or not.

b) Check if a particular value exists or not.

c) Use Iterator to loop through the map.*/

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		
		HashMap<String,String> hash = new HashMap<>();
		
		hash.put("A","Angular");
		hash.put("B","Bootstrap");
		hash.put("C","C-Sharp");
		hash.put("D","DevOps");
		
		String key = "C";
		String name = "Java";
		
		System.out.println("HashMap : "+hash);
		
		boolean keyCheck = hash.containsKey(key);
		
		System.out.println("Key "+key+" exists? "+keyCheck);
		System.out.println("Name "+name+" exists? "+hash.containsValue(name));
		
		Iterator <String> it = hash.keySet().iterator(); 
		while(it.hasNext())  
		{  
		String k = (String)it.next();  
		System.out.println("No.: "+k+"  name: "+hash.get(k));  
		}  


	}

}
