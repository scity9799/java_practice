package class1;

public class EX07_11 {
	public static void main(String[] args) {
		//객체 father, son 두개 생성
		Family father = new Family();
		Family son = new Family();
		//father 객체 필드값만 인천으로 바꿈
		father.address = "인천";
		//son 객체 필드 출력하면 서울 그대로 출력
		System.out.println(son.address);
	}
}
