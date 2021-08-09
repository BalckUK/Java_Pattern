package singelton;

public class Singelton {

	private static Singelton se;

	private Singelton() {

	}
	public static Singelton SEgetInstance() {
		if (se == null) {
			se = new Singelton();
		}
		return se;
	}
}
