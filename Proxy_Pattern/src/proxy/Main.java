package proxy;

public class Main {
	public static void main(String[] args) {
		Browser browser = new Browser("www.naver.com");
		/*browser.show();
		browser.show();
		browser.show();
		browser.show();
		browser.show();*/
		
		IBrower browser1 = new BrowserProxy("www.naver.com");
		browser1.show();
		browser1.show();
		browser1.show();
		browser1.show();
		browser1.show();
	}
}
