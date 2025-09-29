package practice2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. 조건문과 반복문을 이용하여 가위바위보 게임을 만들어보세요.
//		5번을 이겼을 경우 게임이 끝나게 되며 한번 가위바위보를 실행할 때마다 사
//		람과 컴퓨터의 가위바위보 내용 , 승패, 승리 횟수,패배 횟수를 출력합니다.
//		------- ---------- 실행결과
//		가위(1), 바위(2), 보(3), 종료(4) 중에 선택해주세요. >> 1
//		플레이어:가위 vs 바위:컴퓨터 패배
//		승리 : 0/5 , 패배 : 1, 무승부 : 0
//		가위(1), 바위(2), 보(3), 종료(4) 중에 선택해주세요. >> 2
//		플레이어:바위 vs 가위:컴퓨터 승리
//		승리 : 1/5 , 패배 : 1, 무승부 : 0
		
//		Math.random() : 0~1 사이의 소수점 숫자 출력하는 함수
//		0.1*3=(int)0.3=0, 0.5*3=(int)1.5=1, 0.9*3=(int)2.7=2
//		(int)(Math.random()*3) = 0~2 사이의 숫자
//		(int)(Math.random()*5) = 0~4 사이의 숫자
//		computer변수에 1~3 사이의 랜덤한 숫자가 저장됨		
//		arr[0]:가위, arr[1]:바위, arr[2]:보
		String[] arr = {"가위","바위","보"};
		int win = 0;
		int lose = 0;
		int tie = 0;
		Scanner sc = new Scanner(System.in);
		while(win<5) {
			System.out.print("가위(1), 바위(2), 보(3), 종료(4) 중에 선택해주세요. >>");
			int player = sc.nextInt();
			if(player == 4) {
				System.out.println("가위바위보 게임을 종료했습니다.");
				break;
			}
			int computer = (int)(Math.random()*3+1);
			System.out.print("사람:"+arr[player-1]+"vs"+arr[computer-1]+":컴퓨터 / ");
			if(player == computer) {
				System.out.println("비겼습니다.");
				tie++;
			}else if(player==1 && computer==3
					|| player==2 && computer==1
					|| player==3 && computer==2) {
				System.out.println("이겼습니다.");
				win++;
			}else{
				System.out.println("졌습니다.");
				lose++;
			}
			System.out.println("승리 : "+win+"/5 , 패배 : "+lose+", 무승부 : "+tie);
		}
		System.out.println("5번 이겼습니다. 축하합니다.");
	}

}









