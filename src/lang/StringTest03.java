package lang;

public class StringTest03 {

	public static void main(String[] args) {
		String s = "abcAbcabcABC";
		
		//charAt
		System.out.println( s.charAt( 2 ) );
		
		//indexOf
		System.out.println( s.indexOf( "Abc" ) );
		System.out.println( s.indexOf( "XYZ" ) );
		
		//치환 ( replace )
		System.out.println( s.replace( 'a', 'R' ) );
		System.out.println( s );

		//치환 ( replaceAll )
		System.out.println( s.replace( "bc", "12" )  );
		System.out.println( s.replaceAll( "bc", "12" )  );

		//substring
		System.out.println( s.substring( 3, 7 ) );
		
		//toLowerCase
		System.out.println( s.toLowerCase() );
		
		String str1 = " ab cd";
		String str2 = ",efg ";
		
		//concat
		str1 = str1.concat( str2 );
		System.out.println( str1 );
		
		//trim
		// str1 = " ab cd,efg ";
		System.out.println( "--" + str1 + "--" );
		str1 = str1.trim();
		System.out.println( "--" + str1 + "--" );
		
		//split
		String[] tokens = str1.split( "," );
		for( String str : tokens ){
			System.out.println( str );
		}
		
		//split 예외
		tokens = "abcdefg".split( "," );
		for( String str : tokens ){
			System.out.println( str );
		}
	
		tokens = "".split( "," );
		System.out.println( tokens.length );
		
	}
}
