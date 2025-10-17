package practice7;

class Phone{
	private String maker;
	private int price;
	private String type;
	
	public Phone(String maker, int price, String type) {
		this.maker = maker;
		this.price = price;
		this.type = type;
	}
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
class SmartPhone extends Phone{
	// 멤버 변수
	private String osType;
	private String osVersion;
	private int memory;
	private boolean camera;
	private boolean bluetooth;
	//생성자
	public SmartPhone(String maker, int price, String type, String osType, String osVersion, int memory, boolean camera,
			boolean bluetooth) {
		super(maker, price, type);
		this.osType = osType;
		this.osVersion = osVersion;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}
	//Getter, Setter
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isCamera() {
		return camera;
	}
//	카메라 지원 여부를 글자로 출력하는 메서드
	public String getCamera() {
		return camera ? "지원" : "미지원";
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	public boolean isBluetooth() {
		return bluetooth;
	}
//	블루투스 지원 여부를 글자로 출력하는 메서드
	public String getBluetooth() {
		return bluetooth ? "지원" : "미지원";
	}
	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	// 지원여부 출력 메서드
	public String getBool(boolean bool) {
		return bool ? "지원" : "미지원";
	}
	
	@Override
	public String toString() {
//		제조사 : 삼성
//		가격 : 1000000
//		통신타입 : 2g
//		운영체제 타입 : 안드로이드
//		운영체제 버전 : 3.1.4
//		내부 메모리 : 4gb
//		카메라 장착 여부 : 지원
//		블루투스 지원 여부 : 미지원
		System.out.println("제조사 : " + getMaker());
		System.out.println("가격 : " + getPrice());
		System.out.println("통신타입 : " + getType());
		System.out.println("운영체제 타입 : " + getOsType());
		System.out.println("운영체제 버전 : " + getOsVersion());
		System.out.println("내부 메모리 : "  + getMemory());
		System.out.println("카메라 장착 여부 : " + getCamera());
		System.out.println("블루투스 지원 여부 : "+ getBool(bluetooth));
		return getMaker() + " " + getOsType();
	}
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 일반적인 휴대폰을 나타내는 Phone 클래스를 작성한다. Phone에는 제조사, 가격, 통신타
//		입(2g 또는 3g) 등의 정보가 저장되어 있다. Phone에서 상속받아서 SmartPhone 클래스
//		를 작성하여 보자. SmartPhone 클래스에는 운영체제 타입, 운영체제 버전, 내부 메모리
//		크기, 카메라 장착 여부, 블루투스 지원 여부 등의 필드가 추가된다. 생성자, 접근자, 설
//		정자를 포함하여서 각각의 클래스를 작성한다. 이들 클래스들의 객체를 만들고 각 객체
//		의 모든 정보를 출력하는 테스트 클래스를 작성하라. 
		SmartPhone sp1 = new SmartPhone("삼성",1000000,"2g","안드로이드"
				,"3.1.4",4,true, false);
		sp1.toString();
//		=================출력결과===================
//		제조사 : 삼성 
//		가격 : 1000000
//		통신타입 : 2g
//		운영체제 타입 : 안드로이드
//		운영체제 버전 : 3.1.4
//		내부 메모리 : 4gb
//		카메라 장착 여부 : 지원
//		블루투스 지원 여부 : 미지원
//		==========================================
		
	}

}







