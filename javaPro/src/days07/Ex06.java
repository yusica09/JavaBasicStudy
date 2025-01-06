package days07;

import java.util.Random;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오후 5:03:32
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// 결제할때마다 랜덤하게 특정 위치 4자리 숫자가 ****로 출력(표시)
		
		String card ="7655-8988-9234-5677";
		
		Random rnd = new Random();
		int index = rnd.nextInt(4);	// 0 <= int < 4
		
		String [] cardArr = card.split("-");
		
		cardArr[index] = "****";
		for (int i = 0; i < cardArr.length; i++) {
			System.out.printf("cardArr[%d]=%s\n",i, cardArr[i]);
		}
		
		// 원하는 형식의 문자열로 바꿀때 사용 
		//1. String.format()
		
		/*
		card = String.format("%s-%s-%s-%s", 
				cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		*/
		
		//2. String.join()
		card = String.join("-",cardArr);
		
		System.out.println(card);
		
		
		

	}

}
