package baekjoon_array1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek_2577 {

	public static void main(String[] args) throws Exception, IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int res = Integer.parseInt(bf.readLine()) * Integer.parseInt(bf.readLine()) * Integer.parseInt(bf.readLine());
		
		//Integer.toString(res); 도 가능하지만 valueOf는 어떤값을 넣어도 String으로 변환이 가능하다.
		String str = String.valueOf(res);
		System.out.println(str);
		
		
		for (int i = 0; i < str.length(); i++) {
			
			arr[(str.charAt(i) - 48)]++;
		}
 
		for (int v : arr) {
			System.out.println(v);
		}
 
		
	}

}



