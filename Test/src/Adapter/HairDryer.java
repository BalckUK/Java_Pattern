package Adapter;

public class HairDryer implements Electronic110V{
	@Override
	public void poweron() {
		System.out.println("������̱� 110V power on");
	}
}
