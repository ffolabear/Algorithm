package codeup_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1014 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		String[] word = str.split(" ");
		
		System.out.print(word[1] + " " +word[0]);
	}

}