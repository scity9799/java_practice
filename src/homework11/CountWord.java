package homework11;

public class CountWord {//클래스 시작
//	띄어쓰기 개수를 세서 거기에 1 더하기
//	메소드 정의
//	1. 리턴값이 뭔지 몰라 void로 시작
//	2. void countWord(String str){ 
//	3. 입력받은 문자열을 배열과 반복문을 이용해 검사
//	4. 공백이 저장되면 카운트
//	5. 카운트 + 1 출력
//	6. 리턴값 정수형이므로 void -> int 수정
	
	int countWord(String str) {//메소드 시작
		
		char[] st = str.toCharArray(); //문자열을 문자 하나하나 쪼개서 배열로 만듬
		int blank = 0; // 띄어쓰기 셀 변수
		
		for(int i = 0; i < st.length; i++) {//for 시작
			if(st[i] == ' ' ) {//if 시작
				blank++;
			}//if 끝
		}//for 끝	
		return blank + 1;
	}//메소드 끝
}//클래스 끝
