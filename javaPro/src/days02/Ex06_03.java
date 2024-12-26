package days02;

/**
 * @author yusica
 * @data 2024. 12. 24. - 오후 2:02:18
 * @subject flags들 (printf 응용) + 진수들
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		String name = "yusica";
		int age = 20;
		
		
		//%[argument_index$][flags][width][.precision]conversion
		// conversion
		//      c
		System.out.printf("[%s]\n", name); //[yusica]
		System.out.printf("[%10s]\n", name); //[    yusica]
		System.out.printf("[%-10s]\n", name); //[yusica    ]
		System.out.println(); // 개행
		System.out.printf("[%d]\n", age); //[20]
		System.out.printf("[%10d]\n", age); //[        20]
		System.out.printf("[%-10d]\n", age); //[20        ]
		System.out.println();
		System.out.printf("[%010d]\n", age); //[0000000020]
		System.out.println();
		System.out.printf("[%04d]\n", age); //[0020]
		System.out.println();
		
		// 0001
		// 0002
		// 0003
		
		// 진법변환
		// 16진법 : 0 1 2 3 4 5 6 7 8 9 a b c d e f(15)
		// 8진법 : 0 1 2 3 4 5 6 7
		// 2진법 : 0 1
		age = 10;
		System.out.printf("[%d]\n", age);//10
		System.out.printf("[%o]\n", age); // 8진수 -> 12
		System.out.printf("[%x]\n", age); // 16진수 -> a
		System.out.println();
		
		System.out.printf("[%#o]\n", age); // 8진수값과 8진수라는 표기까지 -> [012]
		System.out.printf("[%#x]\n", age); // 16진수값과 16진수라는 표기까지 -> [0xa]
		System.out.println();
		
		// 잘 안쓰이는 경우지만 알아보기
		System.out.printf("[%(d]\n", 100); // [100]
		System.out.printf("[%(d]\n", -100);// [(100)]
		System.out.println();
		
		// 문자열.repeat(횟수)
		System.out.println("-".repeat(20));// --------------------
		
		// 금액을 3자리마다 콤마 찍어서 출력.
		int money = 7635200;
		System.out.printf("%,d\n", money);//7,635,200
		
		//syso
		//sysr -> 임의 등록?
		System.out.println("-".repeat(20));
		
		// 평균출력 - 소수점 2자리까지 출력
		double avg = 78.99845;
		System.out.printf("avg = %e\n", avg); // avg = 7.899845e+01
		System.out.printf("avg = %f\n", avg); // avg = 78.998450
		System.out.printf("avg = [%.2f]\n", avg); // avg = [79.00] -> 반올림 되는 것에 주의
		// 10.2f가 아니라 2.2f 마냥 더 작은 값을 줄 경우 오류는 안나면서 그냥 무시된다.
		System.out.printf("avg = [%10.2f]\n", avg); // avg = [     79.00]
		System.out.printf("avg = [%010.2f]\n", avg); // avg = [0000079.00]
		System.out.printf("avg = [%+010.2f]\n", avg); // avg = [+0000079.00]

	}

}
