package practice7;

class Person{
	private String name;
	private String address;
	private String tel;
	
	public Person(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	void print() {
		System.out.println("이름:"+getName()+", "
				+ "주소:"+getAddress()+", "
				+ "전화번호:"+getTel());
	}
	
}
class Customer extends Person{
	private int customerNumber;
	private int mileage;
	
	public Customer(String name, String address, String tel, int customerNumber, int mileage) {
		super(name, address, tel);
		this.customerNumber = customerNumber;
		this.mileage = mileage;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	void print() {
		System.out.println("이름:"+getName()+", "
				+ "주소:"+getAddress()+", "
				+ "전화번호:"+getTel()+", "
				+ "고객번호:"+customerNumber+", "
				+ "마일리지:"+mileage);
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Person 클래스를 설계하라. Person 클래스는 이름, 주소, 전화 번호를 필드로 가진다. 
//		하나 이상의 생성자를 정의하고 각 필드에 대하여 접근자와 설정자 메소드를 작성하라. 
//		이어서 Person을 상속받아서 Customer를 작성하여 보자. Customer는 고객 번호와 
//		마일리지를 필드로 가지고 있다. 한 개 이상의 생성자를 작성하고 적절한 접근자 메소드와 
//		설정자 메소드를 작성한다. 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 
//		출력하는 테스트 클래스를 작성하라.
		Person person = new Person("홍길동","부산광역시","010-1234-5678");
		Customer customer = new Customer("이순신","창원시","010-8765-4321",25101601, 1000);
		person.print();
		customer.print();
//		=================출력결과===================
//		이름:홍길동, 주소:부산광역시, 전화번호:010-1234-5678
//		이름:이순신, 주소:창원시, 전화번호:010-8765-4321, 고객번호:25101601, 마일리지:1000
//		==========================================
	}

}






