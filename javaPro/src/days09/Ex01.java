package days09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yusica
 * @data 2025. 1. 7. - 오전 9:02:58
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 16진법 : 0 1 2 3 4 5 6 7 8 9 10(a) ~ 15(f)
		
		int n = 123; //7B
		int 몫, 나머지; // share, rest
		
		char [] hex = new char[4];
		Arrays.fill(hex, '0');
		
		int index = hex.length-1;
		
		while(n != 0) {
			몫 = n/16;
			나머지 = n%16;
			char value = (char)(나머지 += 나머지 >= 10? 55 : 48);
			hex[index--] = value;
			/*
			if(나머지 >= 10) {
				switch (나머지) {
				case 10:
					hex[index--] = 'A';
					break;
				case 11:
					hex[index--] = 'B';
					break;
				case 12:
					hex[index--] = 'C';
					break;
				case 13:
					hex[index--] = 'D';
					break;
				case 14:
					hex[index--] = 'E';
					break;
				case 15:
					hex[index--] = 'F';
					break;
				}
			}else {
				hex[index--] = (char) (나머지 +'0');
			}
			*/
		}
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수 입력 : ");
		int num = scanner.nextInt();
		
		String res = "";
		while(num != 0) {
			res = num%2 + res;
			num /= 2;
		}
		
		res = "0".repeat(16-res.length()) + res;
		
		String hex = "";
		for (int i = 0; i < res.length(); i+= 4) {
			int sup = 8; int sum = 0;
			for (int j = i; j < i+4; j++) {
				sum += Integer.parseInt(res.substring(j,j+1)) * sup;
				sup /= 2;
			}
			if(sum >= 10) {
				sum += 55;
				hex += String.valueOf((char)sum);
			}else if(sum != 0) {
				hex += sum;
			} 
			
		}
		System.out.println(hex);
		*/
			
		
		/*
		int [] m = {1,2,3};
		int [] n = Arrays.copyOf(m, m.length+3);
		System.out.println(Arrays.toString(n));
		*/
		

	}//main
	
	

}//class
