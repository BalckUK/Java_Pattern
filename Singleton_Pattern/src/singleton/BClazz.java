package singleton;

public class BClazz {

	private SocketClient socketclient;

	public BClazz() {
		this.socketclient = SocketClient.getInstance();
	}

	public SocketClient getSoketClient() {
		return this.socketclient;
	}

	
}
