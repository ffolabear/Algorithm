
public class test {
	
	public static void main(String[] args) {
		
		
		String str = "OXOOXOOOXOOOOOXOOOOOOXOOOOOOOXXOOOOX";
		String[] arr = str.split("X");
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
