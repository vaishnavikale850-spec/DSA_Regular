import java.util.*;
class Demo{
	public static void main(String[]args){
		int []arr = {1,2,3,2,1,1,1};
		int i = 0;
		boolean s = f(arr, i);
		System.out.println(s);
	}
	static boolean f(int [] arr, int i){
		if(arr.length - 1 == i){
			return true;
		}
		if(arr[i+1] < arr[i]){
			return false;				}

		return f(arr, i+1);		
	}
}