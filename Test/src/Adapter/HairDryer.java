package Adapter;

public class HairDryer implements Electronic110V{
	@Override
	public void poweron() {
		System.out.println("헤어드라이기 110V power on");
	}
}
