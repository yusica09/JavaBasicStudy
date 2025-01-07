package days08;

/**
 * @author yusica
 * @data 2025. 1. 6. - 오후 2:28:00
 * @subject
 * @content
 */
public class Ex03_06 {

	public static void main(String[] args) {
		String rrn = "830412-1700001";
		System.out.println(rrn); 
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int tot = 0;
		for (int i = 0; i <= 12; i++) {
			if( i == 6) continue; 
			tot += Integer.parseInt( rrn.substring(i, i+1) ) * m[i];
		} // for i
		int checksum  = ( 11-(tot)%11 ) % 10;
		int ㅍ =	Integer.parseInt(  rrn.substring(13,14) );
		if(ㅍ == checksum) {
			System.out.println("올바른 주민등록번호.");
		} else {
			System.out.println("잘못된 주민등록번호.");
		}


	}// main

}// class
