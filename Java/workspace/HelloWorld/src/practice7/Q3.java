package practice7;

class Book{
	private String title;
	private int pages;
	private String writer;
	
	public Book(String title, int pages, String writer) {
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
//		책 이름 : 잡지A
//		페이지 수 : 10
//		저자 : 기자A
		System.out.println("책 이름 : " + title);
		System.out.println("페이지 수 : " + pages);
		System.out.println("저자 : " + writer);
		return title;
	}
	
}
class Magazine extends Book{
	private String date;

	public Magazine(String title, int pages, String writer, String date) {
		super(title, pages, writer);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		super.toString();
		System.out.println("발매일 : " + date);
		return getTitle();
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 일반적인 책을 나타내는 Book 클래스를 상속받아서 잡지를 나타내는 Magazine 클래스
//		를 작성하여 보자. Book 클래스는 제목, 페이지수, 저자 등의 정보를 가진다. Magazine
//		클래스는 추가로 발매일 정보를 가진다. 생성자, 접근자, 설정자를 포함하여서 각각의 클
//		래스를 작성한다. 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스
//		트 클래스를 작성하라. 
		Magazine magazineA = new Magazine("잡지A",10,"기자A","2010년 2월 25일");
		Magazine magazineB = new Magazine("잡지B",20,"기자B","2010년 3월 8일");
		magazineA.toString();
		magazineB.toString();
//		=================출력결과===================
//		책 이름 : 잡지A
//		페이지 수 : 10
//		저자 : 기자A
//		발매일 : 2010년 2월 25일
//		책 이름 : 잡지B
//		페이지 수 : 20
//		저자 : 기자B
//		발매일 : 2010년 3월 8일
//		==========================================
	}

}
