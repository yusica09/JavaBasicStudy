package days21;

/**
 * @author yusica 
 * @data 2025. 1. 23. - 오후 12:36:41
 * @subject	[ 열거형에 멤버 추가 ]
 * @content
 */
public class Ex04_04 {
	// The constructor Ex04_04.Direction(int, String) is undefined
	enum Direction {
		EAST(100, ">"), SOUTH(200, "V"), WEST(300, "<"), NORTH(400, "^");
		
		// 필드
		private final int value; // 100, 200, 300, 400
		private final String symbol;
		
		// 생성자
		/*
		private Direction(int value){
			this.value = value;
		}
		*/	
		
		private Direction(int value, String symbol){
			this.value = value;
			this.symbol = symbol;
		}	
		
		//getter
		public int getValue() {
			return this.value;
		}
		public String getSymbol() {
			return this.symbol;
		}
		
		// 추상메서드 선언할 수 있다. 
		// abstract int test();

	}
	
	public static void main(String[] args) {
		
		Direction [] dirArr = Direction.values();
		for (Direction d : dirArr) {
			System.out.println( d.name() + "/"+ d.getValue()+"/"+d.getSymbol());
 
		} // for direction
		
	}//main
}

/*
enum Direction { EAST, SOUTH, WEST, NORTH }  열거형(enum) 선언
		↓
	클래스 변환
		↓
class Direction{
	static final Direction EAST = new Direction("EAST");
	static final Direction SOUTH = new Direction("SOUTH");
	static final Direction WEST = new Direction("WEST");
	static final Direction NORTH = new Direction("NORTH");
} 
 */