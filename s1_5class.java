package ch02.bin;

public class s1_5class {

	public static void main(String[] args) {
		
		//5.5 158~159
		/*
		String strV1 = "홍길동";
		String strV2 = "홍길동";
		
		if(strV1 == strV2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar2과 strVar2는 참조가 다름 ");
		}
		if(strV1.equals(strV2)) {
			System.out.println("strVar1과 StrVar2는 문자열이 같음");
		}
		String strV3 = new String("홍길동");
		String strV4 = new String("홍길동");
		
		if(strV3 == strV4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름 ");
		}
		if(strV3.equals(strV4)) {
			System.out.println("strVar3과 StrVar4는 문자열이 같음");
		}
		*/
		
		
		
		/*
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자");
		}*/
		
		
		// 160, 163, 165
		/*
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		*/
		
		
		
		
		/*
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		*/
		
		/*
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		*/
		
		
		//166
		/*
		String board = "1, 자바 학습,참조 타입 String을 학습힙니다.,홍길동";
		
		String[] 
		
		tokens = board.split(",");
		
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		*/
		
		
		//170~171
		/*
		String[] season = { "Spring", "Summer", "Fall", "Winter" };
		
		System.out.println("season[0]" + season[0]);
		System.out.println("season[1]" + season[1]);
		System.out.println("season[2]" + season[2]);
		System.out.println("season[3]" + season[3]);
		
		season[1] = "여름";
		System.out.println("season[1]" + season[1]);
		System.out.println();
		
		int[] scores = { 83, 90, 87};
		
		int sum =0;
		for(int i=0; i<3;i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		double avg = (double)sum/3;
		System.out.println("평균 : "+ avg);
		*/
		
		
		
		
		/*
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : "+ sum1);
		
		printItem(new int[] {83, 90, 87});
		
	}
	public static void printItem( int[] scores ) {
		for(int i =0; i<3; i++) {
			System.out.println("score["+i+"]:" + scores[i]);
		}
		 */
		
		
		//175~176 초기화값들 확인!!
		
		/*
		int[] arr1 = new int [3];
		for(int i=0; i<3; i++) {
			System.out.print("arr1["+i+"] : "+arr1[i]+", ");
		}
		System.out.println();
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i =0; i<3; i++) {
			System.out.print("arr1["+i+"] : "+arr1[i]+", ");
		}
		System.out.println("\n");
		
		double[] arr2= new double[3];
		for(int i=0; i<3; i++){
			System.out.print("arr2["+i+"] : "+arr2[i]+", ");
		}
		System.out.println();
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i=0; i<3; i++){
			System.out.print("arr2["+i+"] : "+arr2[i]+", ");
		}
		System.out.println("\n");
		
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++){
			System.out.print("arr3["+i+"] : "+arr3[i]+", ");
		}
		System.out.println();
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i=0; i<3; i++){
			System.out.print("arr3["+i+"] : "+arr3[i]+", ");
		}
		
		*/
		
		
		
		
		//181~182
		/*
		int[][] scores = {
				{80, 90, 96},
				{76,88}
		};
		
		System.out.println("1차원 배열 길이(반의 수): "+ scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생수): "+scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생수): "+scores[1].length);
		
		System.out.println("scores[0][2]:" + scores[0][2]);
		
		System.out.println("scores[1][1]:" + scores[1][1]);
		
		int class1sum =0;
		for(int i=0; i<scores[0].length; i++) {
			class1sum += scores[0][i];
		}
		double class1avg = (double)class1sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1avg);
		
		
		int class2sum =0;
		for(int i=0; i<scores[1].length; i++) {
			class2sum += scores[1][i];
		}
		double class2avg = (double)class2sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2avg);
		
		int totalstudent = 0;
		int totalsum =0;
		for(int i=0; i<scores.length; i++) {
			totalstudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++)
				totalsum += scores[i][k];
			
		}
		double ta = (double)totalsum / totalstudent;
		System.out.println("전체 학생의 평균 점수: " + ta);
		*/
		
		
		//184 ~ 186
		
		int [][] mS = new int [2][3];
		for(int i=0; i<mS.length; i++) {
			for(int k=0; k<mS[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]: "+ mS[i][k]);
			}
		}
		System.out.println();
		
		mS[0][0] = 80;
		mS[0][1] = 83;
		mS[0][2] = 85;
		mS[1][0] = 86;
		mS[1][1] = 90;
		mS[1][2] = 92;
		
		int tS =0;
		int tM =0;
		for (int i=0; i < mS.length; i++) {
			tS += mS[i].length;
			for(int k=0; k<mS[i].length;k++) {
				tM += mS[i][k];
			}
		}
		double totlaMathAge = (double)tM /tS;
		System.out.println("전체 학생의 수학 평균 점수: " +totlaMathAge);
		System.out.println();
		
		int [][] eS = new int [2][];
		eS[0] = new int [2];
		eS[1] = new int [3];
		
		for (int i =0; i<eS.length; i ++) {
			for(int k=0; k<eS[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]: "+ eS[i][k]);
			}
		}
		System.out.println();
		
		eS[0][0] = 90;
		eS[0][1] = 91;
		eS[1][0] = 92;
		eS[1][1] = 93;
		eS[1][2] = 94;
		
		tS =0;
		int tE =0;
		
		for(int i=0; i<eS.length; i++) {
			tS += eS[i].length;
			for(int k=0; k<eS[i].length; k++) {
				tE += eS[i][k];
			}
		}
		double EA = (double) tE / tS;
		System.out.println("전체 학생의 영어 평균 점수: "+EA);

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
