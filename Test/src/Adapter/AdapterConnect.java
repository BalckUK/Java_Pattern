package Adapter;

public class AdapterConnect implements Electronic220V {

	private Electronic110V electronic110;

	public AdapterConnect(Electronic110V electronic110) {
		this.electronic110 = electronic110;
	}

	@Override
	public void connect() {
		electronic110.poweron();
	}
}
