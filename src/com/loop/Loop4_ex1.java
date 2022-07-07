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
			if(m == m1 + 1) {
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
		
	}

}
