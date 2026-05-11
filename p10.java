import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		System.out.print(f(num));
	}
	static int f(int n){
		if(n == 0){
			return 0;
		}
		if(n == 2|| n == 1){
			return 1;
		}
		
		int tribo = f(n-1) + f(n-2) + f(n-3);
		return tribo;
	}
}