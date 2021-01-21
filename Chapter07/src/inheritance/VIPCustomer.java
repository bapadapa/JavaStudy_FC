package inheritance;

public class VIPCustomer extends customer{

	double salesRatio;
	private int agnetID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		/* System.out.println("VIP() 생성자 호출"); */
	}
	
	//어노테이션 (Anotation)
	@Override
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price * salesRatio);
	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		/* System.out.println("VIP(int , String) 생성자 호출"); */
	}
}