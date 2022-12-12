package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Informe valor da Matriz:");
		int n = sc.nextInt();
		
		
		int [][] mat = new int[n][n];
		
		for (int i=0; i<mat.length ; i++) {
			for (int j=0; j<mat[i].length ; j++) {
			mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal");

		for(int i=0; i<mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Números negativos: " + count);
		
		sc.close();

	}

}
