package com.ict03.class03;


public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer, StringBuilder => ���ڿ��� ����ϰ� ����,����,�߰��� ��� ����� �����Ѵ�.
		
		String msg = "hello";
		System.out.println(msg);
		
		// String�� �Һ��� �Ӽ��� ������ �־
		// �޸� ���ο� ������ �����ؼ� hello java�� ���� �����.
		msg = msg + " java";
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.toString());
		
		// ������ �߰��� �� (append("���ڿ�");
		sb.append("JAVA");
		
		System.out.println(sb.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
