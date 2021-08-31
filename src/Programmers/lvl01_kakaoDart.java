package Programmers;

/*
   2017 카카오 신입 공채 1차 코딩 테스트 
   https://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
  
  카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 
  모두가 간단히 즐길 수 있다.
   갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다. 다트 게임의 점수 계산 로직은 아래와 같다.


	1. 다트 게임은 총 3번의 기회로 구성된다.
	2. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
	3. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수^1 , 점수^2 , 점수^3 )으로 계산된다.
	4. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
	5. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
	6. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
	7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
	8. Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
	9. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
	
	
	0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.

 */

public class lvl01_kakaoDart {

	public static void main(String[] args) {
		
//		System.out.println(getPoint("1S2D*3T")); // 37
//        System.out.println(getPoint("1D2S#10S")); // 9
//        System.out.println(getPoint("1D2S0T")); // 3
//        System.out.println(getPoint("1S*2T*3S")); // 23
//        System.out.println(getPoint("1D#2S*3S")); // 5
//        System.out.println(getPoint("1T2D3D#")); // -4
//        System.out.println(getPoint("1D2S3T*")); // 59

        getPoint("1S2D*3T");

	}

	public static int getPoint(String pointStr) {

		// 각 기회때 얻은 점수를 저장할 배열
		int[] arr = new int[3];
		int currentIdx = 0;

		// 숫자를 판별
		String tempNum = "";

		// 받은 문자를 char 배열에 넣어줌
		for (char c : pointStr.toCharArray()) {

			// 만약 char 배열의 c중 숫자만 골라서 tempNum에 저장
			if (Character.isDigit(c)) {
				tempNum = tempNum + c;
				
			}
			
			else {
				
				// tempNum값이 있다면 -> 
				if(!"".equals(tempNum)) {
					//arr 에 숫자를 넣어준다
					arr[currentIdx++] = Integer.parseInt(tempNum);
					tempNum = "";
				}
				
				//알파벳을 만났을때 알파벳의 바로전 
				switch (c) {
					
					case 'S' :
						arr[currentIdx-1] = (int) Math.pow(arr[currentIdx-1],1);
						break;
						
					case 'D' :
						arr[currentIdx-1] = (int) Math.pow(arr[currentIdx-1],2);
						break;
						
					case 'T' :
						arr[currentIdx-1] = (int) Math.pow(arr[currentIdx-1],3);
						break;
					case '*':
						arr[currentIdx-1] = arr[currentIdx-1] * 2;
						if(currentIdx-2 >= 0) {
							arr[currentIdx-2] = arr[currentIdx-2] * 2;
						}
						break;
						
					case '#' :
						arr[currentIdx-1] = arr[currentIdx-1] * -1;
						break;
				}
			}
		}
		System.out.println(arr[0] + arr[1] + arr[2]);
		return arr[0] + arr[1] + arr[2];
		
	}

}
