/*2) Write a program that will have a Properties class object which is capable of storing some States of India

and their Capital. Use an Iterator to list all the elements stored in the Properties.
*/

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
		Properties capital = new Properties();
		
		capital.put("Maharashtra","Mumbai");
		capital.put("Karnataka","Bangalore");
		capital.put("Rajasthan","Jaipur");
		capital.put("Bihar","Patna");
		capital.put("Jharkhand","Ranchi");
		
		System.out.println("HashTable : "+capital);
		
		Iterator it = capital.keySet().iterator();
		
		while(it.hasNext()) {
			
			String state = (String)it.next();
			System.out.println("State : "+state+", Capital : "+capital.get(state));
			
		}

	}

}
