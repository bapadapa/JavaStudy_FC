package abstractEx;

public class DeskTop  extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop 화면");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop 타이핑");
	}
}
