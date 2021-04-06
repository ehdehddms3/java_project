package com.ict03.class01;

public class Ex06_main {
<<<<<<< HEAD
	public static void main(String[] args) {
		Ex06 t = new Ex06();
		
		String s1 = t.k1();
		System.out.println("이름 : " + s1);
		
		int s2 = t.k2();
		System.out.println("나이 : " + s2);
		
	    double s3 = t.k3();
	    System.out.println("키 : " + s3);
	    
	    char s4 = t.k4();
	    System.out.println("랭크 "+54);
	    
	    t.m1("고길동");
	    System.out.println("이름 : " + t.k1());
	    
	    t.m2(37);
	    System.out.println("나이 : " + t.k2());
	    
	    t.m3(170.4);
	    System.out.println("키 : " + t.k3());
	    
	    t.m4('B');
	    System.out.println("랭크 : " + t.k4());
	}
=======

	public static void main(String[] args) {
		Ex06 test = new Ex06();
		
		String s1 = test.k1();    // k1을 실행하면 k1을 호출하여 s1에 저장된다.
		System.out.println("이름 : " + s1);
		
		int s2 = test.k2();
		System.out.println("나이 : " +  s2);
		
		double s3 = test.k3();
		System.out.println("키 : " + s3);
		
		char s4 = test.k4();
		System.out.println("학점 : " + s4);
		
		System.out.println();
		
		test.m1("고길동");
		System.out.println("이름 : " + test.k1());
		
		test.m2(40);
		System.out.println("나이 : " +  test.k2());
		
		test.m3(170.3);
		System.out.println("키 : " +  test.k3());
		
		test.m4('B');
		System.out.println("랭크 : " +  test.k4());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

>>>>>>> branch 'master' of https://github.com/ehdehddms3/java_project
}
