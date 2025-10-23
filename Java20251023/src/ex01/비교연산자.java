package ex01;

public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numA = 5;
		int numB = 10;
		
		System.out.println(numA == numB);
		System.out.println(numA != numB);
		System.out.println(numA < numB);
		System.out.println(numA >= numB); 
		
		System.out.println("-----------------------");
		String s1 = "korea";
		String s2 = "korea";
		System.out.println(s1 == s2);
	    //System.out.println(s1.equals(s2)); 둘다 가능
		
		System.out.println("--------------------------");
		
		String s3 = new String("korea");
		String s4 = new String("korea");
		//System.out.println(s3 == s4); X 비교할 시 equals
		System.out.println(s3.equals(s4));
		
		System.out.println("-----논리연산------");
		numA = 5;
		numB = 10;
		int numC = 3;
		int numD = 9;
		
		System.out.println(numA < numB);
		System.out.println(numC < numD);
		
		System.out.println("---------and----------");
		System.out.println((numA < numB) & (numC < numD));
		//--> 둘다 조건 만족하면 true
		System.out.println("---------or----------");
		System.out.println((numA > numB) | (numC < numD));
	     //--> 둘중 하나만 조건 만족하면 true
	
	    System.out.println(!(6>4));
	    //--> !(연산) 연산 false 만들기
	    
	    
	    System.out.println(15^ 5);
	    
	}

}
