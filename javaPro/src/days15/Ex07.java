package days15;

import java.io.FileReader;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {

		method1();

	} // main

	private static void method1() { // throws IOException

		try {
			method2();
		} catch (IOException e) { 
			e.printStackTrace();
		}

	}

	// 메서드 선언
	private static void method2() throws IOException {


		throw new IOException("메서드2에서 예외 발생");

	}

} // class

