package days15;

/**
 * @author yusica
 * @data 2025. 1. 15. - 오전 10:17:14
 * @subject   익명클래스( anoymous class ) == 무명 클래스 == 클래스의 이름이 없다.
 * @content
 * 
 *           1) 클래스의 선언과 동시에 객체를 생성하는 이름없는 클래스  
 *           2) 일회용( 오직 1개 객체 생성 )
 *           3) 주로 GUI 어플리케이션의 이벤트 처리 사용.
 *              ( AWT, Swing )
 *           4) 익명 클래스의 선언 형식
 *              (1) 형식
 *              // new Person()
 *              new 부모클래스명(){
 *                  // 멤버 -  선언할수 없다.
 *                  부모클래스의 메서드만을 오버라이딩해서 사용할 수 밖에 없다.
 *              };
 *              (2) 형식 
 *              new 구현할인터페이스명(){ 
 *                  인터페이스의 추상메서드만을 오버라이딩해서 사용할 수 밖에 없다.
 *              };   
 * 
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 2.  객체 생성 부분
		Person p1 = new Person();
		p1.toString();


	}

}//class

// 클래스 선언 부분
class Person{
	
}
