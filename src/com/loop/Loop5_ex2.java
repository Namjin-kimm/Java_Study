package com.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		// nextInt(정수):0 부터 입력한 정수 미만 범위에서 무작위 정수가 나온다
		//int num = random.nextInt(10); 
		//System.out.println(num);
		
		//0 : 가위
		//1 : 주먹
		//2 : 보
		
		//사용자가 하나를 입력
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길 경우만 종료
		//비기거나 지면 다시 실행
		
		boolean check = true;
		while(check) {
			int com = random.nextInt(3);
			System.out.println("가위(0) 바위(1) 보(2) 중에 하나를 내세요");
			int me = sc.nextInt();
			System.out.println("컴퓨터가 낸 것:" + com);
			if((me == 0 && com == 2) || (me == 1 && com == 0) || (me == 2 && com == 1)) {
				System.out.println("당신이 이겼습니다");
			check = !check;
			//break
			} else {
				System.out.println("다시 내주세요");
			}
		}
	
		System.out.println("=============================");
		check = true;
		while(check) {
			int com = random.nextInt(3);
			System.out.println("가위(0) 바위(1) 보(2) 중에 하나를 내세요");
			int me = sc.nextInt();
			System.out.println("컴퓨터가 낸 것:" + com);
			if(me - com == 1 || me - com == -2) {
				System.out.println("당신이 이겼습니다");
				check = !check;
			}	else if(me == com) {
				System.out.println("비겼습니다");
			} else {
				System.out.println("당신이 졌습니다");
			}
		}

	}

}
