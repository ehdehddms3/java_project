package com.ict05.collection;

import java.util.Stack;

public class Ex05 {
	/* List �������̽��� ������ Ŭ������ : Stack, ArrayList, Vector;
	   Stack(����) : LIFO (Last In First Out) : �������� ���� �����Ͱ� ���� ���� ����
	   �� �ֿ�޼ҵ�
	   add, push,addElement => �߰�
	   add(index, E) => ����
	   pop : ������ �����ϴ� ��ü�� ��ȯ�ϰ� �����Ѵ�.
	   peek : ������ �����ϴ� ��ü�� ��ȯ�ϰ� ������ ��������. (���ѷ�������)
	   search : �˻�(������, 1����)
	   indexOf :�˻�(����, 0����) => �迭���
	   elementAt(index) (-> String���� get�� ���� ���) : ��ġ���� �޾Ƽ� �ش� ��ü ����
	   get(index) : ��ġ���� �޾Ƽ� �ش� ��ü ����
	   firstElement : �� ó�� ��� ����
	   lastElement : ���� ���� ��� ����
	   setElement(Element, index) : ġȯ(�ش�index���� �޾Ƽ� ��ġ�� ġȯ�Ѵ�)
	   */
	public static void main(String[] args) {
	
	Stack<String> stack = new Stack<String>();
	stack.add("�Ѹ�");
	stack.addElement("����");
	stack.push("������");
	System.out.println(stack);

	stack.add(1, "�����"); // ����
	stack.add(0, "��ġ");   // ����
	stack.add(1, "�Ѳ�");   // ���� (�ߺ��ƴ�)
	stack.add(1, "�Ѹ�");   // �ߺ� ��� ���� 
	
	System.out.println(stack);
	System.out.println("===============================");
	
	// ������ ��ü���� pop(����), peek(����X = for�� ����ϸ� ���� ����)
	System.out.println(stack.peek());
	System.out.println(stack);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
