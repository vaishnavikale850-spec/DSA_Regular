import java.util.*;
class Demo{
	public static void main(String[]args){
		int arr[] = {4,3,0,6,7,6,12,66,28,32};
		for(int i = 0; i<arr.length-1; i++){
			int initial_Index = i ;
				for(int j = i+1; j<arr.length; j++){
					if(arr[i] > arr[j]){
						initial_Index = j;
					}
				}
			int temp = arr[initial_Index];
			arr[initial_Index] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}

	}
}