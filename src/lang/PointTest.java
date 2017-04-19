package lang;

public class PointTest {

	public static void main(String[] args) {
		Point pt = new Point();
		
		System.out.println( pt.getClass().getName() );
		System.out.println( pt.hashCode() );   //객체ID, 객체 레퍼런스 값
		// getClass().getName() + "@" + hashCode()
		System.out.println( pt.toString() );
		System.out.println( pt );
		
		/* String 객체와 비교 */
		String s = new String( "hello" );
		System.out.println( s.getClass().getName() );
		System.out.println( s.hashCode() );
		System.out.println( s.toString() );
		System.out.println( s );
	}

}
