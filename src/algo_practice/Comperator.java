package algo_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Comperator {

	static class PhyscData {

		private String name;
		private int height;
		private double vision;

		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		@Override
		public String toString() {
			return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}
		
		// 주어진 키를 찾는 부분
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderCompator();

		private static class HeightOrderCompator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
			}

		}
		
		// 주어진 시력을 찾는 부분
		public static final Comparator<PhyscData> SIGHT_ORDER = new SightOrderComparator();
		
		public static class SightOrderComparator implements Comparator<PhyscData>{

			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.vision > o2.vision) ? 1 : (o1.vision < o2.vision) ? -1 : 0;
			}
			
		}
			

	}
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		PhyscData[] x = {					// 키의 오름차순으로 정렬되어 있습니다.
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
			};
		
		
//		System.out.print("몇 cm 인 사람을 찾고 있나요? : ");
//		int height = sc.nextInt();
//		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
		
		
		System.out.print("시력이 몇인 사람을 찾고 있나요? : ");
		Double sight = sc.nextDouble();
		int aws = Arrays.binarySearch(x, new PhyscData("", 0, sight), PhyscData.SIGHT_ORDER);
		
		if(aws < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			
			System.out.println("x[" + aws + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[aws]);
		}
		
		
		
		
		
		
	}
	
	
	
	

}














