package com.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
		
		//ID 입력, PW 입력
		//로그인 판단 로그인이 성공하면 종료
		//실패하면 다시 입력
		
		boolean check = true;
		
		while(check) { /*()안에 바로 'true'를 써도 되지만 보통 그렇게 하지 않고 변수를 선언
			하여 입력한다 */
			System.out.println("ID를 입력하세요");
			int id = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int pw = sc.nextInt();
			if(id == yId && pw == yPw) {
				System.out.println("로그인 되었습니다");
				//check = !check;
				break;
			}	else {
				System.out.println("잘못된 정보입니다 다시 입력 1번, 종료 2번 입력해주세요");
				int how = sc.nextInt();
				if(how == 1) {
					System.out.println("다시 입력해주세요");
				} else {
					System.out.println("종료 되었습니다");
					check = !check;
				}
			}
			
		}//while 끝
		if(check) {
			System.out.println("게임을 시작합니다");
			System.out.println("사냥터로 가시겠습니까? yes(1) or no(2)");
			int ans = sc.nextInt();
			int gold = 1000;
			int lev = 1 ;
			int j = 0;
			if(ans == 1) {
				for(lev = 1; lev <=15; lev++) {
					System.out.println("현재 레벨은" + lev + "입니다!");
					if(lev%5 == 0) {
						System.out.println(lev + "렙 보상" +(lev/5)*1000 + "골드가 지불되었습니다");
						gold += (lev/5)*1000;
					}
					if(lev == 15) {
						System.out.println("축하합니다 만렙이 되었습니다");
						break;
					}
					System.out.println("사냥을 시작하시겠습니까? yes(1) or no(2)");
					int ans1 = sc.nextInt();
					if(ans1 == 1) {
						System.out.println("자동사냥을 시작합니다!");
						int hunt = lev * 3;
						
						for(int k = 1; k <= hunt; k++) {
							System.out.println((k + j) + "monster");
						}//그때그때 누적 몬스터 수만 나타내고 싶으면 k + monster
						System.out.println("============================");
						j += hunt;
					}
					
				}
				
			}
			System.out.println("현재 레벨은 :" + lev + "\n보유골드는 :" + gold);
		} 
		
		//=========================================================
		//로그인을 안 했으면 프로그램이 종료
		//로그인을 성공했으면 게임 시작
		//RPG
		//시작레벨은 1
		//만렙     15
		//gold    :1000
		//모든 몬스터의 경험치는 동일
		//1 -> 2 : 3마리
		//2 -> 3 : 6마리
		//3 -> 4 : 9마리
		//4 -> 5 : 12마리
		
		//5렙 달성 시 축하금으로 1000골드 지급
		//10렙 달성 시 축하금으로 2000골드 지급
		//15렙 달성 시 축하금으로 3000골드 지급
	}

}
