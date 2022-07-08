package com.loop;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		/* int i = 0;
		while(i < 5) {
			System.out.println("Hello World!!");
			i++;
		}
		*/
//키오스크 결제 시스템은 한 명의 고객이 결제가 끝나면 다시 처음 화면으로 돌아가야한다.
//이걸 몇 번을 반복해야 될지 모르기 때문에, 이럴 때 while문을 쓴다
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 성적입력");
			System.out.println("2. 총점계산");
			System.out.println("3. 평균계산");
			System.out.println("4. 종   료");
			int select = sc.nextInt();
			if( select == 1) {
				System.out.println("성적입력 선택");
			}	else if(select == 2) {
				System.out.println("총점계산 선택");
			}	else if(select == 3) {
				System.out.println("평균계산 선택");
			}	else if(select == 4) {
				System.out.println("종   료 선택");
				//check = false;
				check = !check;
				break;
			}	else {
				System.out.println("1-4만 가능");
			}
		}
	}

}
