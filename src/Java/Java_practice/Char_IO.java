package Java.Java_practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Char_IO {

	public static void main(String[] args) throws FileNotFoundException {

		// try 부분안에 선언된 부분이 들어가면외부에서 사용할 수 없기때문에 선언과 예외처리를 분리시켜준다.

		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			br = new BufferedReader(new FileReader("읽을 파일경로"));
			pw = new PrintWriter(new FileWriter("저장할 파일이름"));

			String line = null;
			while ((line = br.readLine()) != null) {

				pw.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
