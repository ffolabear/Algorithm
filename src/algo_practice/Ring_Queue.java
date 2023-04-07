package algo_practice;

public class Ring_Queue {

	private int max; // 큐의 용량
	private int front; // 첫번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	public class EmptyRingQueueException extends RuntimeException {
		public EmptyRingQueueException() {

		}
	}

	public class OverflowRingQueueException extends RuntimeException {
		public OverflowRingQueueException() {

		}
	}

	public Ring_Queue(int capacity) {

		num = front = rear = 0;
		max = capacity;

		try {
			// 큐 본체용 배열 생성
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	// 가장 뒤에 데이터를 추가한다.
	public int enque(int x) throws OverflowRingQueueException {

		if (num >= max) {
			throw new OverflowRingQueueException();
		}

		que[rear++] = x;
		num++;

		if (rear == max) {
			rear = 0;
		}

		return x;
	}

	// 가장 앞의 데이터를 출력한다.
	public int deque() throws EmptyRingQueueException {

		if (num <= 0) {
			throw new EmptyRingQueueException();
		}

		int x = que[front++];
		num--;

		if (front == max) {
			front = 0;
		}

		return x;

	}

	// 꼭대기 값을 반환 - 프런트
	public int peek() throws EmptyRingQueueException {

		if (num <= 0) {
			throw new EmptyRingQueueException();
		}

		return que[front];

	}

	// 큐에서 x의 값을 검색
	public int indexOf(int x) {

		for (int i = 0; i < num; i++) {

			int idx = (i + front) % max;
			if (que[idx] == x) {
				return idx;
			}
		}

		return -1;

	}

	public void clear() {
		num = front = rear = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {

		if (num <= 0) {
			System.out.println("큐가 비어있습니다.");
		}
		for (int i = 0; i < num; i++) {
			System.out.print(que[(i + front) % max] + " ");
		}
		System.out.println();

	}

}
