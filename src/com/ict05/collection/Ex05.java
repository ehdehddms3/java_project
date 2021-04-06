package com.ict05.collection;

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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
