import java.util.*;
class Bubblesort{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		for(int i = 0; i<size; i++){
			System.out.print("Enter num: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		boolean isSorted = false;
		for(int i = 0; i<size-1; i++){
			for(int j = 0; j<size-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = true;
				}
			}
			if(!isSorted){
				break;
			}
		}	
		System.out.println(Arrays.toString(arr));
	}	
}


