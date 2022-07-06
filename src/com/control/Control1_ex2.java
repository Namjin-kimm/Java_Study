package com.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		//정수 입력
		//짝수면 짝수 출력, 홀수면 홀수 출력
		//단, 단일 if 한 번만 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		String result = "홀수입니다";
		if(a%2 == 0) {
			result = "짝수입니다";
		}
		System.out.println(result);
		
		/** if(a%2 == 0) {
		* result = "짝수입니다";
	}
	result = a % 2 == 0 ? "짝수입니다" : "홀수입니다"
	이런식으로 해도 된다 */
		

	}

}
