package days23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오전 11:38:10
 * @subject
 * @content
 */
public class Ex02_02 {
	public static void main(String[] args) {
		
		String fileName = ".\\src\\days23\\child.ser";
		
		//ObjectOutputStream 보조 스트림
		try(
				FileInputStream in = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(in);
			) {
			
			Child c = (Child) ois.readObject();
			
			System.out.println(c.name + "/" + c.age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}//main

}
