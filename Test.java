class Test{
	public static void main(String[] args){

		System.out.println("this is first test!");
	}
	@Test
	public void testGetBooks(){
		BookService bs=new BookServiceImpl();
		List<Book> books = bs.getBooks();
		Book book1 = bs.getBookById("1");
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println(book1);
	}
}