package exam;

public class Tree01 {
	public static void main(String[] args) {
		
		int height = 4;

        for (int i = 1; i <= height; i++) {

            // 앞쪽 공백 출력
            for (int s = 0; s < (height - i) * 2; s++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
                if (star < i) {
//                    System.out.print("   "); // 별 사이 간격
                }
            }

            // 줄 바꿈
            System.out.println();
        }
	}
}
