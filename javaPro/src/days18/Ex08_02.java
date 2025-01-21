package days18;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex08_02 {

	public static void main(String[] args) {
		
		
		String source = "이름:홍길동, 나이:20살, 성별:여자";
		String name ="";
		int age=0;
		boolean gender = true;
		
		/*
		String [] infoArr = source.split(", ");
		for (int i = 0; i < infoArr.length; i++) {
			name = infoArr[0].split(":")[1];
			age = Integer.parseInt(infoArr[1].split(":")[1].replaceAll("살", ""));
			gender = infoArr[3].split(":")[1].equals("여자")? false:true;
		}
		 */
		
		
		/*
		Object [] obj = {name, age, gender};
		
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		try {
			obj = mf.parse(source);
			name = (String) obj[0];
			age = Integer.parseInt((String)obj[1]);
			gender = (boolean)obj[2].equals("남자")? true:false;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.printf("이름:%s, 나이:%d살, 성별:%s\n",name, age,
				gender?"남자":"여자");
		*/
		
		String pattern ="이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		try {
			Object [] objArr = mf.parse(source);
			/*
			for(Object v : objArr) {
				System.out.println(v);
			}
			*/
			name = (String)objArr[0];
			age = Integer.parseInt((String)objArr[1]);
			gender = (boolean)objArr[2].equals("남자")? true:false;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		
		
		System.out.println("  end  ");
		
	}

}
