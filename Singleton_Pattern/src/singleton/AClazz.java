package singleton;

public class AClazz {

	private SocketClient socketclient;

	public AClazz() {
		this.socketclient = SocketClient.getInstance();
	}

	public SocketClient getSoketClient() {
		return this.socketclient;
	}

}
