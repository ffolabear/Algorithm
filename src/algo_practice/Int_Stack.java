package algo_practice;

public class Int_Stack {
	
	private int max;			// 스택 용량
	private int ptr;			// 스택 포인터
	private int[] stk;			// 스택 본체
	
	// 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{

		public EmptyIntStackException() {
		}
	}
	
	// 예외 : 스택이 가득 참
	public class OverFlowIntStackException extends RuntimeException{
		
		public OverFlowIntStackException() {
			
		}
		
	}
	
	// 생성자 - 스택이 비어있으면 포인터는 0
	// 넘겨받은 파라미터로 배열의 길이 생성
	// 만약 배열 본체의 생성에실패할 경우 max를 0으로 만들어서 다른 메서드가 존재하지 않는 배열에 접근하는 것을 방지
	public Int_Stack(int capacity) {
		
		ptr = 0;
		max = capacity;
		
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
		
		
	}
	
	// 스택에서 x를 푸쉬
	public int push(int x) throws OverFlowIntStackException{

		if(ptr >= max) {
			throw new OverFlowIntStackException();
		} 
		
		return stk[ptr++] = x;
	}
	
	
	// 스택에서 가장 마지막에 들어온 데이터를 꺼냄
	public int pop() throws EmptyIntStackException{
		
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		
		return stk[--ptr];
		
	}
	
	// 가장 꼭대기에 있는 데이터를 탐색
	public int peek() throws EmptyIntStackException{
		
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		
		return stk[ptr-1];
	}
	
	// 5.x와 같은값이 있나 없나 검색
	public int indexOf(int x) {
		
		for(int i = ptr-1; i >= 0; i--) {
			
			if(stk[i] == x) {
				return i;
			}
		
		}
		return -1;
	}
	
	// 스택을 비움
	public void clear() {
		ptr=0;
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어있나 확인
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼나 확인
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택안의 모든 데이터를 바닥에서 꼭대기 순서로 출력
	public void dump() {
		
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		} else {
			
			for(int i=0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
		
	}
	
	
}






