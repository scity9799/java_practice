package exam;

public class Tree01 {
	public static void main(String[] args) {
		
		int height = 4;

        for (int i = 1; i <= height; i++) {

            // ① 앞쪽 공백
            for (int j = 1; j <= (height - i) * 2; j++) {
                System.out.print(" ");
            }

            // ② 별 출력 (홀수 개)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
        int height1 = 4;
        int width = 2 * height1 - 1;
        int center = height1;

        for (int i = 1; i <= height1; i++) {          // 행
            for (int j = 1; j <= width; j++) {       // 열

                if (Math.abs(j - center) <= 2 * (i - 1) && (j - center) % 2 == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    
	}
}
