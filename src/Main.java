
public class Main {
	
	final static int N = 15;
	
	public static void main(String[] args) {
		
		String a = "I Love You.";
		if(a.contains("Love"))
		{
			System.out.println("Me too");
		}
		else
		{
			System.out.println("I Hate You.");
		}
		int score = 85;
		
		if(score >= 90)
		{
			System.out.println("A+ 입니다");
		}
		else if(score >= 80)
		{
			System.out.println("B+ 입니다");
		}
		else
		{
			System.out.println("C 입니다");
		}
		
		String b = "Man";
		
		// 자바는 String을 비교할 때 equals()을 사용 
		if(b.equals("Man"))
		{
			System.out.println("man");
		}
		else
		{
			System.out.println("no man");
		}
		
		// 대소문자 구별하지 않음 
		if(b.equalsIgnoreCase("man"))
		{
			System.out.println("man!");
		}
		else
		{
			System.out.println("no man!");
		}
		
		// while
		int i = 1, sum = 0;
		while(i <= 1000)
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum);
		
		// for : 초기화 부분, 조건부분, 연산부분 
		// 삼각형 출력하기 
		for(int j = N; j > 0; j--)
		{
			for(int k = j; k > 0; k--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// 원 출력하기 
		for(int h = -N; h <= N; h++)
		{
			for(int j = -N; j <= N; j++)
			{
				if(h * h + j * j <= N * N)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
