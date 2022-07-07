package com.loop;

public class Loop1 {

	public static void main(String[] args) {
		System.out.println("Start");
		//for(초기식;조건식;증감식){}
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}
		
		int count = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println(count); //count 대신에 i를 써도 결과는 같다
			// i도 1씩 증가하기 때
			count++;
		}
		
		
		
		System.out.println("Finish");

	}

}
