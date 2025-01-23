package days20;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		
		// 순서유지O , 중복허용X
		Set<Student> sSet = new LinkedHashSet<Student>();
		
		sSet.add(new Student("2001001", "김이름", 25));
		sSet.add(new Student("2001002", "윤이름", 26));
		sSet.add(new Student("2001003", "이이름", 28));
		
		sSet.add(new Student("2001001", "김이름", 25));
		
		System.out.println(sSet.size());
		// new Student() 객체 요소로 채워넣는중
		// hashCode() 값이 같으면 같은 객체.
		
		//같은 객체임에도 hashCode() 값이 다름
		Student s1 = new Student("2001001", "김이름", 25);
		System.out.println(s1.hashCode());
		Student s2 = new Student("2001001", "김이름", 25);
		System.out.println(s2.hashCode());
		
	}

}

class Student{
	String no; //학번	-> 학생을 구별할 수 있는 고유한 필드
	String name; //학생명(중복있을 수 있다)
	int age; // 나이
	
	public Student() {
		super();
	}

	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() { // Object hashCode 오버라이딩
		//return Integer.parseInt(this.no);
		return this.no.hashCode(); // String hashCode
	}

	@Override
	public boolean equals(Object obj) { // Object equals 오버라이딩
		if(obj instanceof Student && obj != null) {
			Student s = (Student)obj;
			return this.no.equals(s.no); // String equals
		}
		return false;
	}
	
	
	
	
}