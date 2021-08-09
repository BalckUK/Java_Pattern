package facade_true;

import facade_false.Ftp;
import facade_false.Reader;
import facade_false.Writer;

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

		SftpClient sftpClient = new SftpClient("www.naver.com", 22, "/home/etc", "text.tmp");
		sftpClient.connect();
		sftpClient.write();
		sftpClient.read();
		sftpClient.disConnect();
	}
}
