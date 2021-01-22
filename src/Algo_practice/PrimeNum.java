package Algo_practice;

public class PrimeNum {
	
	public static void main(String[] args) {

		// 연산횟수
		int counter = 0;

		// 찾은 소수의 갯수
		int ptr = 0;

		// 소수를 저장하는 배열
		int[] prime = new int[500];

		// 최초로 등록하는 소수
		prime[ptr++] = 2;
		prime[ptr++] = 3;

		// 홀수만 대상으로 해서 찾는다.
		for (int n = 5; n <= 1000; n += 2) {

			boolean flag = false;

			// 어떤수의 제곱근보다 작은 소수로만 나눠보면 된다.
			// 여기서는 제곱근이 아니라 두 소수를 곱한 값이 비교대상보다 작을때까지.
			for (int i = 1; prime[i] * prime[i] <= n; i++) {

				// 소수끼리 곱해줬기 때문에 한번, 그리고 나머지를 구하는 연산까지 총 2번이므로 2를 더해준다.
				counter += 2;

				// 판별하는 숫자를 소수로 나눴을때 나누어 떨어지면 소수가 아니므로 반복문을 중단시킨다.
				if (n % prime[i] == 0) {

					flag = true;
					break;

				}
			}

			// 만약 나누어 떨어지지 않는다면 소수이므로 소수배열에 넣어준다.
			// 처음에 설정해준 flag값이 바뀌지 않고 그대로 false라면
			if (!flag) {
				prime[ptr++] = n;
				counter++;
			}

		}

		for (int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("곱셈과 나눗셈을 한 총 연산의 수 :" + counter);

	}


}
