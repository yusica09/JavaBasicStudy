package days13;

/**
 * @author yusica
 * @data 2025. 1. 13. - 오전 10:40:26
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();

	}//main

}//class

class Document{
	
	String fileName;
	static int count = 1;
	
	//인스턴스 초기화 블럭
	{
		count++;
	}
	
	public Document() {
		// this의 두번째 용도
		this(String.format("Noname%d.txt",count));
	}
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n",this.fileName);
	}
	
}