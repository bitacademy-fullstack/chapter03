package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffredOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			FileOutputStream fos = new FileOutputStream( "123.txt" );
			bos = new BufferedOutputStream( fos, 5 );
			
			for( int i = '1'; i <= '9'; i++ ) {
				bos.write( i );
				 // 버퍼가 차지 않은 상태에서 플러시를 한다.
				bos.flush();
			}
//			for( int i = 49; i <= 57; i++ ) {
//			}

		} catch (FileNotFoundException e) {
			System.out.println( "파일 없음:" + e );
		} catch ( IOException e ) {
			System.out.println( "io error:" + e );
		} finally {
			try {
				if( bos != null ) {
					bos.close();
				}
			} catch( IOException e ) {
				System.out.println( "io error:" + e );
			}
		}

	}

}
