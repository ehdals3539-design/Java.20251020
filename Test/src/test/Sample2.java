package test;

public class Sample2 {

	public static void main(String[] args) {
	  
		Person p = new Person();
		p.name ="고건우";
		p.age= 20;
		System.out.println(p.name);
		System.out.println(p.age);
	
		
	Game g = new Game();
			
		
		g.name = "thyrweiqther";
		g.jop = "hunter";
	
				
		System.out.println(g.name);
		System.out.println(g.jop);
		
		}

}

	
	


class Game{

	String name;
	String jop;
	
	
}


class Person{
	
	String name;
	int age;
}
	