package com.loop;

public class Loop2 {

	public static void main(String[] args) {
		//반복문의 보조문
		//1. break
		// 반복문 내에서 break를 만나면 그 즉시 반복문 종료
		//2. continue
		// 	for : 그 즉시 증감식으로 이동
		//	while : 그 즉시 조건식으로 이동
		
		
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				continue;
				//System.out.println(i); continue 뒤에 쓰면 오류가 난다
			}
			System.out.println(i);
		}
	}

}
