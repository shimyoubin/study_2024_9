package ch16.D1108;

public class s1_9class {

	public static void main(String[] args) {
		
		//p.298~300
		/*
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();                                                                                           
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		*/
		
		//p.310~311
		/*
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// 호출 불가!! parent,method3();
		
		*/
		
		//p.320~321
		/*
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		*/
		
		
		//p.313~314
		/*
		Parent1 parent = new Child1();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child1 child = (Child1) parent;
		
		child.field2 = "data2";
		child.method3();
		*/
		
		
		//p.323~325
		//instanceofEx, Person, Student <- 참고
		
		
		
		//p.327~328
		/*
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
		*/
		
		//p.330~331
		/*
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		*/
		
		Person1 p = new Person1();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	
		
	}
	/*
	public static void animalSound(Animal animal) {
		animal.sound();
		//330~331
		
	}*/
}
