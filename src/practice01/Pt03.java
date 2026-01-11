package practice01;

import java.util.Scanner;

//정수 5개를 저장할 수 있는 배열을 만들고
//사용자로부터 5개 값을 입력받아 모두 출력하세요.
public class Pt03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for(int i = 0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0; i<5; i++) {
			System.out.println("정수 " + (i+1) + ": " + num[i]);
		}
		sc.close();
	}
}
