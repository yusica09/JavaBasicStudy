package days03;

/**
 * @author yusica
 * @data 2024. 12. 26. - 오후 5:14:55
 * @subject 배열 , 인덱스 응용
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		String [] names = new String[13];
		
		names[0] = "이름1";
		names[1] = "이름2";
		names[2] = "이름3";
		
		//names[12] = names[names.length-1]
		names[names.length-1] = "이름4";
		
		System.out.printf("names[0]=%s\n", names[0]);
		System.out.printf("names[1]=%s\n", names[1]);
		System.out.printf("names[2]=%s\n", names[2]);
		System.out.println(":");
		System.out.printf("names[12]=%s\n", names[12]);

	}

}
