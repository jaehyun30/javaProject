package objects2;

import java.util.Scanner;

public class LibrarayApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1)도서정보등록 2)회원정보등록 3)도서대여 4)도서반납 5)도서목록 9)종료 ");
			System.out.println("----------------------------------------------------");
			System.out.println(" 선택 >> ");
			
			int select = 0;
			select = sc.nextInt();
			
			if (select == 1) {
				System.out.println("도서제목을 입력하세요");
			    booktile = sc.nextLine();
			    System.out.println("저자를 입력하세요");
			    bookwriter = sc.nextLine();
			}
			
		} else if (select == 2) {
			String name = sc.nextLine();
			user[Member.userindex].setName(name);
			String Id = sc.nextLine();
			user[Member.userindex].setId(Id);
			Member.userindex++;
			
		} else if (select == 3) {
			Book
			
			
		}

	}

}
