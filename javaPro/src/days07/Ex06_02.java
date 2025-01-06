package days07;

public class Ex06_02 {

	public static void main(String[] args) {
		// [ 문제 1 ]
		String rrn = "830412 - 1700001";
		// 1) 830412 - *******
		// 2) 830412 - 1******
		
		/*
		1-1)
		String [] rrnArr = rrn.split(" - ");
		rrnArr[1] = "*******";
		
		//System.out.printf("%s - %s\n",rrnArr[0],rrnArr[1]);
		
		rrn = String.join(" - ", rrnArr);
		System.out.println(rrn);
		*/
		
		// 1-2)
		/*
		String [] rrnArr = rrn.split(" - ");
		char [] rrnCharArr = rrnArr[1].toCharArray();
		
		for(int i=1;i<rrnCharArr.length;i++) {
			rrnCharArr[i] = '*';
		}
		
		rrnArr[1] = new String(rrnCharArr);
		rrn = String.join(" - ", rrnArr);
		System.out.println(rrn);
		*/
		
		String [] rrnArr = rrn.split(" - ");
		rrnArr[1] = rrnArr[1].substring(0, 1) + "******";
		rrn = String.join(" - ", rrnArr);
		
		System.out.println(rrn);
		
		

	}

}
