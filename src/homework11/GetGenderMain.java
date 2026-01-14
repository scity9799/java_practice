package homework11;

public class GetGenderMain {//클래스 시작
	public static void main(String[] args) {//main 시작
		
		GetGender gg = new GetGender();
		
		System.out.println(gg.getGender("991111-1234356"));
		System.out.println(gg.getGender("991111-2234356"));
		System.out.println(gg.getGender("991111-3234356"));
		System.out.println(gg.getGender("991111-4234356"));
	}//main 끝

}//클래스 끝
