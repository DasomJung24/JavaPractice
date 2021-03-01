package test4;

import java.util.Scanner;

public class Main {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		
		// 원하는 개수만큼의 배열 생성 및 최댓값 구하기 
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int number = scanner.nextInt();
		int[] array = new int[number];
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요 : ");
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		scanner.close();
		
		System.out.println(result);
		
		// 100개의 랜덤 정수의 평균을 구하기 
		int[] array2 = new int[100];
		for(int i = 0; i < 100; i++) {
			array2[i] = (int) (Math.random() * 100 + 1);
		}
		int sum = 0;
		for(int i = 0; i < 100; i++)
		{
			sum += array2[i];
		}
		System.out.println("100개의 랜덤 정수의 평균 값은 " + sum / 100);
		
		// 가로 세로가 50인 이차원 배열 만들기 
		int N = 50;
		int[][] array3 = new int[N][N];
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array3[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
