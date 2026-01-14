package homework11;

import java.util.Scanner;

public class GetGradeMain {//클래스 시작
	public static void main(String[] args) {//메인 시작
//		로직구성
//		입력클래스 import
//		객체 생성 후 저장
//		2차원 배열 선언
//		for문 사용해 학생별 과목별 점수 출력
//		메소드 호출해 출력
		Scanner sc = new Scanner(System.in);//입력클래스
		GetGrade gd = new GetGrade();//객체 선언
		
		int[][] score = new int [3][3];//정수형 2차원배열 선언
		
		for(int i = 0; i < score.length; i++) {//for1 시작
			System.out.println((i+1) + "번 학생 점수 입력 : ");
		System.out.println("국어 : ");
		score[i][0] = sc.nextInt();
		System.out.println("영어 : ");
		score[i][1] = sc.nextInt();
		System.out.println("수학 : ");
		score[i][2] = sc.nextInt();
		}//for1 끝
		String[] result = gd.getGrade(score);//메소드 호출
		
		for(int i = 0; i < result.length; i++) {//for2 시작
			System.out.println((i+1) + "번 학생 학점 : " + result[i]);//학생 학점 출력
		}//for2 끝
		sc.close();//스캐너닫기
	}//메인 끝
}//클래스 끝
