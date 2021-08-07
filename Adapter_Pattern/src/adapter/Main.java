package adapter;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * 지금과 같은 상황에서 어뎁스 패턴을 사용 할 수 있다
		 * 현재 상황은 HairDryer는 110v를 사용하고 있어서 connect메소드에서 
		 * 사용 할 수 있다 하지만 cleaner는 220v를 사용한다 즉 서로 맞지 않는 경우에 사용한다 
		 * */
		
		HairDryer hairDryer = new HairDryer();
		connect(hairDryer);
		
		Cleaner cleaner = new Cleaner();
		//connect(cleaner);
		Electronic110V apater = new SocketAdapter(cleaner);
		connect(apater);
	}
	
	//콘센트
	public static void connect(Electronic110V electronic110V) {
		electronic110V.poweron();
	}
}
