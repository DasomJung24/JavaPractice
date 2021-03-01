package test5;

public class Main {

	public static void main(String[] args) {
		// 하나의 점을 의미하는 Node 클래스
		// Node 클래스를 이용하여 두 점 사이의 중점을 구하는 프로그램 
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two);
		System.out.println(result.getX()+ " " + result.getY());
	}

}
