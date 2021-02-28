package test2;

public class Main {
	
	// 반환형, 함수명, 매개변수 
	// 3개의 수 최대 공약수를 찾는 프로그램
	public static int function(int a, int b, int c) {
		int min;
		if(a > b)
		{
			if(b > c)
			{
				min = c;
			}
			else
			{
				min = b;
			}
		}
		else
		{
			if(a > c)
			{
				min = c;
			}
			else
			{
				min = a;
			}
		}
		for(int i = min; i > 0; i--)
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	// 약수 중 k 번째로 작은 수를 찾는 프로그램
	public static int function2(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	// 문자열에서 마지막 단어를 반환하는 함수
	public static char function3(String input) {
		return input.charAt(input.length() - 1);
	}
	
	// max() 를 이용하여 최대값을 저장하는 프로그램 
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int function4(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("(400, 300, 750)의 최대 공약수 : " + function(400, 300, 750));
		
		int result = function2(3050, 10);
		if(result == -1)
		{
			System.out.println("3050의 10번째 약수는 없습니다.");
		}
		else
		{
			System.out.println("3050의 10번째 약수는 " + result + "입니다.");
		}
		
		System.out.println("Hello World의 마지막 단어는 " + function3("Hello World"));
		
		System.out.println("(345, 567, 789) 중에서 가장 큰 값은 " + function4(345, 567, 789));
		
	}

}
