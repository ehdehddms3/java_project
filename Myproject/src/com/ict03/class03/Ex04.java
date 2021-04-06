package com.ict03.class03;

import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// 컴퓨터와 가위바위보 게임하기
		// 컴퓨터는 가위(0), 바위(1), 보(2)를 갖는다
		// 사용자가 가위,바위,보를 선택해서 컴퓨터와 게임을 한다
		
		Scanner scan = new Scanner(System.in);
		int totalcount = 0;
		int vcnt = 0;
		esc :
		while (true) {
		int pc = (int)(Math.random()*3);
		System.out.print("1.가위, 2.바위, 3.보 >> ");
		int user =scan.nextInt();
		if (pc == 0) {
			if(user == 1) {
				System.out.println("비김");
			} else if(user == 2) {
				vcnt++;
				System.out.println("이김");
			} else if(user == 3) {
				System.out.println("짐");
			}
		} else if(pc == 1) {
			if(user == 1) {
				System.out.println("짐");
			} else if(user == 2) {
				System.out.println("비김");
			} else if(user == 3) {
				vcnt++;
				System.out.println("이김");
			}
		} else if(pc == 2) {
			if(user == 1) {
				vcnt++;
				System.out.println("이김");
			} else if(user == 2) {
				System.out.println("짐");
			} else if(user == 3) {
				System.out.println("비김");
			}
		}
		while (true){
		System.out.println("계속할까요?(y/n >> ");
		String msg = scan.next();
		if(msg.equalsIgnoreCase("y"))
		{ 
			continue esc;
		} else if(msg.equalsIgnoreCase("n"))
		{
			break esc;
		} else {
			continue;
		}
		}
		
	}
		System.out.println("수고하셨습니다.");
		System.out.println("당신의 도전횟수 : " + totalcount + "승률 : " + (vcnt/totalcount)*100+"%");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
