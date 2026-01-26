package class1;

class Car{//클래스 선언
	//필드
	int wheel = 4;
}
public class EX_0706 {
	public static void main(String[] args) {
		// 객체 생성
		Car c = new Car();
		// Car 클래스 필드값 출력
		System.out.println("whell의 개수는 " + c.wheel + "개입니다.");
		
		c.wheel = 5;
		System.out.println("whell의 개수는 " + c.wheel + "개입니다.");
	}
}
