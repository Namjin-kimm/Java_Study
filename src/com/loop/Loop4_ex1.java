package com.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	분과 초를 입력받음
		//ex) 1, 15
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요");
		int m1 = sc.nextInt();
		System.out.println("초를 입력하세요");
		int s1 = sc.nextInt();
		
		/*for(int m = 0; m < 60; m++) {
			if(m == m1 + 1) { 여기서 if 문을 쓰게 되면 'm' 이라는 지역변수만 쓸 수 있고 's' 
			라는 지역변수는 사용할 수 없기 때문에 밑에 for문 안에 if문을 쓰는게 좋다.
				break;
			}
			for(int s = 0; s < 60; s++) {
				System.out.println("현재 시간은" + m + "분" + s + "초");
				if(s == s1) {
					break;
				}
			}
		} */
		
		for(int m = 0; m < 60; m++) {
			for(int s = 0; s < 60; s++) {
				System.out.println("현재 시간은" + m + "분" + s + "초");
				if(s == s1) {
					break;
				}
			}
			if(m == m1) {
				break;
			}
		} 
		
		/* for(int m = 0; m < 60; m++) {
			for(int s = 0; s < 60; s++) {
				System.out.println("현재 시간은" + m + "분" + s + "초");
				if(s == s1 && m == m1) {
					m = 100; s = 100;
				}
			}
			} */
		
		/* boolean flag = false;
		 * 
		 * for(int m = 0; m < 60; m++) {
		for(int s = 0; s < 60; s++) {
			System.out.println("현재 시간은" + m + "분" + s + "초");
			if(s == s1 && m == m1) {
				flag=!flag; 위 if 조건을 만족하면 false 였던 flag는 true가 될 것이
				break;
			}
			if(flag) {
			break;
			}
		}
		} */
		
	}
}


