import java.util.Scanner;

public class Code73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		
		System.out.println("문자열을 입력하십시오");
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str); // str을 String메서드를 적용해 sb에 저장
		
		System.out.println("a가 들어갈 위치를 정수로 입력하십시오");
		int num = sc.nextInt();

		System.out.println(sb.insert(num, "a") + "(이)가 되었습니다");
		// System.out.println(str + "을(를) 뒤집으면 " + sb.reverse() + "입니다");  뮨자역 역순
		
		----------------------------------------------- */

		System.out.println("정수 2개를 입력해주시오");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int ans = Math.min(number1, number2); // stitic 매서드
		
		System.out.println(number1 + "와(과) " + number2 + " 중 작은 쪽은 " + ans + "입니다");
	}

}