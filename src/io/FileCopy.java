package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream( "./dooly.gif" );
			fos = new FileOutputStream( "./dooly2.gif" );
			
			int data = -1;
			while( (data = fis.read() ) != -1 ) {
				fos.write( data );
			}
			
		} catch (FileNotFoundException e) {
			System.out.println( "파일 없음:" + e );
		} catch ( IOException e ) {
			System.out.println( "I/O 오류:" + e );
		} finally {
			try {
				if( fis != null ) {
					fis.close();
				}
				if( fos != null ) {
					fos.close();
				}
			} catch( IOException e ){
				System.out.println( "I/O 오류:" + e );
			}
		}
	}

}
