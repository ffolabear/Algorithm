package Java.Java_practice;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		System.arraycopy(library, 0, copyLibrary, 0, 5);
		// 4번

		for (Book book : library) {
			book.info();
		}
		System.out.println("=============");
		for (Book book : copyLibrary) {
			book.info();
		}

		System.out.println("--------------------- Shallow Copy -------------------------");
		//주소값만을 복사하기 때문에 원본 내용이 바뀌면 주소값을 복사한 카피본의 내용도 바뀌는 것
		
		
		// 1번
		library[0].setBook("나목");
		library[1].setBook("박완서");
		// 2번
		for (Book book : library) {
			book.info();
		}
		System.out.println("=============");
		for (Book book : copyLibrary) {
			book.info();
		}
		
		System.out.println("------------------------ Deep Copy  --------------------");
		//원본값을 카피본에 직접대입하는 복사를 깊은복사
		
		//1번
				copyLibrary[0] = new Book();
				copyLibrary[1] = new Book();
				copyLibrary[2] = new Book();
				copyLibrary[3] = new Book();
				copyLibrary[4] = new Book();
				//2번
				for ( int i= 0; i<library.length; i++) {
					copyLibrary[i].setAuthor(library[i].getAuthor());
					copyLibrary[i].setBook(library[i].getBook());
				}
				//3번		
				library[0].setBook("나목");
				library[0].setBook("박완서");
						
				for(Book book : library) {
					book.info();		}
				System.out.println("=============");
				for(Book book : copyLibrary) {
					book.info();		}
		
		
		
		
		
		

	}

}






