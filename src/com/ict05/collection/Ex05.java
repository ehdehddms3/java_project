package com.ict05.collection;

import java.util.Iterator;
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
	
	System.out.println(stack.pop());
	System.out.println(stack);
	
	System.out.println("===============================");
	// contains, indexOf, search, get, elementAt, firstElement, lastElement
	if (stack.contains("�Ѹ�")) {
		//System.out.println("�����Ѵ�.");
		System.out.println(stack.indexOf("�Ѹ�")+"��° ��ġ");   // ���ʿ������� ã��
		System.out.println(stack.search("�Ѹ�")+"��° ��ġ");    // �����ʿ������� ã��
		// �ش���ġ�� ��ü ������
		System.out.println(stack.get(1));
		System.out.println(stack.get(stack.indexOf("�Ѹ�")));
		System.out.println(stack.elementAt(stack.indexOf("�Ѹ�")));
		
	} else {
		System.out.println("������������");
	}
	
	// size, set(ġȯ) setElementAt(ġȯ)
	System.out.println(stack.size()+"��Ұ� �����մϴ�.");
	
	stack.set(3, "������");
	// stack.setElementAt("������", 3);
	System.out.println(stack);
	
	System.out.println("===============================");
	// �ϳ��� ������ (������ for, iterator (�����Ͱ� �״�� ����) , pop (�����Ͱ� ������)
	// ������ for��
	for (String k : stack) {
		System.out.println(k);
	}
	System.out.println(stack.size()+"��Ұ� �����մϴ�.");
	
	Iterator<String> it = stack.iterator();                            // iterator�� ���ʿ������� ����
	while(it.hasNext()) {
		String msg = (String) it.next();
		System.out.println(msg);
	}
	System.out.println(stack.size()+"��Ұ� �����մϴ�.");
	
	while(! stack.isEmpty()) {                                        // pop�� �����ʿ������� ����
		String k = stack.pop();
		System.out.println(k + "������, ũ��� " + stack.size());
	}
	
	
	
	
	
	
	
	
	
	}
}
