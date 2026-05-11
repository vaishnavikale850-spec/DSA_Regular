//Sum of rows elements in matrix
import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int [] [] arr = new int [size] [size];
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; j++){
				System.out.println("Enter nums in "+ i +" row and "+ j + "column : " );
				arr [i] [j] = sc.nextInt();
			}
		}

		int sum = 0;

		for(int i = 0; i<size; i++){
			sum += arr[0][i];
		}
		System.out.println(sum);
	}
}