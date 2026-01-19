package practice02;
import java.util.Random; 
public class Lotto {
	public static void main(String[] args) {
		
		//로직
		//1. 1부터 45의 숫자가 랜덤으로 나와야함
		//2. 한 번 나온 숫자는 나오면 안됨 => 뽑은 숫자를 배열에 저장하고 이미 나온 숫자이면 다시 뽑기
		//3. 총 7개의 번호 출력 (6개는 1등 번호 1개는 보너스 번호)
		
		Random r = new Random();
		
		int[] lotto = new int[7];
		int arr = 0;
		
		while(arr < 7) {
			int num = r.nextInt(45) +1;
			boolean du = false;
			
			for(int i = 0; i <= arr; i++) {
				if(lotto[i] == num) {
					du = true;
					break;
				}
				
			}
			if(!du) {
				lotto[arr] = num;
				arr ++;
			}
		
		}
		
		for(int l : lotto) {
			System.out.print(l + "\t");
		}
		
	}
}
