package facade_true;

public class Ftp {

	private String host;
	private int port;
	private String path;

	public Ftp(String host, int port, String path) {
		this.host = host;
		this.port = port;
		this.path = path;
	}

	public void connect() {
		System.out.println("FTP host : "+ host+"Port : "+ port + "�� �����մϴ�");
	}

	public void moveDictory() {
		System.out.println("path : "+ path + "�� �̵� �մϴ�");
	}

	public void disConnect() {
		System.out.println("FTP ������ ���� �մϴ�");
	}	
}
