package practice01;

public class Pt05 {
	public static void main(String[] args) {
		
//		1번문제
		
//		*
//		**
//		***
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		2번문제
		
//		****
//		***
//		**
//		*
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		3번문제
		
//		1111
//		2222
//		3333
//		4444
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}
}
