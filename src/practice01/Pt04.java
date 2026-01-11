package practice01;

import java.util.Scanner;

//배열에 저장된 값 중 짝수만 출력하세요.
public class Pt04 {
	public static void main(String[] args) {
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arData.length; i++) {
			System.out.println("정수 입력 :");
			arData[i] = sc.nextInt();
		}
		for(int i = 0; i < arData.length; i++) {
			if(arData[i] % 2 == 0) {
				System.out.print(arData[i] + " ");
			}
		}
		sc.close();
	}
}
