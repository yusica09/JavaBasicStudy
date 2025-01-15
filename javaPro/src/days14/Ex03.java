package days14;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오전 11:47:22
 * @subject	싱글톤( Singleton ) : 특정 클래스의 인스턴스(객체)를 하나만 생성하고, 
 * 										그 인스턴스를 전역적으로 접근할 수 있도록 하는 디자인 패턴
 * @content		ㄴ 일반적으로 싱글톤패턴은 자원관리(DB 처리 객체), 
 * 							설정 정보관리, 로깅 등을 위한 클래스에서 자주 사용
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		BoardDAO dao1 = new BoardDAO();
		System.out.println(dao1.hashCode());
		BoardDAO dao2 = new BoardDAO();
		System.out.println(dao2.hashCode());
		BoardDAO dao3 = new BoardDAO();
		System.out.println(dao3.hashCode());
		*/
		
		// BoardDAO.dao  X  getter/setter
		
		BoardDAO dao = BoardDAO.getInstance();
		System.out.println(dao);
		
		dao = BoardDAO.getInstance();
		System.out.println(dao);
		
	}//main

}//class


// 싱글톤 패턴						
//Lazy Initialization 방식
//Thread-Safe 방식				CRUD
class BoardDAO{	// Data Access Object
	
	private static BoardDAO dao;
	
	private BoardDAO() {}
	
	// 클래스 메서드
	/*
	public static synchronized BoardDAO getInstance() {
		// Cannot use this in a static context(문맥, 배경, 환경)
		//return this.dao;
		if( dao == null ) {
			dao = new BoardDAO();
		}
		return dao;
	}
	*/
	
	// Double-Checked Locking (이중 확인 잠금) 방식
	public static BoardDAO getInstance() {
		if( dao == null ) {
			synchronized (BoardDAO.class) {
				if( dao == null)
						dao = new BoardDAO();	
			}
		}
		return dao;
	}
	
}