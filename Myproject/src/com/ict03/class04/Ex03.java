package com.ict03.class04;

public class Ex03 extends Ex02 {

	String name = "���θ�";
	int age = 34;
	private String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ� Ŭ���� ������");
	}
	public void sound() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		// ��ü �������� �θ�Ŭ������ ����� ����� ��
		System.out.println("������� : " + addr);
		
		// ���������� ������ ������������ ��������
		System.out.println("name : " + this.name);    // ���θ� (�ڽ��� this�� ����)
		
		System.out.println("name : " + super.name);   // ������ (�θ�� super�� ����)
		
		// ��Ӱ���� private�� ����� �� ����.
		// System.out.println("�츮�� �ֿϵ��� :" + dog);
	}
}