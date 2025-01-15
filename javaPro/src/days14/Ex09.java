package days14;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오후 4:15:37
 * @subject		인터페이스
 * @content			ㄴ 상수, 추상메서드
 * 						***ㄴ jdk1.8	static 메서드 , default 메서드***
 */
public class Ex09 {

	public static void main(String[] args) {
		
		Parseable.test();
		
		// html 문서를 파싱(구문분석)을 해서 내가 원하는 내용 얻어오기..
		// xml 문서를 파싱하여 내가 원하는 내용 얻어오기
		String docType = "xml";
		String fileName = "Sample.xml";
		
		//업캐스팅, 다형성
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(fileName);
		parser.print();
		
		System.out.println("  end  ");
		

	}//main

}//class

interface Parseable{

	// 구문분석하는 추상메서드
	void parse(String fileName);

	default void print() {
		System.out.println("인쇄 기능 구현...");
	}

	static void test() {
		System.out.println("> test()... 구현");
	}


}
//인터페이스 끼리의 상속은 extends 키워드 사용.
interface ParseablePlus extends Parseable{
	// 인쇄하는 추상 메서드 
	void print();
}


//HTML 문서를 파싱하는 클래스(파서)
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("HTML 파일 구문 분석 메서드");
	}
	
}
//XML 문서를 파싱하는 클래스(파서)
class XMLParser implements Parseable{
	
	@Override
	public void parse(String fileName) {
		System.out.println("XML 파일 구문 분석 메서드");
	}
	// 직접 print() 구현
	// 인터페이스 안의 default 메서드는 무시된다. 
	public void print() {
		System.out.println("코딩 직접 구현...");
	}
	
}

class PDFParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("PDF 파일 구문 분석 메서드");
	}

}


//HTMLParser, XMLParser 여러 개의 파서가 존재할 수 있다.
//					ㄴ ???Parser 20개 클래스 선언 (가정)
// 관리하는 관리자(Manage) 클래스
class ParserManager{
	
	public static Parseable getParser(String docType) {
		
		Parseable parser = null;
		
		switch (docType) {
		case "xml":
			parser = new XMLParser();
			break;
		case "html":
			parser = new HTMLParser();
			
		default:
			parser = null;
			break;
		}
		return parser;
	}
	
}
