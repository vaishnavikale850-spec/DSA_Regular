//Largest elements in matrix
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int [] [] arr = new int [size] [size];
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; j++){
				System.out.print("Enter nums in "+ i +" row and "+ j + "column : " );
				arr [i] [j] = sc.nextInt();
			}
		}
		System.out.print("Enter element you want to check in matrix:");
		int check = sc.nextInt();
		boolean isFound = false;
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; j++){
				if(check == arr[i][j]){
					isFound = true;
					break;
				}
			}
		}
		System.out.println("Output is " + isFound);
	}
}