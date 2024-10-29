package ch011_2_1;

public class Car3_1 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simylate() {
		Car3_1 myCar = new Car3_1();
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simylate();
		
		
		
		Car3_1 myCar = new Car3_1();
		myCar.speed = 60;
		myCar.run();
	}
}
