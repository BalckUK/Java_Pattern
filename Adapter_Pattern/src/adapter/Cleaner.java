package adapter;

public class Cleaner implements Electronic220V {
	@Override
	public void connect() {
		System.out.println("û�ұ� 220V power on");
	}
}
