
public class Books implements Classification{
	private int bookSize;
	private String bookCategory;
	
	//to set initial values of books
	public Books(){
		bookSize=0;
		bookCategory="Not Defined";
	}
	
	/*
	//overloading example
	public Books(int x, String category){
		setBookSize(x);
		setBookCategory(category);
	}
	*/
	
	//setting book's size
	public void setBookSize(int size){
		this.bookSize = size;
	}
	
	//getting book's size
	public int getBookSize(){
		return this.bookSize;
	}
	
	//setting the book's category
	public void setBookCategory(String category){
		this.bookCategory = category;
	}
	
	//getting the book's category
	public String getBookCategory(){
		return this.bookCategory;
	}
	
	//overriding methods that came from Classification interface 
	@Override
	public int asConsumming( ) {
		// TODO Auto-generated method stub
		int size = this.getBookSize();
		int conusumingTime = (int) size/(150*60);
		return conusumingTime;
	}
	@Override
	public String asType() {
		// TODO Auto-generated method stub
		return this.getBookCategory();
	}
}
