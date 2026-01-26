package class1;

public class Student {
	//정적 필드
	static String schoolName = "코리아 고등학교";
	//인스턴스 필드
	String studentName;
	//정적 메소드 선언
	static void goToSchool() {
		System.out.println("학교에 갑니다.");
	}
	//인스턴스 메소드 선언
	void hello() {
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}
