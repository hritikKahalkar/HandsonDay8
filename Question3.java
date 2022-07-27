/*3) Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.

The program should use appropriate generics (String, Integer) and have the following abilities:

a) Check if a particular key exists or not.

b) Check if a particular value exists or not.

c) Use Iterator to loop through the map.


*/

import java.util.HashMap;
import java.util.Iterator;

public class Question3 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> ContactList = new HashMap<>();
		
		ContactList.put("Ashok",22848);
		ContactList.put("BalRam",22745);
		ContactList.put("Charan",24563);
		ContactList.put("Devesh",25098);
		
		int phone = 22848;
		String name = "Kabir";
		
		System.out.println("HashMap Details : "+ContactList);
		
		boolean phoneCheck = ContactList.containsKey(phone);
		
		System.out.println("Key "+phone+" exists? "+phoneCheck);
		System.out.println("Name "+name+" exists? "+ContactList.containsValue(name));
		
		Iterator <String> it = ContactList.keySet().iterator(); 
		while(it.hasNext())  
		{  
		String n = (String)it.next();  
		System.out.println("Name: "+n+"  PhoneNo: "+ContactList.get(n));  
		}  


	}

}
