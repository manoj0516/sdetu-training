package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
	
		System.out.println(name + " is walking");
		
	}
	
	void eat() {
		
		System.out.println(email);
		
	}
	
	void sleep() {
		
		System.out.println(name + " is sleeping");
		
	}
	
}




public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@testmail.com";
		person1.phone = "1234567890";
		
		person1.walk();
		person1.eat();
		person1.sleep();
		
		
	/*	
		// TODO Auto-generated method stub
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "7891234567";
		
		// Some activity of person
		
		walking(name);

		String name2 = "Mike";
		String email2 = "Mike@testemail.com";
		String phone2 = "7891234567";
		
		// Some activity of person
		walking(name2);
		
		*/
		
		
		
	}
	
	static void walking (String name) {
		
		System.out.println(name+" is walking");
		
		
	}

}
