package days08;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		// (시험)
		// 10진수 정수를 입력받아서
		// 2바이트 2진수 형태로 출력
		
		int [] bArr = new int[16];
		
		int n = 10;
		int 몫, 나머지;
		int index = bArr.length-1;
		while(n!=0) {
			몫 =  n/2;
			나머지 = n%2;
			bArr[index--] = 나머지;
			n = 몫;
		}
		System.out.println( Arrays.toString(bArr ));
		
		/*
		int [] byteArr = new int[16];
		String byteStr = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수 입력 : ");
		int num = scanner.nextInt();
		// 입력받은 수 2로 계속 나누기, 나머지 나오는 그대로 저장
		while(num!=0 && num!=1) {
			byteStr += String.valueOf(num % 2);
			num /= 2;
		}
		byteStr += String.valueOf(num);
		// 배열에 거꾸로 입력하고 남은 자리 0
		for(int i = byteStr.length()-1; i >=0; i--) {
			byteArr[15-i] = byteStr.charAt(i) - '0';
		}
		// 배열 출력
		for (int arr : byteArr) {
            System.out.print(arr + " ");
        }
        */
	}//main

}//class
