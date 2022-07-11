package com.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// 학교 성적 프로그램
		// 1. 학생 정보 입력
		//  - 학생 수를 입력
		//  - 이름, 번호, 국어, 영어, 수학 입력 후 총점, 평균 계산
		// 2. 학생 정보 조회
		//  - 모든 학생의 이름, 번호, 총점, 평균 출력
		// 3. 학생 정보 검색
		//  - 검색할 학생의 번호를 입력
		//  - 입력한 번호와 일치하는 학생의 모든 정보 출력
		//  - 일치하는 번호가 없으면 없는 학생이다 출력
		// 4. 학생 정보 삭제
		//  - 삭제할 학생의 번호를 입력
		//  - 입력한 번호와 일치하는 학생의 정보를 삭제(배열을 한 칸 삭제)
		//  - 일치하는 번호가 없으면 없는 학생이다 출력
		// 5. 학생 정보 추가
		//  - 이름, 번호, 국어, 영어, 수학 입력 후 총점 평균 계산해서 추가
		// 6. 프로그램	  종료
		
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		int childNum = 0;
		String [] names = new String[childNum];
		int [] childBackNum = new int[childNum];
		int [] kors = new int[childNum];
		int [] engs = new int[childNum];
		int [] maths = new int[childNum];
		int [] sums = new int[childNum];
		int [] avgs = new int[childNum];
		boolean haha = true;
		
		while(check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램  종료");
			int num = sc.nextInt();
			
			
			
			if(num == 1) {
				System.out.println("학생 정보 입력 시스템");
				System.out.println("학생 수를 입력해주세요");
				childNum = sc.nextInt();
				names = new String[childNum];
				childBackNum = new int[childNum];
				kors = new int[childNum];
				engs = new int[childNum];
				maths = new int[childNum];
				sums = new int[childNum];
				avgs = new int[childNum];
				for(int i = 0; i < childNum; i++) {
					System.out.println("학생의 이름을 입력해주세요");
					names[i] = sc.next();
					System.out.println("학생의 번호를 입력해주세요");
					childBackNum[i] = sc.nextInt();
					System.out.println("학생의 국어 점수를 입력해주세요");
					kors[i] = sc.nextInt();
					System.out.println("학생의 영어 점수를 입력해주세요");
					engs[i] = sc.nextInt();
					System.out.println("학생의 수학 점수를 입력해주세요");
					maths[i] = sc.nextInt();
					sums[i] = kors[i] + engs[i] + maths[i];
					avgs[i] = sums[i]/3;
					}
				
				} else if(num == 2) {
					System.out.println("학생 정보 조회 시스템");
					for(int i = 0; i < names.length; i++) {
						System.out.println("이름 :" + names[i]);
						System.out.println("번호 :" +	 childBackNum[i]);
						System.out.println("총점 :" + sums[i]);
						System.out.println("평균 :" + avgs[i]);
					}
				} else if(num == 3) {
					System.out.println("학생 정보 검색 시스템");
					System.out.println("학생 번호를 입력해주세요");
					int a = sc.nextInt();
					for(int i = 0; i < names.length; i++) {
						if(a == childBackNum[i]) {
							System.out.println("이름 :" + names[i] + "\n번호 :" + childBackNum[i] + "\n국어 점수 :"
									+ kors[i] + "\n영어 점수 :" + engs[i] + "\n수학 점수 :" + maths[i]
											+ "\n총점 :" + sums[i] + "\n평균 :" + sums[i]);
							haha = !haha;
							}
						
					} if(haha) {
						System.out.println("없는 번호 입니다");
					}
				
				} else if(num == 4) {
					System.out.println("학생 정보 삭제 시스템");
				} else if(num == 5) {
					System.out.println("학생 정보 추가 시스템");
				} else {
					System.out.println("프로그램을 종료 합니다");
					check = !check;
				}
			
		}

	}

}
