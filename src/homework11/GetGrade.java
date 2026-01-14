package homework11;
//3. 학생 3명의 수학점수, 국어점수, 영어점수를 받아 
//평균을 구하여(정수형) 각 학생별 학점 구하기 (매개변수 o, 리턴값 o)
public class GetGrade {
//	로직구성
//	리턴값 아직 몰라 void로 넣고 시작
//	세명의 학생의 국영수 점수를 받아야하므로 2차원 배열 사용
//	for문 사용해서 각 학생의 점수의 합을 구하고 평균 계산
//	if~else if 사용해 구간별 학점 나누기
//	리턴값이 학점이므로 리턴타입 문자열
	String[] getGrade(int[][] score) {
		String[] grade = new String[3];
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			for(int j = 0; j < score[i].length; j++) {
			sum += score[i][j];
			}
			int avg = sum / 3;
			
			if(avg >= 95) {
				grade[i] = "A+";
			}else if(avg >= 90) {
				grade[i] = "A";
			}else if(avg >= 85) {
				grade[i] = "B+";
			}else if(avg >= 80) {
				grade[i] = "B";
			}else if(avg >= 75) {
				grade[i] = "C+";
			}else if(avg >= 70) {
				grade[i] = "C";
			}else if(avg <= 69) {
				grade[i] = "F";
			}
		}
		return grade;
	}
}
