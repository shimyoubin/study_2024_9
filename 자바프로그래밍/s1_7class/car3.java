package ch011_2_1;

public class car3 {
	String model;
	int speed;
	
	car3(String model){
		this.model =model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니디.(시속:"+this.speed+"km/h)");
	}
	
}
