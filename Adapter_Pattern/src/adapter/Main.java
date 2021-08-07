package adapter;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * ���ݰ� ���� ��Ȳ���� ��� ������ ��� �� �� �ִ�
		 * ���� ��Ȳ�� HairDryer�� 110v�� ����ϰ� �־ connect�޼ҵ忡�� 
		 * ��� �� �� �ִ� ������ cleaner�� 220v�� ����Ѵ� �� ���� ���� �ʴ� ��쿡 ����Ѵ� 
		 * */
		
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		Cleaner cleaner = new Cleaner();
		//connect(cleaner);
		Electronic110V apater = new SocketAdapter(cleaner);
		connect(apater);
	}
	
	//�ܼ�Ʈ
	public static void connect(Electronic110V electronic110V) {
		electronic110V.poweron();
	}
}
