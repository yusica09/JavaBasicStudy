package days16;

public class Ex04_04 {
	
	public static void main(String[] args) {
		// 업로드					클라이언트		->		서버
		//다운로드									<-
		//A사람 a.txt									[upload 폴더]
		//														a.txt
		//													   a(1).txt
		
		
		
		
		// [문제]
		// path 라는 전체 경로 속에서 Sample.java 순수한 파일명
		// 파일명에서 확장자(.java)만 얻어와서 출력.
		String path = "C:\\temp\\src\\Sample.java";
		String fileName; // Sample.java
		String ext; // .java
		
		fileName = path.substring(path.lastIndexOf("\\")+1);
		System.out.println(fileName);
		
		ext = path.substring(path.lastIndexOf(".")+1);
		System.out.println(ext);
	}
	
	
	
	/*
	public static void main(String[] args) {
		
		//[문제]
		String dir = "C:\\temp\\src";
		String fileName = "Sample.java";
		
		// 열고자하는 전체 경로 = dir + fileName
		
		if(!dir.endsWith("\\"))
				dir += "\\";
		String path = dir + fileName;
		System.out.println(path);
		
		String path2 = String.join("",dir,fileName);
		System.out.println(path2);
	}
	*/

}
