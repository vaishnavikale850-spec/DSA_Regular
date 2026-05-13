//Sprial Matrix

import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter count : ");
		int n = sc.nextInt();
		int matrix [][] = new int[n][n];
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[0].length; j++){
					System.out.print("Enter "+ i + " row " + "and " + j + "col : " );
					matrix[i][j] = sc.nextInt();
			}
		}

		int startRow = 0;
		int endRow = matrix.length-1;
		int startCol = 0;
		int endCol = matrix[0].length-1;
		
		while(startRow<=endRow && startCol <= endCol){
			//top
			for(int j = startCol; j<=endCol; j++){
				System.out.print(matrix[startRow][j] + "  ");
			}

			//right
			for(int i = startRow+1 ; i <=endCol;  i++){
				System.out.print(matrix[i][endCol]+ "  ");
			}

			//bottom
			for(int j = endCol-1; j>=startCol; j--){
				if(startRow == endRow){
					break;
				}
				System.out.print(matrix[endRow][j]+ "  ");
			}

			//left
			for(int i = endRow-1; i >=startRow+1;  i--){
				if(startCol == endCol){
					break;
				}
				System.out.print(matrix[i][startCol]+ "  ");
			}

			startRow++;
			endRow--;
			startCol++;
			endCol--;
			System.out.println();
			
		}
		
	}
}