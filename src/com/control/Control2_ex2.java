package com.control;

import java.util.Scanner;

public class Control2_ex2 {
	
		public static void main (String [] args) {
			//2 (쓰여진 알파벳은 제시된 숫자만큼 뒤에 있는 알파벳을 의미한다)
			// a = 97 , z = 122
			// A = 65, Z = 90
			Scanner sc = new Scanner(System.in);
			System.out.println("1-5 사이의 숫자 입력");
			int num = sc.nextInt();
			System.out.println("알파벳을 입력하세요");
			char ch = sc.next().charAt(0);
			// num : 1 출력c
			// num : 2 출력d
			
			if((int)ch <= 122 && (int)ch >= 97) {
				ch -= 26;
			} else if(97 <= (int)ch && (int)ch <= 122) {
				ch = (char)(ch + num);
			}
			
			ch += num;
			System.out.println(ch);
			
			//ch = (char)(ch+num);
			
			//Home Edition
		}
}
