package facade_false;

public class Writer {

	private String fileName;
	
	public Writer(String fileName) {
		this.fileName = fileName;
	}
	
	public void fileConnect() {
		String msg = String.format("Reader %s �� �����մϴ� ", fileName);
		System.out.println(msg);
	}
	
	public void fileDisconnect() {
		String msg = String.format("Reader %s �� ���� ���� �մϴ� ", fileName);
		System.out.println(msg);
	}
	
	public void write() {
		String msg = String.format("Reader %s �� ���Ͼ��⸦ �մϴ� ", fileName);
		System.out.println(msg);
	}
}
