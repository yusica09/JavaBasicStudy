package days06;

import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 2. - 오후 5:25:56
 * @subject	유효성 검사, String.matches -> boolean형, regex(정규표현식) 
 * @content
 */
public class Ex08_03 {

	public static void main(String[] args) {
		
		  // 정규 표현식( [reg]ular [exp]ression )
	      //                  regex
	      
	      // 입력값에 대한 유효성 검사... ( 암기 )
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 주민등록번호 입력(ex)000000-0000000) ? ");      
	      // boolean String.matches(String regex)  일치하니?
	      // String regex = "[0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";      
	      // String regex = "[0-9]{6}-[0-9]{7}";
	      String regex = "\\d{6}-\\d{7}";
	      //             \\D
	      // X? 0 1
	      // X+ 1 여러번
	      // X* 0 여러번
	      // X{n} n번
	      // X{n,m} n~m qjs
	      // X{n,}  n~ 이상
	      String rrn = scanner.next();      
	       
	      if( rrn.matches(regex) ) {
	         System.out.println("OK");
	      }else{
	         System.out.println("입력 잘못!!!");
	      }
	      
	      // [문제] 우편번호 000-000		00000	(검색)
	      
	      // String regex = ^\d{3}-\d{3}$|^\d{5}$
	      //				   시작  정확히 3자리 - 정확히 3자리 끝 또는 시작 정확히 5자리 끝
	      
	      // [문제] 비밀번호 8~15 특수문자 1개, 숫자 1게, 대,소 1개  (검색)
	      
	     // String regex = ^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,15}$
	      //					시작	대문자 1개이상, 소문자 1개이상, 숫자 1개이상, 특수문자1개이상   		길이가 8~15   끝
		
	}//main

}//class
