package facade_false;

public class Main {
	public static void main(String[] args) {
		Ftp ftpClient = new Ftp("www.naver.co.kr", 22, "/home/etc");
		ftpClient.connect();
		ftpClient.moveDictory();

		Writer writer = new Writer("text.tmp");
		writer.fileConnect();
		writer.write();

		Reader reader = new Reader("test.tmp");
		reader.fileConnect();
		reader.fileRead();

		reader.fileDisconnect();
		writer.fileDisconnect();
		ftpClient.disConnect();
	}
}
