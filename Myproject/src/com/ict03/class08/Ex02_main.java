package com.ict03.class08;

public class Ex02_main {

	public static void main(String[] args) {
	// Member ����Ŭ������ ������ ��ü ���� ����
	// Inner 01 t1 = new Inner01();
	
	// �ܺ�Ŭ������ ���ؼ� ����Ŭ���� ��밡��
		Ex02 t1 = new Ex02();
		
	// �ܺθ� ���ؼ� ����Ŭ���� ����
		Ex02.Inner01 t2 = t1.new Inner01();
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		System.out.println();
		t2.play();
		
		
		
		
		
		
		
		
		
		
		
	}

}