package com.ict03.class01;

public class Ex03_main {
<<<<<<< HEAD
	public static void main(String[] args) {
	// Ex03 Ŭ������ ��ü�� ������ 
	   Ex03 test = new Ex03();
	   
	   // plus01�� void�̹Ƿ� ���� ������ ����.
	   System.out.println(1);
	   //test.plus01();
	   System.out.println(3);
	   System.out.println(test.result);
	   
	   // sub01�� ��ȯ���� int �̹Ƿ� 
	   // ���� ������ int�� ������ 
	   int sub = test.sub01();
	   System.out.println(sub);
	}
=======
public static void main(String[] args) {
	// Ex03 Ŭ������ ��ü�� ������
	
	Ex03 test = new Ex03();
	
	// plus01�� void�̹Ƿ� ���� ������ ����.
	System.out.println(1);
	test.plus01();                   // ȣ���ϰԵǸ� �����ϰԵ�
	System.out.println(3);
	System.out.println(test.result); // ȣ������������ ���� ������� ����
	
	// sub01�� ��ȯ���� int�̹Ƿ� ���庯���� int�� �����.
	int sub = test.sub01();
	System.out.println(sub);
}
>>>>>>> branch 'master' of https://github.com/ehdehddms3/java_project
}
