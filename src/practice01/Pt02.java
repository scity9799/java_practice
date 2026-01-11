package practice01;

import java.util.Scanner;

//숫자를 계속 입력받아
//0이 입력될 때까지의 합을 출력하세요
public class Pt02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.println("숫자 입력 : ");
			
			int num = sc.nextInt();
			sc.nextLine();

			if(num != 0) {
				sum += num;
			}else if(num == 0) {
				System.out.println(sum);
				break;
			}
			
		}
		sc.close();
	}
}
