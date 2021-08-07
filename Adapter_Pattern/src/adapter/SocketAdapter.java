package adapter;

public class SocketAdapter implements Electronic110V {

	private Electronic220V electronic220v;

	public SocketAdapter(Electronic220V electronic220V) {
		this.electronic220v = electronic220V;
	}

	@Override
	public void poweron() {
		electronic220v.connect();
	}
}
