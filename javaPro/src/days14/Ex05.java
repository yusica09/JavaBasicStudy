package days14;

/**
 * @author yusica
 * @data 2025. 1. 14. - 오후 2:10:30
 * @subject	클래스를 설계할 때
 * @content	추상화 작업 언제/어떻게 해야하는지 이해..
 */
public class Ex05 {

	public static void main(String[] args) {

	}//main

}//class

/*
// 해병대원
class Marine{
	int x, y; //현재위치
	void move(int x, int y) {}
	void stop() {}
}
//탱크
class Tank{
	int x, y; //현재위치
	void move(int x, int y) {}
	void stop() {}
	// 공격모드 변환하는 메서드
	void changeMode(){}
}

//수송선
class DropShip{
	int x, y;
	void move(int x, int y) {}
	void stop() {}
	
	
	void load(){} // 수송선에 짐을 올리는 작업
	void unload(){}// 				내리는 작업
}

*/

/*
// 추상화 - 공통부분을 따로 빼는 것
// 유닛 - Marine, Tank, DropShip

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
}

class Marine extends Unit{

	void stimPack(){}

	@Override
	void move(int x, int y) { 
	}

	@Override
	void stop() { 
	}


}
//탱크
class Tank extends Unit{

	// 공격 모드 변환하는 메서드 
	void changeMode() {}  

	@Override
	void move(int x, int y) { 
	}

	@Override
	void stop() { 
	}


}
//수송선
class DropShip extends Unit{

	void load() {}  // 수송선에 짐을 올리는 작업
	void unload() {}  //          내리는 작업

	@Override
	void move(int x, int y) { 
	}

	@Override
	void stop() { 
	}

}
*/
