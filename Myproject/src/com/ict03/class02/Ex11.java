package com.ict03.class02;

public class Ex11 {
	// ������ : Ŭ������ ��ü�� ���� �� �ڵ����� �ѹ� ȣ��ȴ�.
	//  ����  : ����ʵ�(������ ���)�� �ʱ�ȭ
	//  Ư¡  : Ŭ�����̸��� �������̸��� ����.
	//          Ŭ�����̸�([����=�Ű�����]); 
	//          ��ȯ���� ���� �޼ҵ��� �Ѵ�.
	//          �����ڸ� ������ ������ �ڵ����� �⺻�����ڷ� ��ü�� �����Ѵ�.
	//          �⺻�����ڶ� ���ڰ� ���� �����ڸ� ���Ѵ�.(Ŭ�����̸�())
	//          �����ڵ� �����ε��� �ȴ�.
	//          (�ϳ��� Ŭ������ �������� �����ڰ� ������ �� �ִ�.)
	//          ��, ������ ������ ������ ������ �޶�� �Ѵ�.
	//          �����ε��̶� �ϳ��� Ŭ�����ȿ� �����̸��� �޼ҵ尡 ������ �����ϴ� ���� ����.
	//          ��, ������ ������ ������ ������ �޶�� �Ѵ�.
	//          Ŭ�����ȿ��� �����ڸ� ��������� ������� �����ڸ� ����ؾ� �Ѵ�.
	
	private String name = "�Ѹ�";
	private int age = 24;
	private boolean gender = true;
	
	// ������ �����ε�
	// �⺻������
	public Ex11() {
		System.out.println("�⺻������");
		name = "�±Ǻ���";
		age = 43;
	}
	
	// �⺻�����ڰ� �ƴ� �ٸ� ������( ���ڰ��ִ� ������ ����)
	public Ex11(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(1);
	}	
	// �⺻�����ڰ� �ƴ� �ٸ� ������( ���ڰ��ִ� ������ ����)
	public Ex11(int age, String name) {
			this.name = name;
			this.age = age;
			System.out.println(2);
	}
	// getter() / setter()
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
