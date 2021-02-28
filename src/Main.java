
public class Main {
	

	public static void main(String[] args) {
		
//		String a = "I Love You.";
//		if(a.contains("Love"))
//		{
//			System.out.println("Me too");
//		}
//		else
//		{
//			System.out.println("I Hate You.");
//		}
//		int score = 85;
//		
//		if(score >= 90)
//		{
//			System.out.println("A+ 입니다");
//		}
//		else if(score >= 80)
//		{
//			System.out.println("B+ 입니다");
//		}
//		else
//		{
//			System.out.println("C 입니다");
//		}
		
		String a = "Man";
		
		// 자바는 String을 비교할 때 equals()을 사용 
		if(a.equals("Man"))
		{
			System.out.println("man");
		}
		else
		{
			System.out.println("no man");
		}
		
		if(a.equalsIgnoreCase("man"))
		{
			System.out.println("man!");
		}
		else
		{
			System.out.println("no man!");
		}
	}

}
