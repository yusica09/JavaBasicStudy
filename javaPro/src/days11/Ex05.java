package days11;

/**
 * @author yusica
 * @data 2025. 1. 9. - 오후 2:20:29
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
	      int x = 100;
	      
	      plus(x); // Call By Value

	      System.out.println( x ); // 100
	   } // main

	   private static void plus(int x) {
	       
	      x+=200;
	      
	   }

}//class

