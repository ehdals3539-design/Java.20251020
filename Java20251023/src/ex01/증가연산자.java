package ex01;

public class 증가연산자 {

	public static void main(String[] args) {
		
		/*
		 * ++A : 선위 연산자(증가)
		 * B++ : 후위 연산자
		 * --A : 감소
		 * B-- : 
		 */
		
		int iNum = 10;
		System.out.println(iNum);
		
		iNum = iNum+1;
		System.out.println(iNum);

        iNum += 2;
        System.out.println(iNum);
        
        ++iNum; //+1증가만 가능
        System.out.println(iNum);

        --iNum;
        System.out.println(iNum);
        int iNum2 = 1;
        int iB = iNum2++;
        /*
         *  iNum2 +=1
         *  int iB = iNum2;
         */
     
        System.out.println(iNum2);
        System.out.println(iB);
        
        
        
	}

}
