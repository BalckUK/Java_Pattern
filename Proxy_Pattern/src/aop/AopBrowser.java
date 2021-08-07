package aop;

import proxy.Html;
import proxy.IBrower;

public class AopBrowser implements IBrower {

	private String url;
	private Html html;
	private Runnable before;
	private Runnable after;

	public AopBrowser(String url, Runnable before, Runnable after) {
		this.url = url;
		this.before = before;
		this.after = after;
	}

	@Override
	public Html show() {

		before.run();

		if (html == null) {
			this.html = new Html(url);
			System.out.println("AopBorwser html loading from : " + url);
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		after.run();

		System.out.println("AopBrower html cache : " + url);

		return null;
	}

}
