package days12;

public class Person {
	
	// 필드
	private String name;
	private int age;
	private boolean gender;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age >= 0 && age <= 120) {
			this.age = age;
		}else {
			//강제 오류(예외) 발생
			throw new RuntimeException("0~120 범위 밖");
		}
	}

	
	// boolean 의 경우 getGender가 아니라 isGender가 대중적
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	// 생성자
	public Person() {}
	
	public Person(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 메서드

	
	// getter, setter + 메서드 일종(필드 설정, 필드 얻어가는 역할)
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	

}//class
