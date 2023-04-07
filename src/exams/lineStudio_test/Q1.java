package exams.lineStudio_test;

import java.util.ArrayList;
import java.util.Collections;

public class Q1 {

	/*
	 * 다음 조건에 따라 1년 중 k번째로 긴 연속 휴일 기간은 며칠이나 되는지 구하려 합니다.
	 * 
	 * 1월 1일은 금요일이며, 윤년이 아니라고 가정합니다. 토요일, 일요일은 항상 휴일입니다. 공휴일, 휴가 등 한 해 동안의 휴일이 모두 담긴
	 * 목록이 주어집니다. 목록에는 토요일, 일요일도 담겼을 수 있습니다. 공휴일 등의 휴일은 실제 휴일이 아닌 임의의 날짜로 주어집니다. 길이가
	 * 동일한 휴일 기간이 여러 개인 경우에는 한 번만 세면 됩니다. 연속 휴일 기간은 나누어 세지 않습니다. 예를 들어, 3일짜리 휴일을 1일
	 * 휴일과 2일 휴일로 나누어 세지 않습니다. 예를 들어 한 해 동안의 휴일이
	 * ["01/14","01/15","01/18","01/22","01/23","01/29","02/01","02/03","02/07"]이라면
	 * 두 번째로 긴 연속 휴일 기간은 4일(01/29 ~ 02/01)입니다(01/30은 토요일, 1/31은 일요일이기 때문입니다).
	 * 
	 * 한 해 동안의 휴일이 담긴 배열 trueDays, 자연수 k가 매개변수로 주어질 때, k번째로 긴 연속 휴일 기간은 며칠인지 return
	 * 하도록 solution 함수를 완성해주세요.
	 * 
	 * 제한사항 trueDays의 길이는 1 이상 365 이하입니다. trueDays의 각 원소는 XX/YY 형태의 문자열입니다. XX/YY는
	 * XX월 YY일을 나타내며, 01/01에서 12/31까지 입니다. trueDays에 담긴 휴일들은 날짜 순으로 정렬되어 있습니다. 같은
	 * 날짜가 중복해 들어있지 않습니다. 잘못된 날짜가 주어지는 경우는 없습니다. k는 1 이상 20 이하인 자연수입니다. 항상 k번째로 긴 연속
	 * 휴일이 있는 경우만 입력으로 주어집니다. 예를 들어, 365일 모두 휴일인 경우에 k는 항상 1로 주어집니다.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String[] str = {"01/14", "01/15", "01/18", "01/22", "01/23", "01/29", "02/01", "02/03", "02/07"};
		int[] endday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean[] trueDays = new boolean[365];

		for (int i = 0; i < trueDays.length; i++) {
			trueDays[i] = false;

			if (i % 7 == 2 || i % 7 == 3) {
				trueDays[i] = true;
			}

		}

		int[] convert = new int[str.length];

		for (int j = 0; j < str.length; j++) {

			String[] temp = str[j].split("/");

			if (Integer.parseInt(temp[0]) == 1) {
				convert[j] = Integer.parseInt(temp[1]);
			} else {
				convert[j] = Integer.parseInt(temp[0]) * endday[Integer.parseInt(temp[0]) - 1]
						+ Integer.parseInt(temp[1]);
			}

			trueDays[convert[j]] = true;
		}

		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();

		for (int j = 0; j < trueDays.length; j++) {

			if (trueDays[j]) {
				++cnt;

			} else if (!trueDays[j]) {
				if (cnt > 0) {

					if (!list.contains(cnt)) {
						list.add(cnt);
					}

				}
				cnt = 0;
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		
		int kkk = 2;
		int point =0;
		for(int jj : list) {
			point++;
			if(point == kkk) {
				System.out.println(jj);
				
			}
		}
		
		System.out.println("---------------");
		for(int jj : list) {
				System.out.println(jj);
		}
		
		//int m = list.indexOf(point);
		
		
		
		
		
		//System.out.println(m);
	}

}








