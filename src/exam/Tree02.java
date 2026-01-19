package exam;

public class Tree02 {
	public static void main(String[] args) {
		int height = 5;
		int width = 2 * height - 1;
		int center = height;
		for(int i = 1; i < height; i++) {
			for(int j = 1; j < width; j++) {
				if(Math.abs(j - center) <= i - 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
