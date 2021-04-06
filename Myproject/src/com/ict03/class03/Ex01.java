package com.ict03.class03;

public class Ex01 {
	public static void main(String[] args) {
		// String Ŭ����
		String str1 = "abc";
		
		char[] data = {'a','b','c'};
		String str2 = new String(data);
		
		byte[] data2 = {97,98,99};
		String str3 = new String(data2);
		
		String str4 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		System.out.println("------�ֿ� �޼ҵ�------");
		String msg = "�ѱ� ICT ���� ���߿� 1������";
		// 1. charAt(int index) : char;
		// ��ġ���� �޾Ƽ� ����ġ�� �����ϴ� ���ڸ� ��ȯ�Ѵ�.
		// �̶� ��ġ��(index�� 0�����̴�)
		char c1 = msg.charAt(7); // ���� ���� 7��° ���ڰ� ��µȴ�.
		System.out.println(c1);
		
		// ����) ���� ���ڵ� �߿� �ҹ��ڸ� �빮�ڷ� �����Ͻÿ�
		msg = "���� I Love You 123";
		// ���ڿ��� ���̸� ������ : length() �޼ҵ� : int��
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			if(c2 >= 'a' && c2 <= 'z')
			{
				c2 = (char)(c2 - 32);
			}
			System.out.print(c2);
		System.out.println();
		}
		
		// 2. concat(String str) : String
		// ������ ���ڿ��� �� ���ڿ� ���� �����Ѵ�.
		String msg1 = "���ѹα�";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2);
		
		// 3.  contains(CharSequence s) : boolean
		// ���� ���ڿ��� �ش繮�ڿ��� �����ϸ� true, �������� ������ false
		msg = "���� I Love You 123";
		boolean b1 = msg.contains("You");
		if(b1) {
			System.out.println("���ԵǾ� �ִ�.");
		} else {
			System.out.println("���ԵǾ� ���� �ʴ�");
		}
		
		// 4. equals(Object anObject) : boolean
		//    ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false(��ҹ��� ����)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		//    ���� ���ڿ��� ���繮�ڿ��� ������ true, �ٸ��� false (��ҹ��� ��������)
		//  **����) ���ڿ��̳� ��ü�� ���� �� '=='�� ����ϸ� ������ ����? �� �ƴ϶� �ּҰ� ����?
		//    ���ڿ�����'==' ����ϸ� �ȵ�, equals �Ǵ� equalsIgnoreCase�� ����ؾ� �Ѵ�.
		
		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String ("Korea");
		String s4 = new String ("Korea");
		
		System.out.println(s1 == s2);   // false
		System.out.println(s2 == s3);   // false
		System.out.println(s3 == s4);   // false
		System.out.println();
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println();
		
		s1 = "seoul";
		s2 = "seoul";
		System.out.println(s1 == s2);                     // �ּҰ��� ����?
		System.out.println(s1.equalsIgnoreCase(s2));      // ������ ����?
		
		// 6. format(String format, Object... args) : static String
		// ������ �����ϰ� ���Ŀ� �°� ����
		// %s �� ���ڿ�, %d�� ����, %f�� �Ǽ�(�ݿø� �ȴ�.)
		String msg4 = "�ѱ� ICT ���� ���߿�";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s�� ���۳⵵�� %d�̰� ��������� %f�̴�.", msg4,s5,s6);   // %f�� �ƴ� %.1f�� ����ϰԵǸ� �Ҽ��� ù°�ڸ����� �ݿø��Ѵ�.
		System.out.println(msg5);
		
		// 7. getBytes() : byte[]
		// �ش� ���ڿ��� byte[]�� �����Ų��.
		// ���� ��/��� ��Ʈ���Ҷ� ����Ѵ�. (������ ��ҹ��ڿ� ���ڸ� ����)
		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char)(b[i]) + ":" + b[i]);
		}
		
		
		// �ݴ�� �ش� byte �迭�� ���ڿ��� ������� �ִ�.(String �������̿�)
		String msg7 = new String(b);
		System.out.println(msg7);

		// 8. toCharArray() : char[]
		// �ش� ���ڿ��� char[]�� �����Ų��.
		// ���� ��/��� ��Ʈ���� �� ����Ѵ�.(�� ���� ��� ���� ��밡��)
		String msg8 = "�ڹ�8 java8 �������� 123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		// �ݴ�� �ش� char �迭�� ���ڿ��� ������� �ִ�.(String �������̿�)
		String msg9 = new String(c);
		System.out.println(msg9);
		
		// 9. indexof(int ch) : int
		// ���ڸ� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ������ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.
		
		// 10. indexof(int ch, int fromIndex) : int
		// ���ڿ� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ã�� ���ڰ� ������ -1�̴�.
		
		// 11. indexof(String str) : int
		// ���ڿ��� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ������ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.
		
		// 12. indexof(String str, int fromIndex) : int+
		
		// ���ڿ��� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ã�� ���ڰ� ������ -1�̴�.
		
		String msg10 = "BufferedReader";
		// 'e'�� ã�ƶ�
		int k1 = msg10.indexOf('e');      // ��ġ���� 0���� ���۵Ǳ� ������ ó�� 'e'�� ��ġ���� 4�̴�.
		System.out.println(k1);
		
		// �� ��° 'e'�� ã�ƶ�
		// int k1 = msg10.indexOf('e', 5);   // ù ��° 'e'�� ��ġ���� 4�̹Ƿ� 5���� ã�ƾ� �Ѵ�.
		k1 = msg10.indexOf('e', msg10.indexOf('e')+1);
		System.out.println(k1);
		
		// �� ��° 'e'�� ã�ƶ�
		// �� ��° 'e'�� 6�̹Ƿ� 7���� ã�ƾ� �ȴ�.
		k1 = msg10.indexOf('e',msg10.indexOf('e', msg10.indexOf('e')+1)+1);
		System.out.println(k1);
				
		// ���� ���� ã��('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1);     // -1
		
		b1 = msg10.contains("A");
		System.out.println(b1);     // false
		
		// char���� String���� ã��
		k1 = msg10.indexOf("er");
		System.out.println(k1);
		
		// �� ��° "er" ã��
		k1 = msg10.indexOf("er", msg10.indexOf("er")+1);
		System.out.println(k1);
		
		// 11. lastIndexOf(int ch) : int
		//     lastIndexOf(String str) : int
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1);
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);
		
		// 12. isEmpty() : boolean
		//     ���ڿ��� ���̰� 0�̸� true, �ƴϸ� false
		//     ��������� true, �ƴϸ� false
		// 13. length() : int
		//     ���ڿ��� ���̸� ���ڷ� ǥ��
		String msg11 = "";
		String msg12 = "java";
		
		System.out.println(msg11.isEmpty());
		System.out.println(msg12.isEmpty());
		
		System.out.println(msg11.length());
		System.out.println(msg12.length());
		System.out.println();
		
		// 14. replace(char oldChar, char newChar)         : String
		//     replace(String target, String replacement)  : String
		//     ���ڳ� ���ڿ��� �޾Ƽ� ġȯ�ϱ�
		String msg13 = "���ѹα�";
		String msg14 = msg13.replace("���ѹα�", "korea");
		String msg15 = msg13.replace(msg13, "korea");
		String msg16 = msg13.replace('��', '��');
		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);
		
		// 15. split(String regex) : String[]
		//     �����ڸ� �޾Ƽ� �迭�� ������.(�迭ũ��� �˾Ƽ� �ڵ�����)
		//     split(String regex, int limit) : String[]
		//     �����ڸ� �޾Ƽ� �迭�� ������.(limit�� �迭�� ũ��)
		String msg17 = "���, ����, ����, ������, ���ξ���";
		String[] res = msg17.split(",");
		// System.out.println(res[0]);
		// System.out.println(res[1]);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println();
		String[] res2 = msg17.split(",",3);
		System.out.println(res[0]);
		System.out.println(res[1]);
		System.out.println(res[2]);
		
		String[] res3 = msg17.split(",",10);
		for (int i = 0; i < res3.length; i++) {
			System.out.println("i= " + i + ", res= " + res[i]);
		}
		
		// 16. substring(int beginIndex) : String
		//     ������ġ�� �޾Ƽ� �ش� ���ڿ� ������ ���ڿ� ����
		// 16. substring(int beginIndex, int endIndex) : String
		//     ������ġ�� �� ��ġ�� �޾Ƽ� �ش� ���ڿ� ������ ���ڿ� ���� (����ġ�� ������ �ȵ�)
		
		String msg18 = "010-7979-9999";
		String res4 = msg18.substring(4);
		String res5 = msg18.substring(4, 8);
		String res6 = msg18.substring(msg18.indexOf('-')+1,msg18.lastIndexOf('-'));
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		
		String msg19 = "770707";
		// �¾ �⵵ ����
		String res7 = msg19.substring(0,2);
		// �¾ �� ����
		String res8 = msg19.substring(2,4);
		System.out.println("==================================================");
		// ����)) 010-7777-9999 => 00-XXXX-9999, 010-7777-XXXX
		String quiz = "010-7777-9999";
		String[] anser = quiz.split("-");
		String anser2 = anser[1].replace(anser[1],"XXXX");
		String anser3 = anser[0] + anser2 + anser[2];
		System.out.println(anser[1]);
		System.out.println(anser[2]);
		System.out.println(anser[3]);
		System.out.println("==================================================");
		
		// 17. toLowerCase() : String
		//     �ش� ���ڿ��� ��� �빮�ڸ� �ҹ��ڷ� ����
		
		// 18. toUpperCase() : String
		//     �ش� ���ڿ��� ��� �ҹ��ڸ� �빮�ڷ� ����
		
		String msg20 = "�ڹ�8 java8 Java8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		System.out.println(res9);
		System.out.println(res10);
		System.out.println();
		
		// 19. toString() : String
		//     String�� toString() : ���ڿ� ��ü�� ��ȯ
		//     Object�� toString() : ��� ��ü���� ��밡��
		//                           ��ü�� ������ �ִ� ������ ������ ���ڿ��� ������ �� ���
		//                           (�������̵��� �� �ٽ� ���)
		
		String msg21 = "java8 Java8 �ڹ�8";
		String res11 = msg21.toString();
		
		System.out.println(msg21);
		System.out.println(res11);
		
		// 20. trim() : String
		//     �ش� ���ڿ��� ��, �� �ִ� ���� ����, �߰������� ���� ����(�߰������� ������� �Ѵ�.)
		String msg22 = "    java   �ڹ�   JAVA    ";
		System.out.println(msg22);
		System.out.println(msg22.trim());
		System.out.println(msg22.length());
		System.out.println(msg22.trim().length());
		System.out.println();
		
		// 21. valueOf(�����ڷ���) : static String
		//     � �ڷ����̵��� String���� �����Ų��.
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 100l;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		// �����ڷ����� +1;
		// System.out.println(p1+1);    �����߻�(boolean�� +������ �Ҽ� ����.)
		System.out.println(p2+1);
		System.out.println(p3+1);
		System.out.println(p4+1);
		System.out.println(p5+1);
		System.out.println(p6+1);
		System.out.println();
		
		// String���� ������Ѽ� +1
		System.out.println(String.valueOf(p1)+1);
		System.out.println(String.valueOf(p2)+1);
		System.out.println(String.valueOf(p3)+1);
		System.out.println(String.valueOf(p4)+1);
		System.out.println(String.valueOf(p5)+1);
		System.out.println(String.valueOf(p6)+1);
		System.out.println();
		
		System.out.println(p1 + "1");
		System.out.println(p2 + "1");
		System.out.println(p3 + "1");
		System.out.println(p4 + "1");
		System.out.println(p5 + "1");
		System.out.println(p6 + "1");
		System.out.println();
		
		// 21�� �ݴ밳�� (���� �ڷ��� ����� ���ڿ��� ���� �ڷ������� ����)
		// Wrapper Class
		//  - �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� ���� ��Ű�� Ŭ������
		//  - ���� �ǹ̴� �⺻�ڷ����� ��ü�� ���� �� ����ϴ� Ŭ����
		//    (������ �ڵ����� ���������)  => ����ڽ�
		//    �⺻�ڷ��� => ��ü�� �ڵ����� ���� => ����ڽ�
		//    ��ü�� => �⺻�ڷ��� �ڵ����� ���� => �����ڽ�
		
		// 1. boolean������ ���ڿ��� Boolean ������ ����
		msg = "29";
		
		/*    boolean���� �ƴ϶� �����߻�
		if(msg) {
			break;
		}
		*/
		
		Boolean a1 = Boolean.parseBoolean(msg);
		if(a1) {
			System.out.println("���漺��");
		} else {
			System.out.println("���漺��2");
		}
		
		// 2. int������ ���ڿ��� int���� ���� : Integer.parseInt(String s)
		msg =   "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg+10);
		System.out.println(a2+10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}