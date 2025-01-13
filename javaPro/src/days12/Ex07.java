package days12;

public class Ex07 {

	public static void main(String[] args) {
		 new Calc().btnExec.exec_click();
	}

}

class Calc {
	//Button[] btns = null;
	Button btnExec = null;
	//생성자
	public Calc() {
		init();
	}
	
	// 계산기 초기화
	private void init() {
		this.btnExec = new Button("=");
		
	}

	public void exec() {
		System.out.println("연산처리..");
	}
}

class Button{
	
	String text;
	Calc calc;
	
	public Button() {}
	
	public Button(String text) {
		this.text = text;
	}
	
	public Button(String text, Calc calc) {
		this(text);
		this.calc = calc;
	}
	
	public void exec_click() {
		this.calc.exec(); // 
	}

}
