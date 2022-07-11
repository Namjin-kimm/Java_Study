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
		
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		//파이어볼
		int magicPower = 6;
		
		
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
		
		//1회성
		//0-6사이의 랜덤한 데미지로 몬스터를 공격
		
		
		for(int i = 0; i < monsterPartyNames.length; i++) {
			System.out.println(monsterPartyNames[i] + " Hp: " + monsterPartyHps[i]);
		}
		
		boolean check = true;
		
		while(check) {
			int death = 0;
			System.out.println("1. 사냥");
			System.out.println("2. 도망");
			int select = sc.nextInt();
			if(select == 1) {
		for(int i = 0; i < monsterPartyNames.length; i++) {
			int damage = random.nextInt(6);
			int remain = monsterPartyHps[i] - damage;
			monsterPartyHps[i] -= damage;
			System.out.println("데미지가" + damage + "만큼 들어갔습니다");
			System.out.println(monsterPartyNames[i] + "의 Hp가" + remain + "남았습니다\n");
			if(remain <= 0) {
				death++;
				System.out.println("death: " + death);
			}
		}
			} else {
				break;
			}
		}
	}

}
