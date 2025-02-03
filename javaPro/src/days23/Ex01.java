package days23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author yusica
 * @data 2025. 1. 31. - 오전 11:03:17
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 1. 직렬화(Serialization)
		 * 		Object(객체)를 입출력하기 위해서 스트림으로 만드는 것
		 * 2. 역직렬화(deSerialization)
		 * 		스트림 -> 객체
		 * 3. 객테를 직렬화 바이트 스트림 제공
		 * 		Object[InputStream]
		 * 		Object[OutputStream]
		 * 
		 * 
		 * 4. UserInfo 클래스
		 * */
		
		UserInfo u1 = new UserInfo("홍길동", "1234", 25);
		UserInfo u2 = new UserInfo("장보고", "4321", 27);
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(u1);
		list.add(u2);
		
		String fileName = ".\\src\\days23\\UserInfo.ser";
		
		//ObjectOutputStream 보조 스트림
		try(
				FileOutputStream out = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(out);
			) {
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush(); //저장
			
			//java.io.NotSerializableException:days23.UserInfo
			// 해당 클래스가 직렬화가 안되어있다는 뜻.
			// 해당 클래스 뒤에 implements Serializable 붙이기
			System.out.println("u1, u2 객체를 직렬화해서 파일로 저장 완료!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
