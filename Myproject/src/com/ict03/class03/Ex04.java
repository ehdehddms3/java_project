package com.ict03.class03;

import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// ��ǻ�Ϳ� ���������� �����ϱ�
		// ��ǻ�ʹ� ����(0), ����(1), ��(2)�� ���´�
		// ����ڰ� ����,����,���� �����ؼ� ��ǻ�Ϳ� ������ �Ѵ�
		
		Scanner scan = new Scanner(System.in);
		int totalcount = 0;
		int vcnt = 0;
		esc :
		while (true) {
		int pc = (int)(Math.random()*3);
		System.out.print("1.����, 2.����, 3.�� >> ");
		int user =scan.nextInt();
		if (pc == 0) {
			if(user == 1) {
				System.out.println("���");
			} else if(user == 2) {
				vcnt++;
				System.out.println("�̱�");
			} else if(user == 3) {
				System.out.println("��");
			}
		} else if(pc == 1) {
			if(user == 1) {
				System.out.println("��");
			} else if(user == 2) {
				System.out.println("���");
			} else if(user == 3) {
				vcnt++;
				System.out.println("�̱�");
			}
		} else if(pc == 2) {
			if(user == 1) {
				vcnt++;
				System.out.println("�̱�");
			} else if(user == 2) {
				System.out.println("��");
			} else if(user == 3) {
				System.out.println("���");
			}
		}
		while (true){
		System.out.println("����ұ��?(y/n >> ");
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
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("����� ����Ƚ�� : " + totalcount + "�·� : " + (vcnt/totalcount)*100+"%");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}