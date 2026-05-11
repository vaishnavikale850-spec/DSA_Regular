import java.util.HashMap;
import java.util.Arrays;
class Demo{
	public static void main(String[]args){
		int arr[] = {10,20,30,30,22};
		//Creating hashmap
		HashMap<String, Integer> hm = new HashMap<>();	

		// Adding elements in Hashmap
		hm.put("Abhi", 10);
		hm.put("Radha", 20);
		hm.put("Adi", 10);
		hm.put("Ram", 20);
		System.out.println(hm.get("Ram"));
		System.out.println(hm);
		
		//Get values corresponds to key
		System.out.println(hm.get("Radha"));
		System.out.println(hm.get("Raj"));

		//Updating or changing the value in hashmap 
		hm.put("Ram", 70);
		System.out.println("Ram is "+hm.get("Ram"));
		System.out.println(hm.get("ram"));
	
		//Remove key from hashmap

		hm.remove("Ram");
		System.out.println("Ram is "+hm.get("Ram"));

		//check if a key exist or not = return true or false
		System.out.println(hm.containsKey("Ram"));
		System.out.println(hm.containsKey("Radha"));
	}
}