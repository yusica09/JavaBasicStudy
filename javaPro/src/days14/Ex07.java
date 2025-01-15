package days14;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오후 3:26:58
 * @subject	인터페이스 설명 예제
 * @content
 * 					[인터페이스 사용 장점]
 * 					1. 개발 시간을 단축
 * 						인터페이스
 * 							추메();
 * 							추메();
 * 							추메();
 * 
 * 						class 클래스명 implments 인터페이스{
 * 							추메();
 * 							추메();
 * 							추메();
 * 						}
 * 					2. 표준화 가능
 * 						move(){}
 * 						attack(){}
 * 					3. 서로 관련 없는 클래스들에게 관계를 맺어줄 수도 있다.
 * 
 * 					예)DBMS - Oracle / MS SQL / My SQL 등
 * 						
 * 
 */
public class Ex07 {

	public static void main(String[] args) {
		// [오라클 DBMS 사용해서 DB 처리]
		//IDBConn dbconn = new OracleDBConn();

		// [MS SQL DBMS]
		IDBConn dbconn = new MSSQLDBConn();

		dbconn.open();		
		dbconn.select();

		// JDBC -> JDBC Driver
		//         MS SQL JDBC Driver
		//         Oracle JDBC Driver   ojdbc6.jar

	}

}
