package com.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//총알 : 
		//탄창 : 30발 , 3개
		
		//1. 단발 2. 점사(3발씩)
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("1. 단발, 2. 점사 사격모드를 선택해주세요");
			int mode = sc.nextInt();
			if(mode == 1) {
				for(int a = 0; a < 30; a++) {
					System.out.print("탕");
				}
				System.out.println();
			} else {
				for(int b = 0; b < 10; b++) {
					System.out.print("탕탕탕\t");
				}
				System.out.println();
			}
		}
		
		/* for(int i = 0; i < 3; i++) {
		 * int select = 0; int bullet = 1; String sound = "탕"
		 * System.out.println("1. 단발, 2. 점사 사격모드를 선택해주세요");
			int select = sc.nextInt();
			int bullet = sc.nextInt();
			
			for(int j = 0; j < 30; j+=bullet) {
			for(int h = 0; h < bullet; h++) {
				System.out.print(sound);
			}
			if(30 - j != 0)
			}
		 } */
	//============================================================
		//선생님 답안 1
		/* for(int mag = 0; mag < 3; mag++) {
		 * 
		 *	System.out.println("1. 단발 2. 점사");
		 *	int select = sc.nextInt();
		 *
		 *	if(select == 1) {
		 * for(int b = 0; b < 30; b++ {
		 * System.out.println("탄창 : " + mag + "총알 : " + b + "탕")
		 * }
		 *	} else {
		 *		for(int b = 0; b < 30; b++ {
		 * System.out.println("탄창 : " + mag + "총알 : " + b + "탕")
		 * }
		 *}
		 *
		 * }
		 */
		
		//선생님 답안 2
		/* for(int mag = 0; mag < 3; mag++) {
		 * 
		 *	System.out.println("1. 단발 2. 점사");
		 *	int select = sc.nextInt();
		 * 	int count = 10; String sound = "탕탕탕"
		 * 	if(select == 1) {
		 * 		count = 30; sound = "탕"
		 * }
		 *	for(int b = 0; b < count; b++) {
		 *		System.out.println(sound);
		 *	}
		 */
		
	//============================================================
		/* System.out.println("1. 단발 2. 점사");
		 *	int select = sc.nextInt();
		 *
		 *	int inc = 3;
		 *	String sound = "타타탕";
		 *
		 *	if(select == 1) {
		 *	inc = 1;
		 * sound = "탕"
		 *}
		 *
		 * for(int b = 0; b < 30; b += inc) {
		 * 	System.out.println(sound);
		 * }
		 */
	}

}
