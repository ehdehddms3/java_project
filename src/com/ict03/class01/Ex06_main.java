package com.ict03.class01;

public class Ex06_main {

	public static void main(String[] args) {
		Ex06 test = new Ex06();
		
		String s1 = test.k1();    // k1�� �����ϸ� k1�� ȣ���Ͽ� s1�� ����ȴ�.
		System.out.println("�̸� : " + s1);
		
		int s2 = test.k2();
		System.out.println("���� : " +  s2);
		
		double s3 = test.k3();
		System.out.println("Ű : " + s3);
		
		char s4 = test.k4();
		System.out.println("���� : " + s4);
		
		System.out.println();
		
		test.m1("��浿");
		System.out.println("�̸� : " + test.k1());
		
		test.m2(40);
		System.out.println("���� : " +  test.k2());
		
		test.m3(170.3);
		System.out.println("Ű : " +  test.k3());
		
		test.m4('B');
		System.out.println("��ũ : " +  test.k4());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
