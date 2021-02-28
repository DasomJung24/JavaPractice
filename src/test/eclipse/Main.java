package test.eclipse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 정수를 입력받아 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i);
		sc.close();
		
		// 파일에 차례로 입력된 정수에 100을 곱해 출력 
		File file = new File("input.txt");
		try {
			Scanner sc2 = new Scanner(file);
			while(sc2.hasNextInt())
			{
				System.out.println(sc2.nextInt() * 1000);
			}
			sc2.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾는 도중 에러가 발생했습니다.");
		}
		
	}

}
