class Test{
	public static void main(String[] args){

		System.out.println("this is first test!");
	}
	@Test
	public void testGetBookById(){
		BookService bs=new BookServiceImpl();
		Book book = bs.getBookById("1");
		System.out.println(book);
	}
}
