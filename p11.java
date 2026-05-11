import java.util.*;
class Demo{
	public static void main(String[]args){
		int []arr = {1,2,3,2,1,1,1};
		int max = 0;
		HashMap <Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i<arr.length; i++){
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) +1);
			int n = (hm.containskey(arr[i], hm.get(arr[i])));
				if(n>max){
					max = n;
				}
		}
		System.out.println(max);
	}
}