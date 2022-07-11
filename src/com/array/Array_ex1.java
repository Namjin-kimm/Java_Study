package com.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// 키보드로부터 인원수를 입력 받아서
		// 인원수만큼 이름을 입력 받아서
		// 이름들을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int num = sc.nextInt();
		
		int sum = 0;
		String [] names = new String[num];
		int [] scores = new int[names.length];
				
		for(int i = 0; i < names.length; i++) {
			System.out.println(i + 1 +"번 이름을 입력하세요");
			names[i] = sc.next();
			System.out.println(names[i] + "학생의 국어점수를 입력하세요");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "학생의 국어 점수는 " + scores[i] + "점 입니다");
		}
		System.out.println("반 국어 총 점은 " + sum + "입니다");
		
		//각 학생의 이름별로 국어 점수를 입력 후 출력
	}

}
