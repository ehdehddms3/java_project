package com.ict03.class02;

public class Ex14 {
	// static : ��ü ������ ������� �̸� ��������� �ʵ�� �޼ҵ�
	//          Ŭ������ ������������ ����� �� ����
	//          ��������(��� ��ü�� ����� �� �ִ�.)
	//          ���������ڰ� private�̸� static�̶� ������ �� ����
	
	int su1 = 10;
	static int su2 = 10;
	
	public Ex14() {
		su1++;
		su2++;
		
	}
	public void prn() {
		int su3 = 10;
		// static int su4 = 10;     -> ���������ڸ��̱� ����
	}
	// static �޼ҵ�� instance ���� �����ȵ�(static ������ ��밡��)
	public static void prn2() {
		// System.out.println(su1);
		System.out.println(su2);
		int su4 = 10;
		// static int su5 = 10;     -> ���������ڸ��̱� ����(�޼ҵ带 ������ �� �������) 
	}
	
	
	
	
	
	
	
}
