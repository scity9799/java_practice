package homework11;

public class GetGender {
//	주민등록번호를 배열로 받아 뒷자리 첫번째 숫자 확인
//	메소드 정의
//	마지막 리턴값이 문자열이므로 리턴타입 String
//	주민번호는 중간에 대쉬가 들어가기 때문에 문자열로 작성
//	******-*******
	String getGender (String id) {
		//1)주민번호를 문자형으로 쪼개 배열에 저장
		//2)대쉬를 포함하면 뒷자리 첫번째 숫자는 8번째이므로 index[7]을 변수로 선언
		//3)if-else if문과 관계 연산자를 사용해 리턴값 반환 
		char[] ar = id.toCharArray();
		int num = ar[7];
		
		if(num == '1' || num == '3') {
			return "남자";
		}else if(num == '2' || num == '4') {
			return "여자";
		}
		return "x"; //? 이거없으면 실행이 안됨
	}

}
