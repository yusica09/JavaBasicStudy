package days11;

public class Student {
	
	// 필드
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	//메서드
	public String getStudentInfo_2() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d", 
				name, kor, eng, mat, tot, avg, rank);
	}
	public String getStudentInfo() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d\t%d", 
				name, kor, eng, mat, tot, avg, rank, wrank);
	}
	@Override
	public String toString() {
		 return String.format("%s\t%d\t%d\t%d\t%d\t%.2f\t\t%d", 
				name, kor, eng, mat, tot, avg, rank);
	}
	

}
