import java.util.*;
class SelectionSort{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i = 0; i< arr.length; i++){
			System.out.print("Enter num : ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		boolean isMinFound = false;
		for(int i = 0; i< arr.length-1; i++){
			int min = arr[i];
			for(int j = i+1; j< arr.length; j++){
				if(min > arr[j]){
					min = arr[j];
					isMinFound = true;
				}
				if(isMinFound){
					int temp = arr[i];
					 arr[i] = min;
					arr[j] = temp;
					isMinFound = false;
				}
			}									
		}
		System.out.print(Arrays.toString(arr));
	}
}