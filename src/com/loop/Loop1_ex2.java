package com.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// 1. 1번 대문자, 2번 소문자
		// 1번이면 A - Z 출력
		// 2번이면 a - z 출력
		// a = 97 , z = 122
		// A = 65, Z = 90
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1과 2 둘 중 하나의 숫자를 입력해주세요");
		int num = sc.nextInt();
		if(num == 1) {
			for(char i = 65; i <= 90; i++) {
				System.out.println(i);
			}
		} else {
			for(char i = 97; i <= 122; i++) {
				System.out.println(i);
			}
		}
		
		//int i = 97;
		//int j = 123;
		
		//if(num == 1) {
		//	i = 65;
		//	j = 91;
		//}
		
		//for(int c = i; c < j; c++) {
		//	System.out.println((char)c);
		//}
		
		//2. 1-10까지의 합 구하기
		int sum = 0;
		for(int q = 1; q <= 10; q++) {
			sum += q;
		}
			System.out.println(sum);
		
		//3. ID, PW 입력해서 로그인 판단
		// 최대 5번까지 시도 가능
		
		int yId = 1234; //회원가입시 입력한 ID
		int yPw = 5678; //회원가입시 입력한 PW
		int i = 0;
		
		for(i = 0; i < 5; i++) {
		System.out.println("ID를 입력하세요");
		yId = sc.nextInt();
		System.out.println("PW를 입력하세요");
		yPw = sc.nextInt();
		
		if(yId == 1234 && yPw == 5678) {
			System.out.println("로그인 되었습니다");
			i = 100;
		} else{
			if(i == 4) {
				System.out.println("로그인 5회 시도로 인하여 아이디 잠김");
			}else {
				System.out.println("ID와 PW를 다시 입력해주세요");
			}
		}	
				}// for문 끝
		//반복문이 끝나는 조건
		//1. 로그인 성공
		//2. 로그인 5번 전부 실패
		
		
		
		}
	}
		
