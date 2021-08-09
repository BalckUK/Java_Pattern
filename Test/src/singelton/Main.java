package singelton;

public class Main {
	public static void main(String[] args) {
		Singelton se1 = Singelton.SEgetInstance();
		Singelton se2 = Singelton.SEgetInstance();
		
		System.out.println(se1);
		System.out.println(se2);
		System.out.println(se1 == se2);
	}
}
