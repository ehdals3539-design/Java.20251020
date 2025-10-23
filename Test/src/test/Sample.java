package test;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello java");
		System.out.println("Hello java");
		
	
	
	char var1 = 'A';
	char c1 = 126;
	
	
	
	char var2 = '가';
	char c2 = 44032;		
	
	
	System.out.print(var1);
	System.out.println(c1);

	
	System.out.println(var2);
	System.out.println(c2);
	
	float f1 = 10.7f;
	
	double d1 = 10.5;
	
	System.out.println(f1);
	System.out.println(d1);
	
	float f2 = 2147483648f;
	float f3 = 2147483668f;
	float f4 = 2147483658l;
	

	
	System.out.println(f2);
	System.out.println(f3);
	System.out.println(f4);
	;

	String str1 = "고건우";
	String str2 = "홍길동";
	
	System.out.println(str1);
	System.out.println(str2);
	
	int a = 35695;
	byte b = 20;

	//강제 형변환
	b = (byte)a;

	
	System.out.println(a);
	System.out.println(b);
	
	System.out.println();
	
	System.out.println(a);
	System.out.println(b);
	
	double dNum = 10.5;
	int iNum = 10;
	dNum = iNum; //자동형변환 dNum = (double)iNum -> dNum = 10.0
	System.out.println("dNum : " + dNum);
	
	dNum = 20.5;
	iNum = (int)dNum; //강제형변환 iNum = (int)dNum -> iNum = 20.5 -> iNum = 20
	System.out.println("iNum : "+ iNum);
	
	//double 실수형 -> int 강제변환 -> 정수로 변환 = 20
	
	int iNum2 = 5;
	int iNum3 = 2;
	
	dNum = iNum2 / (float)iNum3; 
	System.out.println("dNum : " + dNum);
	
	
	/*
	 * 이름 명명
	 * 
	 * 나이 : a(x), age(0)
	 * 
	 * 클래스명 기입 -> 사람 클래스 -> person
	 * 
	 * 변수명,클래스명 -> 영문대소문자 ,숫자 ,특수문자( _ , $ ) 조합해서 만들 수 있음 
	 * 단,숫자는 맨 앞에 기입할 수 없다, 예약어는 사용할 수 없다.
	 * age(0)
	 * _age(0)
	 * $age(0)
	 * 1age(X)
	 */
	
	}

}
