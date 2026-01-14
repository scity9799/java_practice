package homework11;

import java.util.Scanner;

public class CountWordMain {//클래스 시작
	public static void main(String[] args) {//main 시작
//		1. 입력클래스 import
//		2. 입력메세지 출력
//		3. 문자열 변수 선언 (nextLine))
//		4. 객체 선언 후 저장
//		5. 메소드 호출
//		6. 출력
//		7. 스캐너 닫기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장 입력 :");
		
		String line = sc.nextLine();
		
		CountWord cw = new CountWord();
		
		int result = cw.countWord(line);
		
		System.out.println("단어 개수 : " + result);
		
		sc.close();
		
	}//main 끝
}//클래스 끝
