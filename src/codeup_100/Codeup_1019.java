package codeup_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup_1019 {
	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String[] arr = str.split("\\."); 
		
			
		System.out.printf("%04d" + ".",Integer.parseInt(arr[0]));
		System.out.printf("%02d" + ".",Integer.parseInt(arr[1]));
		System.out.printf("%02d",Integer.parseInt(arr[2]));
		
	}

}
