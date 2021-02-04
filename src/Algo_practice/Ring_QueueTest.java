package Algo_practice;

import java.util.Scanner;

public class Ring_QueueTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ring_Queue s = new Ring_Queue(64);

		while (true) {

			System.out.println("현재 데이터 수：" + s.size() + " / " + s.capacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　" + 
							 "(4)덤프　(0)종료：");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			
			int x;
			switch(menu) {
			
			case 1: // 인큐
				System.out.println("데이터 : ");
				x = sc.nextInt();
				
				try {
					s.enque(x);
				} catch (Ring_Queue.OverflowRingQueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;
				
			case 2: // 디큐 	
				
				try {
					x = s.deque();
					System.out.println("디큐한 데이터는 " + x + " 입니다. ");
				} catch (Ring_Queue.EmptyRingQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
				
			case 3: //피크 
				
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (Ring_Queue.EmptyRingQueueException e) {
					System.out.println("큐가 비어있습니다.");
				}
				break;
			
			case 4: //덤프
				s.dump();
				break;
			}
			
				

		}

	}

}
