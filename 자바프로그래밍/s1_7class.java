package ch011_2_1;

public class s1_7class {

	public static void main(String[] args) {
		
		//p.230~231 *Car.java
		/*
		Car car1 = new Car("자가용");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : "+ car1.color);
		System.out.println();
		
		Car car2 = new Car("자가용", "빨강");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : "+ car2.color);
		System.out.println();
		
		Car car3 = new Car("택시","검정", 200);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : "+ car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		 */
		
		
		//p.233 ~ 235 *Calculator.java
		/*
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: "+result1);
		
		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
		*/
		
		
		//p.237~238  *Computer
		/*
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1: "+result1);
		
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("resutl2: "+result2);
		
		int[] values = {1,2,3,4,5};
		int result3 = myCom.sum(values);
		System.out.println("result3: "+ result3);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result4: "+result4);
		*/
		
		
		
		//p.239~241
		/*
		Car1 myCar = new Car1();
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");
		
		*/
		
		
		//p.243
		/*
		Calculator1 myCalc = new Calculator1();
		
		double resutl1 = myCalc.areaRactangle(10);
		
		double result2 = myCalc.areaRactagle(10, 20);
		
		System.out.println("정사각형 넓이=" + resutl1);
		System.out.println("직사각형 넓이=" + result2);
		
		*/
		
		
		
		//p.245~246
		/*
		car3 myCar = new car3("포르쉐");
		car3 yourCar = new car3("벤츠");
		
		myCar.run();
		yourCar.run();
		*/
		
		
		
		//p.249~250
		/*
		double result1 =10 * 10 * Calculator2.pi;
		int result2 = Calculator2.plus(10,5);
		int result3 = Calculator2.minus(10, 5);
		
		System.out.println("result1 : " +result1);
		System.out.println("result2 : " +result2);
		System.out.println("result3 : " +result3);
		*/
		
		
		
		//p.251
		/*
		System.out.println(Television.info);
		*/
		
		
		// p.253~254 Car3_1 참고
		
		
		
		//p.255 ~ 256
		
		Korean k1 = new Korean ("123456-1234567", "김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name = "김자";		
		System.out.println(k1.name);
		
		
		
		//p.257~258
		/*
		System.out.println("지구의 반지름: "+ Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적: "+ Earth.EARTH_SURFACE_AREA + "km^2");
		
		*/
		
		
		

		
		}
		
		
	}


