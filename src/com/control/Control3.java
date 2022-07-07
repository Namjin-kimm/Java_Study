package com.control;

import java.util.Scanner;

public class Control3 {
	
	public static void main(String[] args) {
		int num = 10; //지역변수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-3 숫자 입력");
		int select = sc.nextInt();
		
		if(select == 1) {
			System.out.println("1번을 선택");
		}	else if (select == 2) {
			System.out.println("2번을 선택");
		}	else {
			System.out.println("3번을 선택");
		}
	}

}
