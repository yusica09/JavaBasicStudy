package days07;

/**
 * @author yusica
 * @data 2025. 1. 3. - 오전 10:35:44
 * @subject	메서드(함수) 와 오버로딩
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		//System.out.println("----------------------"); //50줄
		Sample.drawLine(30);
		System.out.println("   부서명   :   사원명    ");
		//System.out.println("----------------------"); //50줄
		Sample.drawLine("^", 25);
		System.out.println("   영업부   :   김영업    ");
		System.out.println("   총무부   :   이총무    ");
		System.out.println("   생산부   :   최생산    ");
		System.out.println("   기획부   :   박기획    ");
		System.out.println("   기획부   :   한기획    ");
		//System.out.println("----------------------"); //50줄
		Sample.drawLine();

	}//main
	
	

}//class
