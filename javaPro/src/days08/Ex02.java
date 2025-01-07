package days08;

public class Ex02 {

	public static void main(String[] args) {
		String rrn = "830412 - 1700001";
		
		String [] rrnArr = rrn.split("-");
		
		System.out.println(rrnArr[0]);
		System.out.println(rrnArr[1]);
		
		/*
		System.out.println(rrnArr[0] + "-*******");
		
		// String.concat() 메서드는 두 문자열을 연결하는 메서드
		System.out.println(rrnArr[0].concat("-*******"));
		*/
		
		// String rrn = "830412-1******";
		//System.out.println(rrnArr[0]+"-"+rrnArr[1].charAt(0)+"*******");
		System.out.println(String.format("%s-%c*******", rrnArr[0],rrnArr[1].charAt(0)));
		


	}//main

}//class
