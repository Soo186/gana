package object_class;
//은행 계좌 클래스(신한은행)

public class Account {
	//멤버 변수 (필드)
	static final String BANKNAME = "신한은행";  //미리 생성되있는 값이니 바로 초기화  //정적 멤버 변수
	String accountNo; // 계좌번호 //-인스턴스 멤버 변수
	String ownerName;// 예금주 이름 //-인스턴스 멤버 변수
	int balance; //잔액 //-인스턴스 멤버 변수

	//생성자 (Ex02) 3개 설정   멤버 변수에 값 대입까지 초기화 담당 !
	public Account(String accountNo, String ownerName, int balance){   // 매개변수
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;    //필드에 this를 붙혀 구분.
	}
	// 빈 생성자 (Ex01)
	public  Account(){

	}


	//예금한다 메서드
	void deposit(int amount){//void (리턴값 x) , deposit(메소드 정의) , amount(매개 변수=외부로부터 값을 받음)
		balance +=amount;
	}

	//인출한다 메서드
	int withdraw(int amount) throws Exception{   //타입명을 적는 이유는 리턴값 때문에, //예외상황
		if (balance < amount){
			throw new Exception("잔액이 부족합니다");

		}
		balance -= amount;
		return amount;

	}
}
