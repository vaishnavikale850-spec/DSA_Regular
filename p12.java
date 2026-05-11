import java.util.*;
class Demo{
	public static void main(String[]args){
		int []arr = {1,2,3,2,1,1};	
		int max = 0;
		int ans = 0;
		int index = 0;
		for(int i = 0; i<arr.length-1; i++){
			int count = 0;
			for(int j = 0; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count > max){
				ans = arr[i];
			}
		}	
		System.out.println(ans);
	}
}