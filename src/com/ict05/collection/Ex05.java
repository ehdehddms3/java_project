package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;



public class Ex05 {
	/* List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector;
	   Stack(스택) : LIFO (Last In First Out) : 마지막에 들어온 데이터가 가장 먼저 나감
	   ● 주요메소드
	   add, push,addElement => 추가
	   add(index, E) => 삽입
	   pop : 맨위에 존재하는 객체를 반환하고 삭제한다.
	   peek : 맨위에 존재하는 객체를 반환하고 삭제는 하지않음. (무한루프조심)
	   search : 검색(오른쪽, 1부터)
	   indexOf :검색(왼쪽, 0부터) => 배열방식
	   elementAt(index) (-> String에서 get과 같은 방식) : 위치값을 받아서 해당 객체 추출
	   get(index) : 위치값을 받아서 해당 객체 추출
	   firstElement : 맨 처음 요소 추출
	   lastElement : 가장 나중 요소 추출
	   setElement(Element, index) : 치환(해당index값을 받아서 위치와 치환한다)
	   */
	public static void main(String[] args) {
	
	Stack<String> stack = new Stack<String>();
	stack.add("둘리");
	stack.addElement("공실");
	stack.push("마이콜");
	System.out.println(stack);

	stack.add(1, "도우너"); // 삽입
	stack.add(0, "또치");   // 삽입
	stack.add(1, "뿌꾸");   // 삽입 (중복아님)
	stack.add(1, "둘리");   // 중복 사용 가능 
	
	System.out.println(stack);
	System.out.println("===============================");
	
	// 마지막 개체보기 pop(삭제), peek(삭제X = for문 사용하면 무한 루프)
	System.out.println(stack.peek());
	System.out.println(stack);
	
	System.out.println(stack.pop());
	System.out.println(stack);
	
	System.out.println("===============================");
	// contains, indexOf, search, get, elementAt, firstElement, lastElement
	if (stack.contains("둘리")) {
		//System.out.println("존재한다.");
		System.out.println(stack.indexOf("둘리")+"번째 위치");   // 왼쪽에서부터 찾음
		System.out.println(stack.search("둘리")+"번째 위치");    // 오른쪽에서부터 찾음
		// 해당위치의 객체 꺼내기
		System.out.println(stack.get(1));
		System.out.println(stack.get(stack.indexOf("둘리")));
		System.out.println(stack.elementAt(stack.indexOf("둘리")));
		
	} else {
		System.out.println("존재하지않음");
	}
	
	// size, set(치환) setElementAt(치환)
	System.out.println(stack.size()+"요소가 존재합니다.");
	
	stack.set(3, "마이콜");
	// stack.setElementAt("마이콜", 3);
	System.out.println(stack);
	
	System.out.println("===============================");
	// 하나씩 꺼내기 (개선된 for, iterator (데이터가 그대로 존재) , pop (데이터가 삭제됨)
	// 개선된 for문
	for (String k : stack) {
		System.out.println(k);
	}
	System.out.println(stack.size()+"요소가 존재합니다.");
	
	Iterator<String> it = stack.iterator();                            // iterator는 왼쪽에서부터 시작
	while(it.hasNext()) {
		String msg = (String) it.next();
		System.out.println(msg);
	}
	System.out.println(stack.size()+"요소가 존재합니다.");
	
	while(! stack.isEmpty()) {                                        // pop은 오른쪽에서부터 시작
		String k = stack.pop();
		System.out.println(k + "삭제됨, 크기는 " + stack.size());
	}
	
	
	
	
	
	
	
	
	
	}
}
