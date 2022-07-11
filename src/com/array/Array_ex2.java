package com.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//random.nextInt(46);
		// 0부터 29까지 랜덤으로 출력하라는 의미이다
		
		String [] monsterNames = {"고블린", "오크", "트롤", "골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//몬스터 파티 생성
		//몬스터 수 입력(1-4)
		//몬스터가 생성됐으면 Hp
		//랜덤하게 입력한 수만큼 몬스터를 뽑고 출력
		System.out.println("몬스터 수를 입력하세요");
		int num = sc.nextInt();
		String [] monsterPartyNames = new String[num];
		int [] monsterPartyHps = new int[num];
		//int [] monsternums = new int [num];
		
		for(int i = 0; i < monsterPartyNames.length; i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
			//monsternums[i] = i;
		}
		
		for(int i = 0; i < monsterPartyNames.length; i++) {
			System.out.println(monsterPartyNames[i] + " Hp: " + monsterPartyHps[i]);
		}
		
		

	}

}
