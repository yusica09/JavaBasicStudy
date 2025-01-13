package days12;

/**
 * @author yusica
 * @data 2025. 1. 10. - 오후 3:24:15
 * @subject	[ static 키워드 ]
 * @content	클래스 앞 X 중첩클래스
 * 					메서드 앞
 * 					필드 앞
 */
public class Ex08 {

	public static void main(String[] args) {
		// 1. 농협은행 - 저축( 이자율 동일 )
		// 2. 저축 관련된 클래스 선언 + 사용 예제 + [ static 키워드 ]
		//    Save
		
		/*[1]
		Save s1 = new Save("가순",10000,0.02);
		Save s2 = new Save("나순",4000,0.02);
		Save s3 = new Save("다순",16000,0.02);
		Save s4 = new Save("라순",34000,0.02);
		Save s5 = new Save("마순",2000,0.02);
		
		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		*/
		
		//[2] 클래스 배열 사용 처리
		/*
		Save [] ss = new Save[5];
		ss[0] = new Save("가순",10000,0.02);
		ss[1] = new Save("나순",4000,0.02); 
		ss[2] = new Save("다순",16000,0.02);
		ss[3] = new Save("라순",34000,0.02);
		ss[4] = new Save("마순",2000,0.02); 
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].printSave();
		}
		*/
		
		// 클래스변수
		// 클래스명.클래스변수명
		// The field Save.rate [is not visible]
		// Save.rate = 0.04;

		
		//[3]	클래스 배열 초기화 사용
		Save [] ss = {
				new Save("가순",10000,0.02),
				new Save("나순",4000,0.02), 
				new Save("다순",16000,0.02),
				new Save("라순",34000,0.02),
				new Save("마순",2000,0.02) 
				};
		
		Save.setRate(0.04);
		ss[3].setRate(0.07); // 전부다 이자율 0.07 된다

		
		for (int i = 0; i < ss.length; i++) {
			ss[i].printSave();
		}
	
	}//main
	
}//class
