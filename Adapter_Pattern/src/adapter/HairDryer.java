package adapter;

public class HairDryer implements Electronic110V {

	@Override
	public void poweron() {
		System.out.println("헤어 드라이기 110V on");
	}

}
