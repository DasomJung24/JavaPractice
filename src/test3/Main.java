package test3;

public class Main {
	
	// 팩토리얼을 반복함수로 구현
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum *= i;
		}
		return sum;
	}
	
	// 팩토리얼을 재귀함수로 구현
	public static int factorial2(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorial2(number - 1);
	}
	
	// 피보나치 수열을 반복함수로 구현 
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1)
		{
			return one;
		}
		else if(number == 2)
		{
			return two;
		}
		else
		{
			for(int i = 2; i < number; i++)
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
		return result;
	}
	
	// 피보나치 수열을 재귀함수로 구현
	public static int fibonacci2(int number) {
		if(number == 1)
		{
			return 1;
		}
		else if(number == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci2(number - 1) + fibonacci(number - 2);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼은 " + factorial(10));
		
		System.out.println("10 팩토리얼은 " + factorial2(10));
		
		System.out.println("5번째 피보나치 수는 " + fibonacci(5));
		
		System.out.println("5번째 피보나치 수는 " + fibonacci2(5));

	}

}
