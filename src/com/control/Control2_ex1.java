package com.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//월급을 입력
		//1. 정규직 2. 계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3%
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월급을 입력하세요");
		int money = sc.nextInt();
		System.out.println("정규직이면 숫자 1을, 계약직이면 숫자 2를 입력해주세요");
		int job = sc.nextInt();
		if(job == 1) {
			money -= money * (0.01 + 0.014 + 0.005 + 0.007); 
		} else if(job == 2) {
			money -= money * 0.033;
		}
		System.out.println("실수령액은" + money + "원 입니다");
		
		//Study Edition
	}

}
