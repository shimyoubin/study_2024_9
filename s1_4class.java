package ch02.bin;

import java.util.Scanner;

public class s1_4class {

	public static void main(String[] args) {
		
		 //p.99
		/*
		System.out.println("45 & 25 = " + ( 45 & 25));
		System.out.println("45 | 25 = "+ (45 | 25));
		System.out.println("45 ^ 25 = " + ( 45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("---------------------");

		byte receiveData = -120;
		
		int unsignedInt1 = receiveData &255;
		System.out.println(unsignedInt1);

		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);

		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);*/
		
		
		
		/* p.101~102
		int num1 =1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		*/
		
		/* p.106
		int score = 85;
		char grade = (score > 90)? 'A' : ((score>80)? 'B' : 'C');
		System.out.println(score + "점은"  + grade + "등급입니다.");
		*/
		
		/* p.113~114 중괄호 없어서 논리오류발생함 찾기 힘드니까 잘쓰자 */
	
		/* p.116
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		*/
		
		
		/* p.119~120
		int score = (int)(Math.random()*20) +81;
		System.out.println("점수: "+score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade ="A";
			}
			if(score>=85) {
				grade = "B+";
			}else {
				grade ="B";
			}
		
		System.out.println("학점: "+grade);
		}
		*/
		
		/* p.123
		char grade ='B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		
		}
		*/
		

		/* p.124
		char grade ='B';
		
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
			}
		}*/
		//중괄호생략 버전 있음
		
		/* p.125~126
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: "+score1);
		
	
		int score2 = switch(grade) {
		case "A"->100;
		case"B" ->{
			int result = 100 -20;
			yield result;
		}
		default -> 60;
		};
		System.out.println("score2: " + score2);
		
		*/
		
		
		
		
		/* p.129~130
		 
		for(int m=2; m<=9; m++) {
			System.out.println("***"+ m + "단 ***");
			for (int n=1; n<=9; n++) {
				System.out.println(m+"x"+n+"="+(m*n));
			}
		}
		*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.print("선택: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 ="+speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 ="+speed);
			}else if(strNum.equals("3")) {
			run = false;
			}
		
		}
		System.out.println("프로그램 종료");
		
		*/
		
		/* p.135
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		}while( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		*/
		
		/* 뭔가 이상함 다시보기!! p.136
		while (true) {
			int num =(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
			System.out.println("프로그램 종료");
		}
		*/
		
		
		/*p.137
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-"+lower);
				if(lower =='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
		*/
		
		
		/*p.138
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i+" ");
		}
		*/
		
		
		
		
		
		

		/*
		 stack -> 함수 처리? 뭐시기? 어째? 저째? 으이? method랑 class 호출할때 프레임이 생김 먼저 생긴놈이 마지막에 나간다
		 변수들이 로컬 변수가 생기는 곳이 스텍에 프레임으로 생기는 듯 == 보관
		 
		 힙영역 == 실제  
		 배열 문자열, 금고 같은 느낌 보관해서 스텍에서 참조할수 있게 도와줌?
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
