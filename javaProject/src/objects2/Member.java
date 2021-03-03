package objects2;

public class Member {
	private String memberId;
	private String membername;
	private Book[] rentBooks = new Book[5];
	
	public Member() {}
	
	public void rent(Book book) {

		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public Member(String memberId, String membername) {
		super();
		this.memberId = memberId;
		this.membername = membername;
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i]!=null && rentBooks[i].getBookTitle().equals(book.getBookTitle())) {
				
				rentBooks[i] = null;

			}
		}

	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public Book[] getRentBooks() {
		return rentBooks;
	}

	public void setRentBooks(Book[] rentBooks) {
		this.rentBooks = rentBooks;
	}

 	public String getBookInfo() {
 		String result = "";
 		result = membername;
 		for(int i=0; i<rentBooks.length; i++) {
 			if(rentBooks[i] != null) {
 			result = result + "/" + rentBooks[i].getBookTitle();
 		}
 		
 	}   return result;
 }  
}
