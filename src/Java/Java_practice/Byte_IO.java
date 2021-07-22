package Java.Java_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_IO {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("읽을 파일경로");
			fos = new FileOutputStream("저장할 파일경로");
			
			//FileInputStream의 read메서드는 한바이트씩 읽고 정수를 리턴하고 4바이트중에서 마지막 바이트에 읽을 바이트를 저장
			//바이트를 리턴하면 끝의 값을 알 수 없기 떄문에 int를 리턴한다.
			//음수일경우 맨 죄측 바이트가 1이되고 읽을것이 있다면 항상 양수를 리턴
			int readData = -1;
			
				while((readData = fis.read()) != -1) {
					
					fos.write(readData);
					
				}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
