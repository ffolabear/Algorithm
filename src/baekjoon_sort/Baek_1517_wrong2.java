package baekjoon_sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1517_wrong2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		String str = bf.readLine();
		
		// 초기 입력 배열
		String[] arr = str.split(" ");
		
		// 입력한 값 형변환한 배열
		int[] arrc = new int[arr.length];
		
		int cnt=0;
		for(int i = 0; i < N; i++) {
			arrc[i] = Integer.parseInt(arr[i]);
			
			for(int j = N -1; j > i ; j--) {
				
				if(arrc[j-1] > arrc[j]) {
					cnt++;
					
					int ptr = arrc[j-1];
					arrc[j-1] = arrc[j];
					arrc[j] = ptr;
				}
				
			}
			
		}
		
		System.out.println(cnt);
		
	}

}

