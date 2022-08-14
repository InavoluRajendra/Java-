package com.org.tav.day8.dp;

public class MacosFactory implements GUIFactory {

	@Override
	public Button createbutton() {
		// TODO Auto-generated method stub
		return new MacosButton();
	}

	@Override
	public Checkboxes createcheckbox() {
		// TODO Auto-generated method stub
		return new Macoscheckboxes();
	}

}
