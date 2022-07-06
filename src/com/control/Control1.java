package com.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		//제어문
		//1. 단일 if문
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("짝수입니다");
		} else{
			System.out.println("홀수입니다");
				
			}
		}

	}
