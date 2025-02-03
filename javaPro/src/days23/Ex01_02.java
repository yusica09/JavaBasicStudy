package days23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오전 11:03:17
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		
		// 역직렬화
		//		스트림 -> 객체
		
		String fileName = ".\\src\\days23\\UserInfo.ser";
		
		//ObjectOutputStream 보조 스트림
		try(
				FileInputStream in = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(in);
			) {
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
