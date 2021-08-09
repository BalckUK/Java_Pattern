package observer;

public class Main {
	public static void main(String[] args) {
		Button button = new Button("��ư");
		
		button.addListener(new IButtonListener() {
			
			@Override
			public void clickEvent(String event) {
				System.out.println(event);
			}
		});
		
		button.click("�޽��� ���� 1");
		button.click("�޽��� ���� 2");
		button.click("�޽��� ���� 3");
		button.click("�޽��� ���� 4");
	}
}
