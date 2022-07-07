package com.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 점수 입력
				//총점 평균 계산
				// 평균 90점 이상이면 A
				// 평균 80점 이상이면 B
				// 평균 70점 이상이면 C
				// 평균 60점 이상이면 D
				// 그 외는 F
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();
		int sum = kor + eng + math;
		int avg = sum/3;
		avg = (int)(avg/10);
		
		switch(avg) {
		case 10:
			//System.out.println("A 학점 입니다");
			//break;
			//위 내용 생략가능
		case 9:
			System.out.println("A 학점 입니다");
			break;
		case 8:
			System.out.println("B 학점 입니다");
			break;
		case 7:
			System.out.println("C 학점 입니다");
			break;
		case 6:
			System.out.println("D 학점 입니다");
			break;
		default:
			System.out.println("F학점 입니다");
			
		}

	}

}
