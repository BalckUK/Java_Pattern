package singleton;

public class Main {
	public static void main(String[] args) {
		AClazz aClazz = new AClazz();
		BClazz bClazz = new BClazz();

		SocketClient aClient = aClazz.getSoketClient();
		SocketClient bClient = bClazz.getSoketClient();

		System.out.println("객체는 동일한가 ? : "+aClient.equals(bClient));
	}
}
