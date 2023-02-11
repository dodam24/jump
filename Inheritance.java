package object_;
	class Animal_ {
		String name;
		
		void setName(String name) {
			this.name = name;
		}
	}
	
class Dog extends Animal_ { // Animal 클래스를 상속	
	void sleep() {
		System.out.println(this.name + " zzz");
	}

}	
	
public class Inheritance {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();

	}

}
