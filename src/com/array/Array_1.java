package com.array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		//배열 선언
		//모으려고 하는 데이터타입 [] 변수명
		int age = 30;
		int [] nums = new int[3];
		char [] names = new char[2];
		System.out.println(age);
		System.out.println(nums);
		
		nums[1] = age;
		nums[2] = 50;
		nums[0] = 10;
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[0]);

		names[0] = 97;
		names[1] = 122;
		System.out.println(names[0]);
		System.out.println(names[1]);
	}

}
