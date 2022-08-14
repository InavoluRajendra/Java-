package com.org.tav.day8.dp;

public class Application {
	
	private Button button;
	private Checkboxes checkbox;
	public Application(GUIFactory factory) {
		super();
		button=factory.createbutton();
		checkbox=factory.createcheckbox();
		
		// TODO Auto-generated constructor stub
	}
	public void paint()
	{
		button.paint();
		checkbox.paint();
	}
	
	
	
	

}
